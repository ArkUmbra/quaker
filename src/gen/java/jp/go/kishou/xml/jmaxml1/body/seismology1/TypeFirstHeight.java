
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeTsunamiHeight;


/**
 * <p>Java class for type.FirstHeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.FirstHeight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Initial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}TsunamiHeight" minOccurs="0"/&gt;
 *         &lt;element name="Revise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.FirstHeight", propOrder = {
    "arrivalTimeFrom",
    "arrivalTimeTo",
    "arrivalTime",
    "condition",
    "initial",
    "tsunamiHeight",
    "revise",
    "period"
})
public class TypeFirstHeight {

    @XmlElement(name = "ArrivalTimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTimeFrom;
    @XmlElement(name = "ArrivalTimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTimeTo;
    @XmlElement(name = "ArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "Initial")
    protected String initial;
    @XmlElement(name = "TsunamiHeight", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeTsunamiHeight tsunamiHeight;
    @XmlElement(name = "Revise")
    protected String revise;
    @XmlElement(name = "Period")
    protected Float period;

    /**
     * Gets the value of the arrivalTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTimeFrom() {
        return arrivalTimeFrom;
    }

    /**
     * Sets the value of the arrivalTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTimeFrom(XMLGregorianCalendar value) {
        this.arrivalTimeFrom = value;
    }

    /**
     * Gets the value of the arrivalTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTimeTo() {
        return arrivalTimeTo;
    }

    /**
     * Sets the value of the arrivalTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTimeTo(XMLGregorianCalendar value) {
        this.arrivalTimeTo = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the initial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitial(String value) {
        this.initial = value;
    }

    /**
     * Gets the value of the tsunamiHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public TypeTsunamiHeight getTsunamiHeight() {
        return tsunamiHeight;
    }

    /**
     * Sets the value of the tsunamiHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public void setTsunamiHeight(TypeTsunamiHeight value) {
        this.tsunamiHeight = value;
    }

    /**
     * Gets the value of the revise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevise() {
        return revise;
    }

    /**
     * Sets the value of the revise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevise(String value) {
        this.revise = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

}
