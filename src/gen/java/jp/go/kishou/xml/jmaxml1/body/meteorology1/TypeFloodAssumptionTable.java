
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.FloodAssumptionTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.FloodAssumptionTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Area"/&gt;
 *         &lt;element name="FloodAssumptionPart" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.FloodAssumptionPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.FloodAssumptionTable", propOrder = {
    "area",
    "floodAssumptionPart",
    "remark"
})
public class TypeFloodAssumptionTable {

    @XmlElement(name = "Area", required = true)
    protected TypeArea area;
    @XmlElement(name = "FloodAssumptionPart")
    protected List<TypeFloodAssumptionPart> floodAssumptionPart;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link TypeArea }
     *     
     */
    public TypeArea getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeArea }
     *     
     */
    public void setArea(TypeArea value) {
        this.area = value;
    }

    /**
     * Gets the value of the floodAssumptionPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floodAssumptionPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloodAssumptionPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFloodAssumptionPart }
     * 
     * 
     */
    public List<TypeFloodAssumptionPart> getFloodAssumptionPart() {
        if (floodAssumptionPart == null) {
            floodAssumptionPart = new ArrayList<TypeFloodAssumptionPart>();
        }
        return this.floodAssumptionPart;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
