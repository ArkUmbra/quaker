
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Category"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kind" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Kind"/&gt;
 *         &lt;element name="LastKind" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Kind" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Category", propOrder = {
    "kind",
    "lastKind"
})
public class TypeCategory {

    @XmlElement(name = "Kind", required = true)
    protected TypeKind kind;
    @XmlElement(name = "LastKind")
    protected TypeKind lastKind;

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

}
