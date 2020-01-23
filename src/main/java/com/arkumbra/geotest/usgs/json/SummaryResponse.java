package com.arkumbra.geotest.usgs.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryResponse {
    public String type;
//    public String metaData;
    public List<Feature> features;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public String getMetaData() {
//        return metaData;
//    }
//
//    public void setMetaData(String metaData) {
//        this.metaData = metaData;
//    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
