package com.arkumbra.geotest.pojo;

public class Location {

  private final PointOfOrigin pointOfOrigin;
  private final String region;
  private final String country;

  public Location(PointOfOrigin pointOfOrigin, String region, String country) {
    this.pointOfOrigin = pointOfOrigin;
    this.region = region;
    this.country = country;
  }

  public PointOfOrigin getPointOfOrigin() {
    return pointOfOrigin;
  }

  public String getRegion() {
    return region;
  }

  public String getCountry() {
    return country;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Location{");
    sb.append("origin=").append(pointOfOrigin);
    sb.append(", region='").append(region).append('\'');
    sb.append(", country='").append(country).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
