package com.arkumbra.geotest.pojo;

import java.math.BigDecimal;

public class Origin {

  private final BigDecimal latitude;
  private final BigDecimal longitude;
  private final BigDecimal depth;

  public Origin(BigDecimal latitude, BigDecimal longitude, BigDecimal depth) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.depth = depth;
  }


  public BigDecimal getLatitude() {
    return latitude;
  }

  public BigDecimal getLongitude() {
    return longitude;
  }

  public BigDecimal getDepth() {
    return depth;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Origin{");
    sb.append("latitude=").append(latitude);
    sb.append(", longitude=").append(longitude);
    sb.append(", depth=").append(depth);
    sb.append('}');
    return sb.toString();
  }

}
