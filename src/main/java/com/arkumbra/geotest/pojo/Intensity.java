package com.arkumbra.geotest.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Intensity {

  public enum MeasurementType {
    MAGNITUDE("M"),
    SHINDO("震度"),
    ;

    private String typeLabel;
    MeasurementType(String typeLabel) {
      this.typeLabel = typeLabel;
    }

    public String getTypeLabel() {
      return typeLabel;
    }
  }

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

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Intensity{");
    sb.append("type=").append(type);
    sb.append(", intensityValue=").append(intensityValue);
    sb.append(", wasRevised=").append(wasRevised);
    sb.append(", revisionDate=").append(revisionDate);
    sb.append('}');
    return sb.toString();
  }
}


