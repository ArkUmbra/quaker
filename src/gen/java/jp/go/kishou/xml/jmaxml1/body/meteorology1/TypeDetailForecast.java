
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.DetailForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.DetailForecast"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WeatherForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WeatherForecastPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrecipitationForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PrecipitationPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SnowfallDepthForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SnowfallDepthPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WindForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WindForecastPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WaveHeightForecastPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WaveHeightForecastPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.DetailForecast", propOrder = {
    "weatherForecastPart",
    "precipitationForecastPart",
    "snowfallDepthForecastPart",
    "windForecastPart",
    "waveHeightForecastPart"
})
public class TypeDetailForecast {

    @XmlElement(name = "WeatherForecastPart")
    protected List<TypeWeatherForecastPart> weatherForecastPart;
    @XmlElement(name = "PrecipitationForecastPart")
    protected List<TypePrecipitationPart> precipitationForecastPart;
    @XmlElement(name = "SnowfallDepthForecastPart")
    protected List<TypeSnowfallDepthPart> snowfallDepthForecastPart;
    @XmlElement(name = "WindForecastPart")
    protected List<TypeWindForecastPart> windForecastPart;
    @XmlElement(name = "WaveHeightForecastPart")
    protected List<TypeWaveHeightForecastPart> waveHeightForecastPart;

    /**
     * Gets the value of the weatherForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weatherForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWeatherForecastPart }
     * 
     * 
     */
    public List<TypeWeatherForecastPart> getWeatherForecastPart() {
        if (weatherForecastPart == null) {
            weatherForecastPart = new ArrayList<TypeWeatherForecastPart>();
        }
        return this.weatherForecastPart;
    }

    /**
     * Gets the value of the precipitationForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precipitationForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecipitationForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePrecipitationPart }
     * 
     * 
     */
    public List<TypePrecipitationPart> getPrecipitationForecastPart() {
        if (precipitationForecastPart == null) {
            precipitationForecastPart = new ArrayList<TypePrecipitationPart>();
        }
        return this.precipitationForecastPart;
    }

    /**
     * Gets the value of the snowfallDepthForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snowfallDepthForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnowfallDepthForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSnowfallDepthPart }
     * 
     * 
     */
    public List<TypeSnowfallDepthPart> getSnowfallDepthForecastPart() {
        if (snowfallDepthForecastPart == null) {
            snowfallDepthForecastPart = new ArrayList<TypeSnowfallDepthPart>();
        }
        return this.snowfallDepthForecastPart;
    }

    /**
     * Gets the value of the windForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindForecastPart }
     * 
     * 
     */
    public List<TypeWindForecastPart> getWindForecastPart() {
        if (windForecastPart == null) {
            windForecastPart = new ArrayList<TypeWindForecastPart>();
        }
        return this.windForecastPart;
    }

    /**
     * Gets the value of the waveHeightForecastPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waveHeightForecastPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaveHeightForecastPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWaveHeightForecastPart }
     * 
     * 
     */
    public List<TypeWaveHeightForecastPart> getWaveHeightForecastPart() {
        if (waveHeightForecastPart == null) {
            waveHeightForecastPart = new ArrayList<TypeWaveHeightForecastPart>();
        }
        return this.waveHeightForecastPart;
    }

}
