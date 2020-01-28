
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Period complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Period"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/&gt;
 *         &lt;element name="OverTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZoneTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Period", propOrder = {
    "startTime",
    "endTime",
    "overTime",
    "zoneTime"
})
public class TypePeriod {

    @XmlElement(name = "StartTime")
    protected TypeForecastTerm startTime;
    @XmlElement(name = "EndTime")
    protected TypeForecastTerm endTime;
    @XmlElement(name = "OverTime")
    protected String overTime;
    @XmlElement(name = "ZoneTime")
    protected TypeForecastTerm zoneTime;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setStartTime(TypeForecastTerm value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setEndTime(TypeForecastTerm value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the overTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverTime() {
        return overTime;
    }

    /**
     * Sets the value of the overTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverTime(String value) {
        this.overTime = value;
    }

    /**
     * Gets the value of the zoneTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getZoneTime() {
        return zoneTime;
    }

    /**
     * Sets the value of the zoneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setZoneTime(TypeForecastTerm value) {
        this.zoneTime = value;
    }

}
