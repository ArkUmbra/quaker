
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.NextKinds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.NextKinds"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NextKind" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.NextKind" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.NextKinds", propOrder = {
    "nextKind"
})
public class TypeNextKinds {

    @XmlElement(name = "NextKind", required = true)
    protected List<TypeNextKind> nextKind;

    /**
     * Gets the value of the nextKind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextKind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeNextKind }
     * 
     * 
     */
    public List<TypeNextKind> getNextKind() {
        if (nextKind == null) {
            nextKind = new ArrayList<TypeNextKind>();
        }
        return this.nextKind;
    }

}
