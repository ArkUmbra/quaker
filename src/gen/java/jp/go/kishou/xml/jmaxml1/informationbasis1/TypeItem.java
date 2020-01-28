
package jp.go.kishou.xml.jmaxml1.informationbasis1;

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
 *         &lt;element name="Kind" type="{http://xml.kishou.go.jp/jmaxml1/informationBasis1/}type.kind" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LastKind" type="{http://xml.kishou.go.jp/jmaxml1/informationBasis1/}type.kind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Areas" type="{http://xml.kishou.go.jp/jmaxml1/informationBasis1/}type.areas"/&gt;
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
    "kind",
    "lastKind",
    "areas",
    "any"
})
public class TypeItem {

    @XmlElement(name = "Kind", required = true)
    protected List<TypeKind> kind;
    @XmlElement(name = "LastKind")
    protected List<TypeKind> lastKind;
    @XmlElement(name = "Areas", required = true)
    protected TypeAreas areas;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the kind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKind }
     * 
     * 
     */
    public List<TypeKind> getKind() {
        if (kind == null) {
            kind = new ArrayList<TypeKind>();
        }
        return this.kind;
    }

    /**
     * Gets the value of the lastKind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastKind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKind }
     * 
     * 
     */
    public List<TypeKind> getLastKind() {
        if (lastKind == null) {
            lastKind = new ArrayList<TypeKind>();
        }
        return this.lastKind;
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
