
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.ClimateFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.ClimateFeature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeneralSituationText" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.ReferableString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SignificantClimateElement" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.SignificantClimateElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ClimateFeature", propOrder = {
    "generalSituationText",
    "significantClimateElement"
})
public class TypeClimateFeature {

    @XmlElement(name = "GeneralSituationText")
    protected List<TypeReferableString> generalSituationText;
    @XmlElement(name = "SignificantClimateElement")
    protected List<TypeSignificantClimateElement> significantClimateElement;

    /**
     * Gets the value of the generalSituationText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalSituationText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralSituationText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReferableString }
     * 
     * 
     */
    public List<TypeReferableString> getGeneralSituationText() {
        if (generalSituationText == null) {
            generalSituationText = new ArrayList<TypeReferableString>();
        }
        return this.generalSituationText;
    }

    /**
     * Gets the value of the significantClimateElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the significantClimateElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignificantClimateElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSignificantClimateElement }
     * 
     * 
     */
    public List<TypeSignificantClimateElement> getSignificantClimateElement() {
        if (significantClimateElement == null) {
            significantClimateElement = new ArrayList<TypeSignificantClimateElement>();
        }
        return this.significantClimateElement;
    }

}
