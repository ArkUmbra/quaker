
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeMagnitude;


/**
 * <p>Java class for type.Earthquake complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Earthquake"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hypocenter" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Hypocenter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Magnitude" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Earthquake", propOrder = {
    "originTime",
    "arrivalTime",
    "condition",
    "hypocenter",
    "magnitude"
})
public class TypeEarthquake {

    @XmlElement(name = "OriginTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originTime;
    @XmlElement(name = "ArrivalTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "Hypocenter")
    protected TypeHypocenter hypocenter;
    @XmlElement(name = "Magnitude", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypeMagnitude> magnitude;

    /**
     * Gets the value of the originTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginTime() {
        return originTime;
    }

    /**
     * Sets the value of the originTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginTime(XMLGregorianCalendar value) {
        this.originTime = value;
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
     * Gets the value of the hypocenter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHypocenter }
     *     
     */
    public TypeHypocenter getHypocenter() {
        return hypocenter;
    }

    /**
     * Sets the value of the hypocenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypocenter }
     *     
     */
    public void setHypocenter(TypeHypocenter value) {
        this.hypocenter = value;
    }

    /**
     * Gets the value of the magnitude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magnitude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMagnitude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeMagnitude }
     * 
     * 
     */
    public List<TypeMagnitude> getMagnitude() {
        if (magnitude == null) {
            magnitude = new ArrayList<TypeMagnitude>();
        }
        return this.magnitude;
    }

}
