
package jp.go.kishou.xml.jmaxml1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.informationbasis1.TypeHead;
import org.w3c.dom.Element;


/**
 * <p>Java class for type.report complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.report"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Control" type="{http://xml.kishou.go.jp/jmaxml1/}type.control"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/informationBasis1/}Head"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.report", propOrder = {
    "control",
    "head",
    "any"
})
public class TypeReport {

    @XmlElement(name = "Control", required = true)
    protected TypeControl control;
    @XmlElement(name = "Head", namespace = "http://xml.kishou.go.jp/jmaxml1/informationBasis1/", required = true)
    protected TypeHead head;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link TypeControl }
     *     
     */
    public TypeControl getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeControl }
     *     
     */
    public void setControl(TypeControl value) {
        this.control = value;
    }

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHead }
     *     
     */
    public TypeHead getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHead }
     *     
     */
    public void setHead(TypeHead value) {
        this.head = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
