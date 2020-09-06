package com.arkumbra.geotest.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class NullIntensity extends Intensity {

  public NullIntensity() {
    super(MeasurementType.NOT_MEASURED, BigDecimal.ZERO, false, new Date());
  }
}
