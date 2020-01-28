
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.TimeSeriesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.TimeSeriesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeDefines" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.TimeDefines"/&gt;
 *         &lt;element name="Item" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Item" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.TimeSeriesInfo", propOrder = {
    "timeDefines",
    "item"
})
public class TypeTimeSeriesInfo {

    @XmlElement(name = "TimeDefines", required = true)
    protected TypeTimeDefines timeDefines;
    @XmlElement(name = "Item", required = true)
    protected List<TypeItem> item;

    /**
     * Gets the value of the timeDefines property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTimeDefines }
     *     
     */
    public TypeTimeDefines getTimeDefines() {
        return timeDefines;
    }

    /**
     * Sets the value of the timeDefines property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTimeDefines }
     *     
     */
    public void setTimeDefines(TypeTimeDefines value) {
        this.timeDefines = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeItem }
     * 
     * 
     */
    public List<TypeItem> getItem() {
        if (item == null) {
            item = new ArrayList<TypeItem>();
        }
        return this.item;
    }

}
