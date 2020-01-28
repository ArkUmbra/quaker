
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.IntensityAppendix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.IntensityAppendix"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxIntChange" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxIntChangeReason" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.IntensityAppendix", propOrder = {
    "maxIntChange",
    "maxIntChangeReason"
})
public class TypeIntensityAppendix {

    @XmlElement(name = "MaxIntChange")
    protected int maxIntChange;
    @XmlElement(name = "MaxIntChangeReason")
    protected int maxIntChangeReason;

    /**
     * Gets the value of the maxIntChange property.
     * 
     */
    public int getMaxIntChange() {
        return maxIntChange;
    }

    /**
     * Sets the value of the maxIntChange property.
     * 
     */
    public void setMaxIntChange(int value) {
        this.maxIntChange = value;
    }

    /**
     * Gets the value of the maxIntChangeReason property.
     * 
     */
    public int getMaxIntChangeReason() {
        return maxIntChangeReason;
    }

    /**
     * Sets the value of the maxIntChangeReason property.
     * 
     */
    public void setMaxIntChangeReason(int value) {
        this.maxIntChangeReason = value;
    }

}
