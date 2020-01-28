
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for type.TsunamiStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.TsunamiStation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sensor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HighTideDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FirstHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.FirstHeight"/&gt;
 *         &lt;element name="MaxHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.MaxHeight" minOccurs="0"/&gt;
 *         &lt;element name="CurrentHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CurrentHeight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.TsunamiStation", propOrder = {
    "name",
    "code",
    "sensor",
    "highTideDateTime",
    "firstHeight",
    "maxHeight",
    "currentHeight"
})
public class TypeTsunamiStation {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Sensor")
    protected String sensor;
    @XmlElement(name = "HighTideDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar highTideDateTime;
    @XmlElement(name = "FirstHeight", required = true)
    protected TypeFirstHeight firstHeight;
    @XmlElement(name = "MaxHeight")
    protected TypeMaxHeight maxHeight;
    @XmlElement(name = "CurrentHeight")
    protected TypeCurrentHeight currentHeight;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the sensor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensor() {
        return sensor;
    }

    /**
     * Sets the value of the sensor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensor(String value) {
        this.sensor = value;
    }

    /**
     * Gets the value of the highTideDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHighTideDateTime() {
        return highTideDateTime;
    }

    /**
     * Sets the value of the highTideDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHighTideDateTime(XMLGregorianCalendar value) {
        this.highTideDateTime = value;
    }

    /**
     * Gets the value of the firstHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFirstHeight }
     *     
     */
    public TypeFirstHeight getFirstHeight() {
        return firstHeight;
    }

    /**
     * Sets the value of the firstHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFirstHeight }
     *     
     */
    public void setFirstHeight(TypeFirstHeight value) {
        this.firstHeight = value;
    }

    /**
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMaxHeight }
     *     
     */
    public TypeMaxHeight getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMaxHeight }
     *     
     */
    public void setMaxHeight(TypeMaxHeight value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the currentHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCurrentHeight }
     *     
     */
    public TypeCurrentHeight getCurrentHeight() {
        return currentHeight;
    }

    /**
     * Sets the value of the currentHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCurrentHeight }
     *     
     */
    public void setCurrentHeight(TypeCurrentHeight value) {
        this.currentHeight = value;
    }

}
