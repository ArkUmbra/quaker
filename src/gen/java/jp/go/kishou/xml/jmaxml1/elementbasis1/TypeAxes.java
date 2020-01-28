
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Axes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Axes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Axis" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Axis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LongAxis" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Axis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShortAxis" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Axis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Axes", propOrder = {
    "axis",
    "longAxis",
    "shortAxis"
})
public class TypeAxes {

    @XmlElement(name = "Axis")
    protected List<TypeAxis> axis;
    @XmlElement(name = "LongAxis")
    protected List<TypeAxis> longAxis;
    @XmlElement(name = "ShortAxis")
    protected List<TypeAxis> shortAxis;

    /**
     * Gets the value of the axis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAxis }
     * 
     * 
     */
    public List<TypeAxis> getAxis() {
        if (axis == null) {
            axis = new ArrayList<TypeAxis>();
        }
        return this.axis;
    }

    /**
     * Gets the value of the longAxis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longAxis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAxis }
     * 
     * 
     */
    public List<TypeAxis> getLongAxis() {
        if (longAxis == null) {
            longAxis = new ArrayList<TypeAxis>();
        }
        return this.longAxis;
    }

    /**
     * Gets the value of the shortAxis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortAxis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAxis }
     * 
     * 
     */
    public List<TypeAxis> getShortAxis() {
        if (shortAxis == null) {
            shortAxis = new ArrayList<TypeAxis>();
        }
        return this.shortAxis;
    }

}
