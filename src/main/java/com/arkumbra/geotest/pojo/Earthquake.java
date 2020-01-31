package com.arkumbra.geotest.pojo;

import java.util.List;

public class Earthquake {

  private List<Intensity> intensity;
  private Location location;
  private Issuer issuer;

  public Earthquake(List<Intensity> intensity, Location location,
      Issuer issuer) {
    this.intensity = intensity;
    this.location = location;
    this.issuer = issuer;
  }

  public List<Intensity> getIntensity() {
    return intensity;
  }

  public Location getLocation() {
    return location;
  }

  public Issuer getIssuer() {
    return issuer;
  }


}
