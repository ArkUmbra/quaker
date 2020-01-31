package com.arkumbra.geotest.jma;

import com.arkumbra.geotest.pojo.Earthquake;
import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.xml.bind.JAXBException;
import org.junit.Before;
import org.junit.Test;

public class JmaServiceTest {

  private JmaService jmaService;

  @Before
  public void setUp() throws JAXBException, UnsupportedEncodingException {
    this.jmaService = new JmaService();
  }

  @Test
  public void testPullingEarthquakeUpdatesAndConverting()
      throws JAXBException, UnsupportedEncodingException {
    List<Earthquake> eqs = jmaService.pullLatestLongFormFeedForEarthquakes();

    System.out.println(eqs);
  }

}
