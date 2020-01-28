
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.ObservationAddition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.ObservationAddition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviationFromNormal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviationFromLastYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ObservationAddition", propOrder = {
    "deviationFromNormal",
    "deviationFromLastYear",
    "text"
})
public class TypeObservationAddition {

    @XmlElement(name = "DeviationFromNormal")
    protected String deviationFromNormal;
    @XmlElement(name = "DeviationFromLastYear")
    protected String deviationFromLastYear;
    @XmlElement(name = "Text")
    protected String text;

    /**
     * Gets the value of the deviationFromNormal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviationFromNormal() {
        return deviationFromNormal;
    }

    /**
     * Sets the value of the deviationFromNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviationFromNormal(String value) {
        this.deviationFromNormal = value;
    }

    /**
     * Gets the value of the deviationFromLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviationFromLastYear() {
        return deviationFromLastYear;
    }

    /**
     * Sets the value of the deviationFromLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviationFromLastYear(String value) {
        this.deviationFromLastYear = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
