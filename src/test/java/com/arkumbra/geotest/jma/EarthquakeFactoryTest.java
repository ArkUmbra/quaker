package com.arkumbra.geotest.jma;

import com.arkumbra.geotest.jma.extendedgen.SeismicReport;
import com.arkumbra.geotest.pojo.Earthquake;
import java.io.UnsupportedEncodingException;
import javax.xml.bind.JAXBException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

public class EarthquakeFactoryTest {

  private JmaService jmaService;

  @Before
  public void setUp() throws JAXBException, UnsupportedEncodingException {
    this.jmaService = new JmaService();
  }

  @Test
  public void testPullingAndConvertingEqReport()
          throws JAXBException, UnsupportedEncodingException, JsonProcessingException {
    String url = "http://www.data.jma.go.jp/developer/xml/data/48a41dbf-d71a-327f-bfab-f02faba6811e.xml";

    SeismicReport seismicReport = jmaService.pullJmaItem(url, SeismicReport.class);

    Earthquake eq = EarthquakeFactory.createEarthquake(seismicReport, url);
    System.out.println(new ObjectMapper().writeValueAsString(eq));
  }

  @Test
  public void testPullingAndConvertingEqReportWithNoShindoInfo()
          throws JAXBException, UnsupportedEncodingException, JsonProcessingException {
    String url = "http://www.data.jma.go.jp/developer/xml/data/fa8da1ad-00af-300a-b97c-aa6bcf271206.xml";

    SeismicReport seismicReport = jmaService.pullJmaItem(url, SeismicReport.class);

    Earthquake eq = EarthquakeFactory.createEarthquake(seismicReport, url);
    System.out.println(new ObjectMapper().writeValueAsString(eq));
  }

}
