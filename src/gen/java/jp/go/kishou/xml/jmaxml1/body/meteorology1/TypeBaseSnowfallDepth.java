
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeSnowfallDepth;


/**
 * <p>Java class for type.BaseSnowfallDepth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.BaseSnowfallDepth"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeModifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}SnowfallDepth" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Local" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.LocalSnowfallDepth" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "type.BaseSnowfallDepth", propOrder = {
    "timeModifier",
    "snowfallDepth",
    "local",
    "time",
    "remark"
})
public class TypeBaseSnowfallDepth {

    @XmlElement(name = "TimeModifier")
    protected String timeModifier;
    @XmlElement(name = "SnowfallDepth", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeSnowfallDepth> snowfallDepth;
    @XmlElement(name = "Local")
    protected List<TypeLocalSnowfallDepth> local;
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
     * Gets the value of the snowfallDepth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snowfallDepth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnowfallDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSnowfallDepth }
     * 
     * 
     */
    public List<TypeSnowfallDepth> getSnowfallDepth() {
        if (snowfallDepth == null) {
            snowfallDepth = new ArrayList<TypeSnowfallDepth>();
        }
        return this.snowfallDepth;
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
     * {@link TypeLocalSnowfallDepth }
     * 
     * 
     */
    public List<TypeLocalSnowfallDepth> getLocal() {
        if (local == null) {
            local = new ArrayList<TypeLocalSnowfallDepth>();
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
