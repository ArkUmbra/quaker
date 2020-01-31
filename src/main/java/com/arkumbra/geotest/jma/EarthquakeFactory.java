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

  /*
   Splits +37.0+141.4-50000/ into
   0 = 37.0
   1 = 141.4
   2 = -50000

   i.e. splits on - or + and retains the character, and then splits/discards the trailing slash
  */
  private static final String REGEX_SPLIT_DATUM_RETAIN_SIGN = "((?=[-]))|((?=[+])|/)";


  public static Earthquake createEarthquake(SeismicReport jmaSeismicReport) {
    List<Intensity> intensities = new ArrayList<>();

    TypeBody body = jmaSeismicReport.getBody();
    String hypocentreDatum = body.getEarthquake().get(0).getHypocenter().getArea().getCoordinate().get(0).getDatum().value();


    Location location = new Location(
            hypocentreDatumToOrigin(hypocentreDatum),
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

  /*
    Splits up a hypocentre datum string into an Origin object.
    JMA string format is as follows:
    +37.0+141.4-50000/
   */
  public static Origin hypocentreDatumToOrigin(String hypocentreDatum) {
    String[] splits = hypocentreDatum.split(REGEX_SPLIT_DATUM_RETAIN_SIGN);

    BigDecimal lat = new BigDecimal(splits[0]);
    BigDecimal lon = new BigDecimal(splits[1]);
    BigDecimal depthRaw = new BigDecimal(splits[2]); // negate the minus
    BigDecimal depthNegated = depthRaw.negate();// negate the minus

    return new Origin(lat, lon, depthNegated);
  }


}
