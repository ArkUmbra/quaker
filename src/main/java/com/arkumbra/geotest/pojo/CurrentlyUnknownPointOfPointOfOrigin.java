package com.arkumbra.geotest.pojo;

import java.math.BigDecimal;

public class CurrentlyUnknownPointOfPointOfOrigin extends PointOfOrigin {

  public CurrentlyUnknownPointOfPointOfOrigin() {
    super(null, null, null);
  }


  @Override
  public BigDecimal getLatitude() {
    return null;
  }

  @Override
  public BigDecimal getLongitude() {
    return null;
  }

  @Override
  public BigDecimal getDepth() {
    return null;
  }
}
