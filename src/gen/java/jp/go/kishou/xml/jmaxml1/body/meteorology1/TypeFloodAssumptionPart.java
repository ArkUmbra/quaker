
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeDateTime;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeFloodDepth;


/**
 * <p>Java class for type.FloodAssumptionPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.FloodAssumptionPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FloodAssumptionArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttainmentTime" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.DateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}FloodDepth" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttainmentDeepestTime" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.FloodAssumptionPart", propOrder = {
    "floodAssumptionArea",
    "attainmentTime",
    "floodDepth",
    "attainmentDeepestTime"
})
public class TypeFloodAssumptionPart {

    @XmlElement(name = "FloodAssumptionArea")
    protected String floodAssumptionArea;
    @XmlElement(name = "AttainmentTime")
    protected TypeDateTime attainmentTime;
    @XmlElement(name = "FloodDepth", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeFloodDepth> floodDepth;
    @XmlElement(name = "AttainmentDeepestTime")
    protected TypeDateTime attainmentDeepestTime;

    /**
     * Gets the value of the floodAssumptionArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloodAssumptionArea() {
        return floodAssumptionArea;
    }

    /**
     * Sets the value of the floodAssumptionArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloodAssumptionArea(String value) {
        this.floodAssumptionArea = value;
    }

    /**
     * Gets the value of the attainmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateTime }
     *     
     */
    public TypeDateTime getAttainmentTime() {
        return attainmentTime;
    }

    /**
     * Sets the value of the attainmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateTime }
     *     
     */
    public void setAttainmentTime(TypeDateTime value) {
        this.attainmentTime = value;
    }

    /**
     * Gets the value of the floodDepth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floodDepth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloodDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFloodDepth }
     * 
     * 
     */
    public List<TypeFloodDepth> getFloodDepth() {
        if (floodDepth == null) {
            floodDepth = new ArrayList<TypeFloodDepth>();
        }
        return this.floodDepth;
    }

    /**
     * Gets the value of the attainmentDeepestTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateTime }
     *     
     */
    public TypeDateTime getAttainmentDeepestTime() {
        return attainmentDeepestTime;
    }

    /**
     * Sets the value of the attainmentDeepestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateTime }
     *     
     */
    public void setAttainmentDeepestTime(TypeDateTime value) {
        this.attainmentDeepestTime = value;
    }

}
