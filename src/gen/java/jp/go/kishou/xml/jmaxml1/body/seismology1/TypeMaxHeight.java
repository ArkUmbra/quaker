
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeTsunamiHeight;


/**
 * <p>Java class for type.MaxHeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.MaxHeight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TsunamiHeightFrom" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.TsunamiHeight" minOccurs="0"/&gt;
 *         &lt;element name="TsunamiHeightTo" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.TsunamiHeight" minOccurs="0"/&gt;
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
@XmlType(name = "type.MaxHeight", propOrder = {
    "dateTime",
    "condition",
    "tsunamiHeightFrom",
    "tsunamiHeightTo",
    "tsunamiHeight",
    "revise",
    "period"
})
public class TypeMaxHeight {

    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "TsunamiHeightFrom")
    protected TypeTsunamiHeight tsunamiHeightFrom;
    @XmlElement(name = "TsunamiHeightTo")
    protected TypeTsunamiHeight tsunamiHeightTo;
    @XmlElement(name = "TsunamiHeight", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeTsunamiHeight tsunamiHeight;
    @XmlElement(name = "Revise")
    protected String revise;
    @XmlElement(name = "Period")
    protected Float period;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
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
     * Gets the value of the tsunamiHeightFrom property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public TypeTsunamiHeight getTsunamiHeightFrom() {
        return tsunamiHeightFrom;
    }

    /**
     * Sets the value of the tsunamiHeightFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public void setTsunamiHeightFrom(TypeTsunamiHeight value) {
        this.tsunamiHeightFrom = value;
    }

    /**
     * Gets the value of the tsunamiHeightTo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public TypeTsunamiHeight getTsunamiHeightTo() {
        return tsunamiHeightTo;
    }

    /**
     * Sets the value of the tsunamiHeightTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunamiHeight }
     *     
     */
    public void setTsunamiHeightTo(TypeTsunamiHeight value) {
        this.tsunamiHeightTo = value;
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
