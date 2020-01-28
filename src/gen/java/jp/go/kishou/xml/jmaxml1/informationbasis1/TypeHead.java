
package jp.go.kishou.xml.jmaxml1.informationbasis1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for type.head complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.head"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReportDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TargetDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TargetDTDubious" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TargetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="ValidDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InfoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Serial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InfoKind" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InfoKindVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Headline" type="{http://xml.kishou.go.jp/jmaxml1/informationBasis1/}type.headline"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.head", propOrder = {
    "title",
    "reportDateTime",
    "targetDateTime",
    "targetDTDubious",
    "targetDuration",
    "validDateTime",
    "eventID",
    "infoType",
    "serial",
    "infoKind",
    "infoKindVersion",
    "headline"
})
public class TypeHead {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "ReportDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportDateTime;
    @XmlElement(name = "TargetDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar targetDateTime;
    @XmlElement(name = "TargetDTDubious")
    protected String targetDTDubious;
    @XmlElement(name = "TargetDuration")
    protected Duration targetDuration;
    @XmlElement(name = "ValidDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDateTime;
    @XmlElement(name = "EventID", required = true)
    protected String eventID;
    @XmlElement(name = "InfoType", required = true)
    protected String infoType;
    @XmlElement(name = "Serial", required = true)
    protected String serial;
    @XmlElement(name = "InfoKind", required = true)
    protected String infoKind;
    @XmlElement(name = "InfoKindVersion", required = true)
    protected String infoKindVersion;
    @XmlElement(name = "Headline", required = true)
    protected TypeHeadline headline;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the reportDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDateTime() {
        return reportDateTime;
    }

    /**
     * Sets the value of the reportDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDateTime(XMLGregorianCalendar value) {
        this.reportDateTime = value;
    }

    /**
     * Gets the value of the targetDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetDateTime() {
        return targetDateTime;
    }

    /**
     * Sets the value of the targetDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetDateTime(XMLGregorianCalendar value) {
        this.targetDateTime = value;
    }

    /**
     * Gets the value of the targetDTDubious property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDTDubious() {
        return targetDTDubious;
    }

    /**
     * Sets the value of the targetDTDubious property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDTDubious(String value) {
        this.targetDTDubious = value;
    }

    /**
     * Gets the value of the targetDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTargetDuration() {
        return targetDuration;
    }

    /**
     * Sets the value of the targetDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTargetDuration(Duration value) {
        this.targetDuration = value;
    }

    /**
     * Gets the value of the validDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDateTime() {
        return validDateTime;
    }

    /**
     * Sets the value of the validDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDateTime(XMLGregorianCalendar value) {
        this.validDateTime = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoType(String value) {
        this.infoType = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Gets the value of the infoKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoKind() {
        return infoKind;
    }

    /**
     * Sets the value of the infoKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoKind(String value) {
        this.infoKind = value;
    }

    /**
     * Gets the value of the infoKindVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoKindVersion() {
        return infoKindVersion;
    }

    /**
     * Sets the value of the infoKindVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoKindVersion(String value) {
        this.infoKindVersion = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHeadline }
     *     
     */
    public TypeHeadline getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHeadline }
     *     
     */
    public void setHeadline(TypeHeadline value) {
        this.headline = value;
    }

}
