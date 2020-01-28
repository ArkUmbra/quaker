
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.HydrometricStationPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.HydrometricStationPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Area"/&gt;
 *         &lt;element name="ChargeSection" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Criteria" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.HydrometricStationCriteria" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "type.HydrometricStationPart", propOrder = {
    "area",
    "chargeSection",
    "criteria",
    "remark"
})
public class TypeHydrometricStationPart {

    @XmlElement(name = "Area", required = true)
    protected TypeArea area;
    @XmlElement(name = "ChargeSection")
    protected List<String> chargeSection;
    @XmlElement(name = "Criteria", required = true)
    protected List<TypeHydrometricStationCriteria> criteria;
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
     * Gets the value of the chargeSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChargeSection() {
        if (chargeSection == null) {
            chargeSection = new ArrayList<String>();
        }
        return this.chargeSection;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeHydrometricStationCriteria }
     * 
     * 
     */
    public List<TypeHydrometricStationCriteria> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<TypeHydrometricStationCriteria>();
        }
        return this.criteria;
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
