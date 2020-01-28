
package jp.go.kishou.xml.jmaxml1.body.volcanology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for type.volcanoObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.volcanoObservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventTime" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.eventTime" minOccurs="0"/&gt;
 *         &lt;element name="ColorPlume" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.plume" minOccurs="0"/&gt;
 *         &lt;element name="WhitePlume" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.plume" minOccurs="0"/&gt;
 *         &lt;element name="OtherObservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Appendix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.volcanoObservation", propOrder = {
    "eventTime",
    "colorPlume",
    "whitePlume",
    "otherObservation",
    "appendix",
    "any"
})
public class TypeVolcanoObservation {

    @XmlElement(name = "EventTime")
    protected TypeEventTime eventTime;
    @XmlElement(name = "ColorPlume")
    protected TypePlume colorPlume;
    @XmlElement(name = "WhitePlume")
    protected TypePlume whitePlume;
    @XmlElement(name = "OtherObservation")
    protected String otherObservation;
    @XmlElement(name = "Appendix")
    protected String appendix;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeEventTime }
     *     
     */
    public TypeEventTime getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEventTime }
     *     
     */
    public void setEventTime(TypeEventTime value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the colorPlume property.
     * 
     * @return
     *     possible object is
     *     {@link TypePlume }
     *     
     */
    public TypePlume getColorPlume() {
        return colorPlume;
    }

    /**
     * Sets the value of the colorPlume property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlume }
     *     
     */
    public void setColorPlume(TypePlume value) {
        this.colorPlume = value;
    }

    /**
     * Gets the value of the whitePlume property.
     * 
     * @return
     *     possible object is
     *     {@link TypePlume }
     *     
     */
    public TypePlume getWhitePlume() {
        return whitePlume;
    }

    /**
     * Sets the value of the whitePlume property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlume }
     *     
     */
    public void setWhitePlume(TypePlume value) {
        this.whitePlume = value;
    }

    /**
     * Gets the value of the otherObservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherObservation() {
        return otherObservation;
    }

    /**
     * Sets the value of the otherObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherObservation(String value) {
        this.otherObservation = value;
    }

    /**
     * Gets the value of the appendix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendix() {
        return appendix;
    }

    /**
     * Sets the value of the appendix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendix(String value) {
        this.appendix = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
