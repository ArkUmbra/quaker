package com.arkumbra.geotest;

import static org.junit.Assert.assertEquals;

import com.arkumbra.geotest.jma.EarthquakeFactory;
import com.arkumbra.geotest.jma.JmaService;
import com.arkumbra.geotest.jma.extendedgen.SeismicReport;
import com.arkumbra.geotest.jma.xml.Entry;
import com.arkumbra.geotest.jma.xml.EventType;
import com.arkumbra.geotest.jma.xml.Feed;
import com.arkumbra.geotest.pojo.PointOfOrigin;
import com.arkumbra.geotest.usgs.json.Feature;
import com.arkumbra.geotest.usgs.json.SummaryResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import java.math.BigDecimal;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.nio.charset.Charset;

public class GeoTest {

    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
        objectMapper = new ObjectMapper();

        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
    }

    /* usgs data */
    @Test
    public void testUsgsGetRecentEqDataAndSaveIfNew() throws JsonProcessingException {
        String url = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        SummaryResponse body = objectMapper.readValue(response.getBody(), SummaryResponse.class);

        MongoClient mongoClient = MongoClients.create();
        MongoDatabase db = mongoClient.getDatabase("test");

        MongoCollection<Document> collection = db.getCollection("eqs");
        System.out.println("Current eqs recorded : " + collection.countDocuments());

        System.out.println(body.features.size() + " earthquakes in last hour");
        for (Feature feature : body.features) {
            Document doc = Document.parse(objectMapper.writeValueAsString(feature));

            long matches = collection.countDocuments(createIdFilter(feature.id));

            if (matches == 0) {
                System.out.println("Inserting " + doc.toJson());
                collection.insertOne(doc);
            }
        }
    }

    private Bson createIdFilter(String id) {
        return Filters.eq("id", id);
    }

    // http://www.j-shis.bosai.go.jp/map/api/pshm/version/case/eqcode/meshinfo.format?position=position&epsg=epsg&options
    // http://www.j-shis.bosai.go.jp/map/api/pshm/Y2019/MAX/TTL_MTTL/meshinfo.geojson?position=position&epsg=epsg&options
    // http://www.j-shis.bosai.go.jp/map/api/pshm/Y2010/MAX/TTL_MTTL/meshinfo.geojson?meshcode=5440008644N&attr=T30_I45_PS

    @Test
    public void testJshisEarthquakeApi() {


    }

    @Test
    public void testJmaEarthquakeApiViaService() throws UnsupportedEncodingException, FileNotFoundException, JAXBException, JsonProcessingException {
        JmaService jmaService = new JmaService();

        jmaService.pullLatestLongFormFeedForEarthquakes();
    }

    @Test
    public void testJmaEarthquakeApi() throws UnsupportedEncodingException, FileNotFoundException, JAXBException {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

        String url = "http://www.data.jma.go.jp/developer/xml/feed/eqvol_l.xml";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String xml = response.getBody();
//        System.out.println(xml);

        JAXBContext context = JAXBContext.newInstance(Feed.class);
        Unmarshaller um = context.createUnmarshaller();
//        um.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());

        Feed feed = (Feed) um.unmarshal(new StreamSource(new ByteArrayInputStream(xml.getBytes("UTF-8"))));


        for (Entry entry : feed.entry) {
            pullSpecificJmaFeed(entry.link.getHref(), entry.getEventType());
        }

//        System.out.println(feed);
//        System.out.println(categories);
    }

    private void pullSpecificJmaFeed(String url, EventType eventType) throws JAXBException, UnsupportedEncodingException {
        switch (eventType) {
            case Hypocentre:
            case SeismicIntensity:
            case IntensityHypocentre:
                SeismicReport report = pullJmaItem(url, SeismicReport.class);
                break;

            case EruptionObservations:
            case Volcano:
            case VolcanicAshForecastDetailed:
            case VolcanicAshForecastPeriodic:
            case VolcanicAshForecastEarlyReport:
//                System.out.println("Skipping for " + eventType);
                break;
            default: System.out.println("Unknown type " + eventType);
        }

    }

    private <T> T pullJmaItem(String url, Class<T> clazz) throws JAXBException, UnsupportedEncodingException {
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String xml = response.getBody();
        System.out.println(xml);

        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller um = context.createUnmarshaller();
//        um.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());

        JAXBElement<T> unmarshalled = um.unmarshal(new StreamSource(new ByteArrayInputStream(xml.getBytes("UTF-8"))),
                clazz);
//        System.out.println(unmarshalled.getValue());
        return unmarshalled.getValue();
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

