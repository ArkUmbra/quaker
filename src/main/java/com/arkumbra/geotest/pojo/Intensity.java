package com.arkumbra.geotest.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Intensity {

  private final MeasurementType type;
  private final BigDecimal intensityValue;
  private final boolean wasRevised;
  private final Date revisionDate;

  public Intensity(MeasurementType type, BigDecimal intensityValue, boolean wasRevised,
      Date revisionDate) {
    this.type = type;
    this.intensityValue = intensityValue;
    this.wasRevised = wasRevised;
    this.revisionDate = revisionDate;
  }

  public MeasurementType getType() {
    return type;
  }

  public BigDecimal getIntensityValue() {
    return intensityValue;
  }

  public boolean wasRevised() {
    return wasRevised;
  }

  public Date getRevisionDate() {
    return revisionDate;
  }
}

enum MeasurementType {
  MAGNITUDE,
  SHINDO
}
