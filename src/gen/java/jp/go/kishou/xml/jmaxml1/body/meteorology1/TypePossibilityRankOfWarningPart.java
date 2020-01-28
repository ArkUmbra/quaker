
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePossibilityRankOfWarning;


/**
 * <p>Java class for type.PossibilityRankOfWarningPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.PossibilityRankOfWarningPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}PossibilityRankOfWarning" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.PossibilityRankOfWarningPart", propOrder = {
    "possibilityRankOfWarning"
})
public class TypePossibilityRankOfWarningPart {

    @XmlElement(name = "PossibilityRankOfWarning", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypePossibilityRankOfWarning> possibilityRankOfWarning;

    /**
     * Gets the value of the possibilityRankOfWarning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the possibilityRankOfWarning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPossibilityRankOfWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePossibilityRankOfWarning }
     * 
     * 
     */
    public List<TypePossibilityRankOfWarning> getPossibilityRankOfWarning() {
        if (possibilityRankOfWarning == null) {
            possibilityRankOfWarning = new ArrayList<TypePossibilityRankOfWarning>();
        }
        return this.possibilityRankOfWarning;
    }

}
