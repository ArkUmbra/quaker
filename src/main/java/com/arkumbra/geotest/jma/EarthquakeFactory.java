package com.arkumbra.geotest.jma;

import com.arkumbra.geotest.jma.extendedgen.SeismicReport;
import com.arkumbra.geotest.pojo.CurrentlyUnknownPointOfPointOfOrigin;
import com.arkumbra.geotest.pojo.Earthquake;
import com.arkumbra.geotest.pojo.Intensity;
import com.arkumbra.geotest.pojo.Intensity.MeasurementType;
import com.arkumbra.geotest.pojo.Issuer;
import com.arkumbra.geotest.pojo.NullIntensity;
import com.arkumbra.geotest.pojo.PointOfOrigin;
import com.arkumbra.geotest.pojo.Location;
import com.arkumbra.geotest.utils.ListUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jp.go.kishou.xml.jmaxml1.body.seismology1.TypeBody;
import jp.go.kishou.xml.jmaxml1.body.seismology1.TypeEarthquake;
import jp.go.kishou.xml.jmaxml1.body.seismology1.TypeHypoArea;
import jp.go.kishou.xml.jmaxml1.body.seismology1.TypeHypocenter;
import jp.go.kishou.xml.jmaxml1.body.seismology1.TypeIntensity;
import jp.go.kishou.xml.jmaxml1.body.seismology1.TypeIntensityDetail;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;

public class EarthquakeFactory {
  private static final ObjectMapper objectMapper = new ObjectMapper();

  /*
   Splits +37.0+141.4-50000/ into
   0 = 37.0
   1 = 141.4
   2 = -50000

   i.e. splits on - or + and retains the character, and then splits/discards the trailing slash
  */
  private static final String REGEX_SPLIT_DATUM_RETAIN_SIGN = "((?=[-]))|((?=[+])|/)";
  private static final String COUNTRY_JAPAN = "Japan";


  public static Earthquake createEarthquake(SeismicReport jmaSeismicReport, String sourceUrl) throws JsonProcessingException {
    TypeBody body = jmaSeismicReport.getBody();
    if (ListUtils.isEmpty(body.getEarthquake())) {
      System.err.println("No earthquake data included on seismic report... "
              + objectMapper.writeValueAsString(jmaSeismicReport));
      return null;
    }

    List<Intensity> intensities = new ArrayList<>();
    Intensity intensityShindo = extractIntensityShindo(body);
    if (intensityShindo != null) {
      intensities.add(intensityShindo);
    }

    Intensity intensityMagnitude = extractIntensityMagnitude(body);
    intensities.add(intensityMagnitude);

    Location location = new Location(
        extractEqOrgin(body),
        body.getEarthquake().get(0).getHypocenter().getArea().getName(),
        COUNTRY_JAPAN
    );
    Issuer issuer = new Issuer(
        Issuer.IssuerType.JMA,
        jmaSeismicReport.getHead().getEventID(), // TODO check if this is correct id
        sourceUrl
    );

    Earthquake eq = new Earthquake(intensities, location, issuer);
    return eq;
  }


  private static Intensity extractIntensityShindo(TypeBody body) {
    TypeIntensity intensity = body.getIntensity();
    if (intensity == null) {
      System.err.println("No intensity found for ...");
      return null;
    }
    TypeIntensityDetail observation = intensity.getObservation();
    if (observation == null) {
      System.err.println("No observation found for ...");
      return null;
    }
    String maxShindoObserved = observation.getMaxInt();

    if (maxShindoObserved.matches("^\\d+$")) {
      return new Intensity(
          MeasurementType.SHINDO,
          new BigDecimal(maxShindoObserved),
          false,
          null
      );
    } else {
      return new NullIntensity();
    }


  }
  private static Intensity extractIntensityMagnitude(TypeBody body) {
    return new Intensity(
        MeasurementType.MAGNITUDE,
            new BigDecimal(body.getEarthquake().get(0).getMagnitude().get(0).getValue()),
        false,
        null
    );
  }

  private static PointOfOrigin extractEqOrgin(TypeBody body) {
    String hypocentre = extractHypocentreValue(body);

    if (hypocentre == null) {
      return new CurrentlyUnknownPointOfPointOfOrigin();

    } else {
      return hypocentreDatumToOrigin(hypocentre);
    }
  }

  private static String extractHypocentreValue(TypeBody body) {
    List<TypeEarthquake> eqs = body.getEarthquake();
    if (eqs == null) {
      return null;
    }
    TypeEarthquake eq = eqs.get(0);
    TypeHypocenter hypocenter = eq.getHypocenter();
    TypeHypoArea typeArea = hypocenter.getArea();
    List<TypeCoordinate> typeCoordinates = typeArea.getCoordinate();
    TypeCoordinate typeCoordinate = typeCoordinates.get(0);
    return typeCoordinate.getValue();
  }

  /*
    Splits up a hypocentre datum string into an Origin object.
    JMA string format is as follows:
    +37.0+141.4-50000/
   */
  public static PointOfOrigin hypocentreDatumToOrigin(String hypocentreDatum) {
//    System.out.println("Splitting " + hypocentreDatum);
    String[] splits = hypocentreDatum.split(REGEX_SPLIT_DATUM_RETAIN_SIGN);
//    System.out.println(Arrays.toString(splits));

    BigDecimal lat = new BigDecimal(splits[0]);
    BigDecimal lon = new BigDecimal(splits[1]);
    BigDecimal depthNegated;
    if (splits.length == 3) {
      BigDecimal depthRaw = new BigDecimal(splits[2]); // negate the minus
      depthNegated = depthRaw.negate();// negate the minus
    } else {
      depthNegated = null;
    }

    return new PointOfOrigin(lat, lon, depthNegated);
  }


}
