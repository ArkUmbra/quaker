package com.arkumbra.geotest.jma;

import com.arkumbra.geotest.jma.extendedgen.SeismicReport;
import com.arkumbra.geotest.pojo.Earthquake;
import com.arkumbra.geotest.jma.xml.Entry;
import com.arkumbra.geotest.jma.xml.EventType;
import com.arkumbra.geotest.jma.xml.Feed;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

public class JmaService {

  private static final String JMA_UPDATE_LONGFORM = "http://www.data.jma.go.jp/developer/xml/feed/eqvol_l.xml";
  private static final boolean strictDebugMarshalling = false;

  private static final List<EventType> EARTHQUAKE_EVENT_TYPES = new ArrayList<>();

  private RestTemplate restTemplate;
  private Jaxb2Marshaller marshaller;


  public JmaService() throws JAXBException, UnsupportedEncodingException {
    restTemplate = new RestTemplate();
    Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
    restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

    EARTHQUAKE_EVENT_TYPES.add(EventType.Hypocentre);
    EARTHQUAKE_EVENT_TYPES.add(EventType.SeismicIntensity);
    EARTHQUAKE_EVENT_TYPES.add(EventType.IntensityHypocentre);
  }

  public List<Earthquake> pullLatestLongFormFeedForEarthquakes() throws JAXBException, UnsupportedEncodingException {
    List<Earthquake> earthquakes = new ArrayList<>();


    Feed feed = pullJmaItem(JMA_UPDATE_LONGFORM, Feed.class);

    for (Entry entry : feed.entry) {
      String url = entry.link.getHref();
      EventType eventType = EventType.convert(entry.title);

      switch (eventType) {
        case Hypocentre:
        case SeismicIntensity:
        case IntensityHypocentre:
          SeismicReport report = pullJmaItem(url, SeismicReport.class);
          Earthquake eq = EarthquakeFactory.createEarthquake(report);
          earthquakes.add(eq);
      }
//      if (EARTHQUAKE_EVENT_TYPES.contains(EventType.convert(entry.title))) {
//        pullSpecificJmaFeed(entry.link.getHref(), entry.getEventType());
//      }
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

  private <T> T pullJmaItem(String url, Class<T> clazz) throws JAXBException, UnsupportedEncodingException {
    ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
    String xml = response.getBody();
//    System.out.println(xml);

    Unmarshaller um = createUnmarshaller(clazz);

    JAXBElement<T> unmarshalled = um.unmarshal(new StreamSource(new ByteArrayInputStream(xml.getBytes("UTF-8"))), clazz);
//        System.out.println(unmarshalled.getValue());
    return unmarshalled.getValue();
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
