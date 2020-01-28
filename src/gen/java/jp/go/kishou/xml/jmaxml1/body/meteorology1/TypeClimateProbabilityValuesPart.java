
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeClimateProbabilityValues;


/**
 * <p>Java class for type.ClimateProbabilityValuesPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.ClimateProbabilityValuesPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}ClimateProbabilityValues" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ClimateProbabilityValuesPart", propOrder = {
    "climateProbabilityValues"
})
public class TypeClimateProbabilityValuesPart {

    @XmlElement(name = "ClimateProbabilityValues", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypeClimateProbabilityValues> climateProbabilityValues;

    /**
     * Gets the value of the climateProbabilityValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the climateProbabilityValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClimateProbabilityValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeClimateProbabilityValues }
     * 
     * 
     */
    public List<TypeClimateProbabilityValues> getClimateProbabilityValues() {
        if (climateProbabilityValues == null) {
            climateProbabilityValues = new ArrayList<TypeClimateProbabilityValues>();
        }
        return this.climateProbabilityValues;
    }

}
