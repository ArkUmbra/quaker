
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeReliabilityClass;


/**
 * <p>Java class for type.ReliabilityClassPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.ReliabilityClassPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}ReliabilityClass" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ReliabilityClassPart", propOrder = {
    "reliabilityClass"
})
public class TypeReliabilityClassPart {

    @XmlElement(name = "ReliabilityClass", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypeReliabilityClass> reliabilityClass;

    /**
     * Gets the value of the reliabilityClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reliabilityClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReliabilityClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReliabilityClass }
     * 
     * 
     */
    public List<TypeReliabilityClass> getReliabilityClass() {
        if (reliabilityClass == null) {
            reliabilityClass = new ArrayList<TypeReliabilityClass>();
        }
        return this.reliabilityClass;
    }

}
