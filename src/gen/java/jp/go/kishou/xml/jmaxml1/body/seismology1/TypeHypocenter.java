
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Hypocenter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Hypocenter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoArea"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Accuracy" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Accuracy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Hypocenter", propOrder = {
    "area",
    "source",
    "accuracy"
})
public class TypeHypocenter {

    @XmlElement(name = "Area", required = true)
    protected TypeHypoArea area;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Accuracy")
    protected TypeAccuracy accuracy;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoArea }
     *     
     */
    public TypeHypoArea getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoArea }
     *     
     */
    public void setArea(TypeHypoArea value) {
        this.area = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccuracy }
     *     
     */
    public TypeAccuracy getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccuracy }
     *     
     */
    public void setAccuracy(TypeAccuracy value) {
        this.accuracy = value;
    }

}
