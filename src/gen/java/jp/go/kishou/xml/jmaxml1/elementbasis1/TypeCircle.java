
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for type.Circle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Circle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasePoint" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Coordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Axes" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Axes" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Circle", propOrder = {
    "basePoint",
    "axes",
    "any"
})
public class TypeCircle {

    @XmlElement(name = "BasePoint")
    protected List<TypeCoordinate> basePoint;
    @XmlElement(name = "Axes")
    protected TypeAxes axes;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the basePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCoordinate }
     * 
     * 
     */
    public List<TypeCoordinate> getBasePoint() {
        if (basePoint == null) {
            basePoint = new ArrayList<TypeCoordinate>();
        }
        return this.basePoint;
    }

    /**
     * Gets the value of the axes property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAxes }
     *     
     */
    public TypeAxes getAxes() {
        return axes;
    }

    /**
     * Sets the value of the axes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAxes }
     *     
     */
    public void setAxes(TypeAxes value) {
        this.axes = value;
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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
