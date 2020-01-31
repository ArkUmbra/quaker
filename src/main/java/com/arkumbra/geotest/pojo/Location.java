package com.arkumbra.geotest.pojo;

public class Location {

  private final Origin origin;
  private final String region;
  private final String country;

  public Location(Origin origin, String region, String country) {
    this.origin = origin;
    this.region = region;
    this.country = country;
  }

  public Origin getOrigin() {
    return origin;
  }

  public String getRegion() {
    return region;
  }

  public String getCountry() {
    return country;
  }
}
