package com.arkumbra.geotest.jma;

import com.arkumbra.geotest.jma.extendedgen.SeismicReport;
import com.arkumbra.geotest.pojo.Earthquake;
import com.arkumbra.geotest.jma.xml.Entry;
import com.arkumbra.geotest.jma.xml.EventType;
import com.arkumbra.geotest.jma.xml.Feed;
import com.arkumbra.geotest.pojo.MapImage.MapZoom;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;

import com.fasterxml.jackson.core.JsonProcessingException;


public class JmaService {

  private static final String JMA_UPDATE_LONGFORM = "http://www.data.jma.go.jp/developer/xml/feed/eqvol_l.xml";
  private static final boolean strictDebugMarshalling = false;

  private static final List<EventType> EARTHQUAKE_EVENT_TYPES = new ArrayList<>();



  public JmaService() throws JAXBException, UnsupportedEncodingException {
    EARTHQUAKE_EVENT_TYPES.add(EventType.Hypocentre);
    EARTHQUAKE_EVENT_TYPES.add(EventType.SeismicIntensity);
    EARTHQUAKE_EVENT_TYPES.add(EventType.IntensityHypocentre);
  }

  public List<Earthquake> pullLatestLongFormFeedForEarthquakes() throws JAXBException, UnsupportedEncodingException, JsonProcessingException {
    List<Earthquake> earthquakes = new ArrayList<>();


    Feed feed = pullJmaItem(JMA_UPDATE_LONGFORM, Feed.class);
    System.out.println("Pulled feed");

    for (Entry entry : feed.entry) {
      String url = entry.link.getHref();
      EventType eventType = EventType.convert(entry.title);


      switch (eventType) {
        case Hypocentre:
        case SeismicIntensity:
        case IntensityHypocentre:
          SeismicReport report = pullJmaItem(url, SeismicReport.class);
          Earthquake eq = EarthquakeFactory.createEarthquake(report, url);
          if (eq != null) {
            XMLGregorianCalendar date = report.getHead().getReportDateTime();
            System.out.println(date + ", " + eq.getLocation().toString());
            System.out.println(eq.getMapImage().getMapImageUrl(MapZoom.MEDIUM));
            earthquakes.add(eq);
          }
      }
    }

    return earthquakes;
  }

  private Unmarshaller createUnmarshaller(Class clazz) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(clazz);
    Unmarshaller um = context.createUnmarshaller();
    if (strictDebugMarshalling) {
      um.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());
    }
    return um;
  }

  public <T> T pullJmaItem(String url, Class<T> clazz) throws JAXBException, UnsupportedEncodingException {
    String xmlBody = doGetRequest(url);

    Unmarshaller um = createUnmarshaller(clazz);

    JAXBElement<T> unmarshalled = um.unmarshal(new StreamSource(new ByteArrayInputStream(xmlBody.getBytes("UTF-8"))), clazz);
    return unmarshalled.getValue();
  }

  private String doGetRequest(String url) {
//    ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//    String xml = response.getBody();

//    InputStream is = new URL(url).openStream();
    try (InputStream is = new URL(url).openStream()) {
      BufferedReader in = new BufferedReader(new InputStreamReader(is));
      return in.lines().collect(Collectors.joining());

    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
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

}
