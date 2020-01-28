
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for type.AdditionalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.AdditionalInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObservationAddition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ObservationAddition" minOccurs="0"/&gt;
 *         &lt;element name="ClimateForecastAddition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ClimateForecastAddition" minOccurs="0"/&gt;
 *         &lt;element name="FloodForecastAddition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.FloodForecastAddition" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.AdditionalInfo", propOrder = {
    "observationAddition",
    "climateForecastAddition",
    "floodForecastAddition",
    "any"
})
public class TypeAdditionalInfo {

    @XmlElement(name = "ObservationAddition")
    protected TypeObservationAddition observationAddition;
    @XmlElement(name = "ClimateForecastAddition")
    protected TypeClimateForecastAddition climateForecastAddition;
    @XmlElement(name = "FloodForecastAddition")
    protected TypeFloodForecastAddition floodForecastAddition;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the observationAddition property.
     * 
     * @return
     *     possible object is
     *     {@link TypeObservationAddition }
     *     
     */
    public TypeObservationAddition getObservationAddition() {
        return observationAddition;
    }

    /**
     * Sets the value of the observationAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeObservationAddition }
     *     
     */
    public void setObservationAddition(TypeObservationAddition value) {
        this.observationAddition = value;
    }

    /**
     * Gets the value of the climateForecastAddition property.
     * 
     * @return
     *     possible object is
     *     {@link TypeClimateForecastAddition }
     *     
     */
    public TypeClimateForecastAddition getClimateForecastAddition() {
        return climateForecastAddition;
    }

    /**
     * Sets the value of the climateForecastAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeClimateForecastAddition }
     *     
     */
    public void setClimateForecastAddition(TypeClimateForecastAddition value) {
        this.climateForecastAddition = value;
    }

    /**
     * Gets the value of the floodForecastAddition property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFloodForecastAddition }
     *     
     */
    public TypeFloodForecastAddition getFloodForecastAddition() {
        return floodForecastAddition;
    }

    /**
     * Sets the value of the floodForecastAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFloodForecastAddition }
     *     
     */
    public void setFloodForecastAddition(TypeFloodForecastAddition value) {
        this.floodForecastAddition = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
