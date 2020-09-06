package com.arkumbra.geotest;

import static org.junit.Assert.assertEquals;

import com.arkumbra.geotest.jma.EarthquakeFactory;
import com.arkumbra.geotest.jma.JmaService;
import com.arkumbra.geotest.pojo.Earthquake;
import com.arkumbra.geotest.pojo.PointOfOrigin;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.math.BigDecimal;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.*;


public class GeoTest {

    @Ignore("Ignored for CI")
    @Test
    public void testJmaEarthquakeApiViaService() throws UnsupportedEncodingException, JAXBException, JsonProcessingException {
        JmaService jmaService = new JmaService();

        List<Earthquake> earthquakes = jmaService.pullLatestLongFormFeedForEarthquakes();

        earthquakes.forEach(System.out::println);
    }

    @Test
    public void jmaHypocentreDatumSplitTest() {
        String datum = "+37.0+141.4-50000/";

        PointOfOrigin pointOfOrigin = EarthquakeFactory.hypocentreDatumToOrigin(datum);
        System.out.println(pointOfOrigin);
        assertEquals(new BigDecimal("37.0"), pointOfOrigin.getLatitude());
        assertEquals(new BigDecimal("141.4"), pointOfOrigin.getLongitude());
        assertEquals(new BigDecimal("50000"), pointOfOrigin.getDepth());


        datum = "+37.0-141.4-50000/";
        pointOfOrigin = EarthquakeFactory.hypocentreDatumToOrigin(datum);
        System.out.println(pointOfOrigin);
        assertEquals(new BigDecimal("37.0"), pointOfOrigin.getLatitude());
        assertEquals(new BigDecimal("-141.4"), pointOfOrigin.getLongitude());
        assertEquals(new BigDecimal("50000"), pointOfOrigin.getDepth());


        datum = "-37.0-141.4-50000/";
        pointOfOrigin = EarthquakeFactory.hypocentreDatumToOrigin(datum);
        System.out.println(pointOfOrigin);
        assertEquals(new BigDecimal("-37.0"), pointOfOrigin.getLatitude());
        assertEquals(new BigDecimal("-141.4"), pointOfOrigin.getLongitude());
        assertEquals(new BigDecimal("50000"), pointOfOrigin.getDepth());
    }

}

