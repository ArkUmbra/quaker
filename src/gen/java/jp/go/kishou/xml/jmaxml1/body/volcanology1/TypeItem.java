
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
 * <p>Java class for type.item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventTime" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.eventTime" minOccurs="0"/&gt;
 *         &lt;element name="Kind" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.kind"/&gt;
 *         &lt;element name="LastKind" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.kind" minOccurs="0"/&gt;
 *         &lt;element name="Areas" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.areas"/&gt;
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
@XmlType(name = "type.item", propOrder = {
    "eventTime",
    "kind",
    "lastKind",
    "areas",
    "any"
})
public class TypeItem {

    @XmlElement(name = "EventTime")
    protected TypeEventTime eventTime;
    @XmlElement(name = "Kind", required = true)
    protected TypeKind kind;
    @XmlElement(name = "LastKind")
    protected TypeKind lastKind;
    @XmlElement(name = "Areas", required = true)
    protected TypeAreas areas;
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
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link TypeKind }
     *     
     */
    public TypeKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKind }
     *     
     */
    public void setKind(TypeKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the lastKind property.
     * 
     * @return
     *     possible object is
     *     {@link TypeKind }
     *     
     */
    public TypeKind getLastKind() {
        return lastKind;
    }

    /**
     * Sets the value of the lastKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKind }
     *     
     */
    public void setLastKind(TypeKind value) {
        this.lastKind = value;
    }

    /**
     * Gets the value of the areas property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAreas }
     *     
     */
    public TypeAreas getAreas() {
        return areas;
    }

    /**
     * Sets the value of the areas property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAreas }
     *     
     */
    public void setAreas(TypeAreas value) {
        this.areas = value;
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
