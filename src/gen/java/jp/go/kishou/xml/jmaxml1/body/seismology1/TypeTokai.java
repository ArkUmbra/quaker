
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Tokai complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Tokai"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InfoKind" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InfoSerial" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.InfoSerial" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Tokai", propOrder = {
    "infoKind",
    "infoSerial",
    "text"
})
public class TypeTokai {

    @XmlElement(name = "InfoKind", required = true)
    protected String infoKind;
    @XmlElement(name = "InfoSerial")
    protected TypeInfoSerial infoSerial;
    @XmlElement(name = "Text", required = true)
    protected String text;

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
     * Gets the value of the infoSerial property.
     * 
     * @return
     *     possible object is
     *     {@link TypeInfoSerial }
     *     
     */
    public TypeInfoSerial getInfoSerial() {
        return infoSerial;
    }

    /**
     * Sets the value of the infoSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInfoSerial }
     *     
     */
    public void setInfoSerial(TypeInfoSerial value) {
        this.infoSerial = value;
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
