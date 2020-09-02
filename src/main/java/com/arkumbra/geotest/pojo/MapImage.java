package com.arkumbra.geotest.pojo;

import java.math.BigDecimal;

public class MapImage {

  private static String bingMapsApiKey;

  private Location location;
  private Intensity intensity;

  static {
//    System.out.println(System.getenv());
    bingMapsApiKey = System.getenv("BING_MAPS_KEY");
//    System.out.println(System.getProperties());

    if (bingMapsApiKey == null) {
      throw new RuntimeException("Bing Maps API key not found. Set BING_MAPS_KEY environment variable");
    }
  }


  public MapImage(Location location, Intensity intensity) {
    this.location = location;
    this.intensity = intensity;
  }

  public String getMapImageUrl(MapZoom mapZoom) {
    return buildApiUrl(mapZoom);
  }

  private String buildApiUrl(MapZoom mapZoom) {
    // https://dev.virtualearth.net/REST/v1/Imagery/Map/Aerial/37.0,%20138.5/6?pushpin=37.0,%20138.5;1;EQ&key=AnzVztQDoWEspUoq2rCdkpDLVVENsg68q_00bW73kP1A1G1tWw8yJpn1w07dI3GK

    BigDecimal lat = location.getPointOfOrigin().getLatitude();
    BigDecimal lon = location.getPointOfOrigin().getLongitude();

    StringBuilder sb = new StringBuilder();
    sb.append("https://dev.virtualearth.net/REST/v1/Imagery/Map/Aerial/");
    sb.append(lat);
    sb.append(",");
    sb.append(lon);
    sb.append("/");
    sb.append(mapZoom.getZoom());
    sb.append("?pushpin=");
    sb.append(lat);
    sb.append(",");
    sb.append(lon);

    // https://docs.microsoft.com/en-us/bingmaps/rest-services/common-parameters-and-types/pushpin-syntax-and-icon-styles
//    sb.append(";2;EQ"); // pushpin type and label
    sb.append(";35;"); // pushpin type
    sb.append(intensity.getType().getTypeLabel() + intensity.getIntensityValue());

    sb.append("&key=");
    sb.append(bingMapsApiKey);
    return sb.toString();
  }


  public static enum MapZoom {
    LOW(5),
    MEDIUM(6),
    HIGH(7),
    ;

    private int zoom;

    MapZoom(int zoom) {
      this.zoom = zoom;
    }

    public int getZoom() {
      return zoom;
    }
  }


}

