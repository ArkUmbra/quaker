
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePrecipitation;


/**
 * <p>Java class for type.BasePrecipitation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.BasePrecipitation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeModifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Precipitation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Local" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.LocalPrecipitation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.BasePrecipitation", propOrder = {
    "timeModifier",
    "precipitation",
    "local",
    "time",
    "remark"
})
public class TypeBasePrecipitation {

    @XmlElement(name = "TimeModifier")
    protected String timeModifier;
    @XmlElement(name = "Precipitation", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypePrecipitation> precipitation;
    @XmlElement(name = "Local")
    protected List<TypeLocalPrecipitation> local;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * Gets the value of the timeModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeModifier() {
        return timeModifier;
    }

    /**
     * Sets the value of the timeModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeModifier(String value) {
        this.timeModifier = value;
    }

    /**
     * Gets the value of the precipitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precipitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecipitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePrecipitation }
     * 
     * 
     */
    public List<TypePrecipitation> getPrecipitation() {
        if (precipitation == null) {
            precipitation = new ArrayList<TypePrecipitation>();
        }
        return this.precipitation;
    }

    /**
     * Gets the value of the local property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the local property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeLocalPrecipitation }
     * 
     * 
     */
    public List<TypeLocalPrecipitation> getLocal() {
        if (local == null) {
            local = new ArrayList<TypeLocalPrecipitation>();
        }
        return this.local;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
