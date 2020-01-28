
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.MeteorologicalInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.MeteorologicalInfos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeteorologicalInfo" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.MeteorologicalInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TimeSeriesInfo" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.TimeSeriesInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.MeteorologicalInfos", propOrder = {
    "meteorologicalInfo",
    "timeSeriesInfo"
})
public class TypeMeteorologicalInfos {

    @XmlElement(name = "MeteorologicalInfo")
    protected List<TypeMeteorologicalInfo> meteorologicalInfo;
    @XmlElement(name = "TimeSeriesInfo")
    protected List<TypeTimeSeriesInfo> timeSeriesInfo;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the meteorologicalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meteorologicalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeteorologicalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeMeteorologicalInfo }
     * 
     * 
     */
    public List<TypeMeteorologicalInfo> getMeteorologicalInfo() {
        if (meteorologicalInfo == null) {
            meteorologicalInfo = new ArrayList<TypeMeteorologicalInfo>();
        }
        return this.meteorologicalInfo;
    }

    /**
     * Gets the value of the timeSeriesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeriesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeriesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTimeSeriesInfo }
     * 
     * 
     */
    public List<TypeTimeSeriesInfo> getTimeSeriesInfo() {
        if (timeSeriesInfo == null) {
            timeSeriesInfo = new ArrayList<TypeTimeSeriesInfo>();
        }
        return this.timeSeriesInfo;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
