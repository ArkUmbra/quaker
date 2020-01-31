package com.arkumbra.geotest.jma;

import com.arkumbra.geotest.jma.extendedgen.SeismicReport;
import com.arkumbra.geotest.pojo.Earthquake;
import com.arkumbra.geotest.pojo.Intensity;
import com.arkumbra.geotest.pojo.Issuer;
import com.arkumbra.geotest.pojo.Origin;
import com.arkumbra.geotest.pojo.Location;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jp.go.kishou.xml.jmaxml1.body.seismology1.TypeBody;

public class EarthquakeFactory {

  public static Earthquake createEarthquake(SeismicReport jmaSeismicReport) {
    List<Intensity> intensities = new ArrayList<>();

    TypeBody body = jmaSeismicReport.getBody();
    String hypocentreDatum = body.getEarthquake().get(0).getHypocenter().getArea().getCoordinate().get(0).getDatum().value();


    Location location = new Location(
        hypocentreDatumToLatLon(hypocentreDatum),
        null,
        null
    );
    Issuer issuer = new Issuer(
        Issuer.IssuerType.JMA,
        jmaSeismicReport.getHead().getEventID() // TODO check if this is correct id
    );

    Earthquake eq = new Earthquake(intensities, location, issuer);
    return eq;
  }

  // "北緯３７．０度　東経１４１．４度　深さ　５０ｋｍ" datum="日本測地系"
  // +37.0+141.4-50000/
//  static String DATUM_SPLIT_REGEX = "¥+|-";
  static String DATUM_SPLIT_REGEX = "[+-]";
  static public final String WITH_DELIMITER = "(?=%1$s)";
  /*
   Splits +37.0+141.4-50000/ into
   0 =
   1 = 37.0
   2 = 141.4
   3 = -50000

    Not perfect, but hey...
   */
  static public final String RETAIN_MINUSES = "((?=[-]))|[+/]";

  public static Origin hypocentreDatumToLatLon(String hypocentreDatum) {
//    String[] splits = hypocentreDatum.split(DATUM_SPLIT_REGEX);
//    String[] splits = hypocentreDatum.split(String.format(WITH_DELIMITER, DATUM_SPLIT_REGEX));
    String[] splits = hypocentreDatum.split(RETAIN_MINUSES);

    BigDecimal lat = new BigDecimal(splits[1]);
    BigDecimal lon = new BigDecimal(splits[2]);
    BigDecimal depthRaw = new BigDecimal(splits[3]); // negate the minus
    BigDecimal depthNegated = depthRaw.negate();// negate the minus

    return new Origin(lat, lon, depthNegated);
  }


}
