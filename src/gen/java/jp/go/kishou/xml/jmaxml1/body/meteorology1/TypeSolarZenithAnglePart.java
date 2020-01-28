
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeSolarZenithAngle;


/**
 * <p>Java class for type.SolarZenithAnglePart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.SolarZenithAnglePart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}SolarZenithAngle" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.SolarZenithAnglePart", propOrder = {
    "solarZenithAngle"
})
public class TypeSolarZenithAnglePart {

    @XmlElement(name = "SolarZenithAngle", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypeSolarZenithAngle> solarZenithAngle;

    /**
     * Gets the value of the solarZenithAngle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solarZenithAngle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolarZenithAngle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSolarZenithAngle }
     * 
     * 
     */
    public List<TypeSolarZenithAngle> getSolarZenithAngle() {
        if (solarZenithAngle == null) {
            solarZenithAngle = new ArrayList<TypeSolarZenithAngle>();
        }
        return this.solarZenithAngle;
    }

}
