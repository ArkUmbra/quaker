package com.arkumbra.geotest.usgs.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
    public String mag;
    public String place;
    public long time;
    public long updated;
    public long tz;
    public String url;
    public int tsunami;
    public String type;
    public String title;
}
