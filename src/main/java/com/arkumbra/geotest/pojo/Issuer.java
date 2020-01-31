package com.arkumbra.geotest.pojo;

public class Issuer {
  public enum IssuerType {
    JMA,
    USGS
  }

  private final IssuerType issuer;
  private final String idGivenByIssuer;
  private final String sourceUrl;

  public Issuer(IssuerType issuer, String idGivenByIssuer, String sourceUrl) {
    this.issuer = issuer;
    this.idGivenByIssuer = idGivenByIssuer;
    this.sourceUrl = sourceUrl;
  }

  public IssuerType getIssuer() {
    return issuer;
  }

  public String getIdGivenByIssuer() {
    return idGivenByIssuer;
  }

  public String getSourceUrl() {
    return sourceUrl;
  }

  @Override
  public String toString() {
    return "Issuer{" +
            "issuer=" + issuer +
            ", idGivenByIssuer='" + idGivenByIssuer + '\'' +
            ", sourceUrl='" + sourceUrl + '\'' +
            '}';
  }
}


