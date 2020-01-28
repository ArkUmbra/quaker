
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Intensity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Intensity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Forecast" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityDetail" minOccurs="0"/&gt;
 *         &lt;element name="Observation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Intensity", propOrder = {
    "forecast",
    "observation"
})
public class TypeIntensity {

    @XmlElement(name = "Forecast")
    protected TypeIntensityDetail forecast;
    @XmlElement(name = "Observation")
    protected TypeIntensityDetail observation;

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensityDetail }
     *     
     */
    public TypeIntensityDetail getForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensityDetail }
     *     
     */
    public void setForecast(TypeIntensityDetail value) {
        this.forecast = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensityDetail }
     *     
     */
    public TypeIntensityDetail getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensityDetail }
     *     
     */
    public void setObservation(TypeIntensityDetail value) {
        this.observation = value;
    }

}
