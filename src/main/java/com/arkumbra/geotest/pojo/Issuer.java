package com.arkumbra.geotest.pojo;

public class Issuer {
  public enum IssuerType {
    JMA,
    USGS
  }

  private final IssuerType issuer;
  private final String idGivenByIssuer;

  public Issuer(IssuerType issuer, String idGivenByIssuer) {
    this.issuer = issuer;
    this.idGivenByIssuer = idGivenByIssuer;
  }

  public IssuerType getIssuer() {
    return issuer;
  }

  public String getIdGivenByIssuer() {
    return idGivenByIssuer;
  }
}


