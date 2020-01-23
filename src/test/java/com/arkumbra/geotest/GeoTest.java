package com.arkumbra.geotest;

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
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

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
    public void test() throws JsonProcessingException {
        String url = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

//        System.out.println(response.getBody());
        SummaryResponse body = objectMapper.readValue(response.getBody(), SummaryResponse.class);
//        System.out.println(body);
//        System.out.println(body.type);

        MongoClient mongoClient = MongoClients.create();
        MongoDatabase db = mongoClient.getDatabase("test");

        MongoCollection<Document> collection = db.getCollection("eqs");
        System.out.println("Current eqs recorded : " + collection.countDocuments());

        for (Feature feature : body.features) {
            Document doc = Document.parse(objectMapper.writeValueAsString(feature));

//            FindIterable<Document> result = collection.find(createIdFilter(feature.id));

            long matches = collection.countDocuments(createIdFilter(feature.id));
//            System.out.println("Found " + matches + " results for id " + feature.id);

            if (matches == 0) {
                System.out.println("Inserting " + doc.toJson());
                collection.insertOne(doc);
            }


        }



/*        MongoCollection<Document> collection = db.getCollection("summaryresponse");

        System.out.println("Current items : " + collection.countDocuments());
        //BasicDBObject obj = BasicDBObject.parse(objectMapper.writeValueAsString(body));
        Document doc = Document.parse(objectMapper.writeValueAsString(body));
        collection.insertOne(doc);
*/
    }

    private Bson createIdFilter(String id) {
        return Filters.eq("id", id);
    }



    @Test
    public void testOther() {
        String url = "http://p2pquake.ddo.jp/p2pquake/api_userquake.pl?date=01/15";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        System.out.println(response.getBody());

    }
}
