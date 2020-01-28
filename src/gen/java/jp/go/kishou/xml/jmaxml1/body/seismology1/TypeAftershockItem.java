
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeMagnitude;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeProbabilityOfAftershock;


/**
 * <p>Java class for type.AftershockItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.AftershockItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}ProbabilityOfAftershock"/&gt;
 *         &lt;element name="TargetMagnitude" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Magnitude"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.AftershockItem", propOrder = {
    "startTime",
    "endTime",
    "probabilityOfAftershock",
    "targetMagnitude",
    "text"
})
public class TypeAftershockItem {

    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "ProbabilityOfAftershock", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected TypeProbabilityOfAftershock probabilityOfAftershock;
    @XmlElement(name = "TargetMagnitude", required = true)
    protected TypeMagnitude targetMagnitude;
    @XmlElement(name = "Text")
    protected String text;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the probabilityOfAftershock property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProbabilityOfAftershock }
     *     
     */
    public TypeProbabilityOfAftershock getProbabilityOfAftershock() {
        return probabilityOfAftershock;
    }

    /**
     * Sets the value of the probabilityOfAftershock property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbabilityOfAftershock }
     *     
     */
    public void setProbabilityOfAftershock(TypeProbabilityOfAftershock value) {
        this.probabilityOfAftershock = value;
    }

    /**
     * Gets the value of the targetMagnitude property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMagnitude }
     *     
     */
    public TypeMagnitude getTargetMagnitude() {
        return targetMagnitude;
    }

    /**
     * Sets the value of the targetMagnitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMagnitude }
     *     
     */
    public void setTargetMagnitude(TypeMagnitude value) {
        this.targetMagnitude = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
