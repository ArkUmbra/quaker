
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Tsunami complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Tsunami"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiDetail" minOccurs="0"/&gt;
 *         &lt;element name="Estimation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiDetail" minOccurs="0"/&gt;
 *         &lt;element name="Forecast" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Tsunami", propOrder = {
    "release",
    "observation",
    "estimation",
    "forecast"
})
public class TypeTsunami {

    @XmlElement(name = "Release")
    protected String release;
    @XmlElement(name = "Observation")
    protected TypeTsunamiDetail observation;
    @XmlElement(name = "Estimation")
    protected TypeTsunamiDetail estimation;
    @XmlElement(name = "Forecast")
    protected TypeTsunamiDetail forecast;

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public TypeTsunamiDetail getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public void setObservation(TypeTsunamiDetail value) {
        this.observation = value;
    }

    /**
     * Gets the value of the estimation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public TypeTsunamiDetail getEstimation() {
        return estimation;
    }

    /**
     * Sets the value of the estimation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public void setEstimation(TypeTsunamiDetail value) {
        this.estimation = value;
    }

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public TypeTsunamiDetail getForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiDetail }
     *     
     */
    public void setForecast(TypeTsunamiDetail value) {
        this.forecast = value;
    }

}
