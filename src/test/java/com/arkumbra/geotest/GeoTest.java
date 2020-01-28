package com.arkumbra.geotest;

import com.arkumbra.geotest.jma.xml.Entry;
import com.arkumbra.geotest.jma.xml.EventType;
import com.arkumbra.geotest.jma.xml.Feed;
import com.arkumbra.geotest.jma.xml.Root;
import com.arkumbra.geotest.usgs.json.Feature;
import com.arkumbra.geotest.usgs.json.SummaryResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.standard.MediaSize;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeoTest {

    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
        objectMapper = new ObjectMapper();
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
    public void testJmaEarthquakeApi() throws UnsupportedEncodingException, FileNotFoundException {
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        String url = "http://www.data.jma.go.jp/developer/xml/feed/eqvol.xml";


        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        System.out.println(response.getHeaders());
        System.out.println(response.getBody());

        System.out.println(new String("地震テスト".getBytes("UTF-8")));

        PrintWriter file = new PrintWriter("eq.txt");
        file.println(response.getBody());
    }

    @Test
    public void testJmaEarthquakeApi_UnmarshalXml() throws UnsupportedEncodingException, FileNotFoundException {
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

        String url = "http://www.data.jma.go.jp/developer/xml/feed/eqvol.xml";


        Feed feed = restTemplate.getForObject(url, Feed.class);

        System.out.println(feed);
        System.out.println(feed.getTitle());
    }

    @Test
    public void testJmaEarthquakeApi_UnmarshalXmlOneLayerUp() throws UnsupportedEncodingException, FileNotFoundException {
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        String url = "http://www.data.jma.go.jp/developer/xml/feed/eqvol.xml";


        Root root = restTemplate.getForObject(url, Root.class);

        System.out.println(root);
    }


    @Test
    public void testJmaEarthquakeApi_UnmarshalXml2() throws UnsupportedEncodingException, FileNotFoundException, JAXBException {
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

        System.out.println(feed);
//        System.out.println(categories);
    }

    private void pullSpecificJmaFeed(String url, EventType eventType) {

        if (eventType == EventType.IntensityHypocentre) {

        }

    }

//    view-source:http://xml.kishou.go.jp/jmaxml1/body/seismology1/jmx_seis.xsd


}

@XmlRootElement(name="link", namespace="http://www.w3.org/2005/Atom")
class Report {

}
