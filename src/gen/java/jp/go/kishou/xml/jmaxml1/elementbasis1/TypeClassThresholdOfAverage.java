
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.ClassThresholdOfAverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.ClassThresholdOfAverage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ThresholdOfMinimum" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdOfSignificantlyBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdOfBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdOfAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdOfSignificantlyAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdOfMaximum" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ClassThresholdOfAverage", propOrder = {
    "thresholdOfMinimum",
    "thresholdOfSignificantlyBelowNormal",
    "thresholdOfBelowNormal",
    "thresholdOfAboveNormal",
    "thresholdOfSignificantlyAboveNormal",
    "thresholdOfMaximum"
})
public class TypeClassThresholdOfAverage {

    @XmlElement(name = "ThresholdOfMinimum")
    protected TypeThreshold thresholdOfMinimum;
    @XmlElement(name = "ThresholdOfSignificantlyBelowNormal")
    protected TypeThreshold thresholdOfSignificantlyBelowNormal;
    @XmlElement(name = "ThresholdOfBelowNormal")
    protected TypeThreshold thresholdOfBelowNormal;
    @XmlElement(name = "ThresholdOfAboveNormal")
    protected TypeThreshold thresholdOfAboveNormal;
    @XmlElement(name = "ThresholdOfSignificantlyAboveNormal")
    protected TypeThreshold thresholdOfSignificantlyAboveNormal;
    @XmlElement(name = "ThresholdOfMaximum")
    protected TypeThreshold thresholdOfMaximum;

    /**
     * Gets the value of the thresholdOfMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfMinimum() {
        return thresholdOfMinimum;
    }

    /**
     * Sets the value of the thresholdOfMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfMinimum(TypeThreshold value) {
        this.thresholdOfMinimum = value;
    }

    /**
     * Gets the value of the thresholdOfSignificantlyBelowNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfSignificantlyBelowNormal() {
        return thresholdOfSignificantlyBelowNormal;
    }

    /**
     * Sets the value of the thresholdOfSignificantlyBelowNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfSignificantlyBelowNormal(TypeThreshold value) {
        this.thresholdOfSignificantlyBelowNormal = value;
    }

    /**
     * Gets the value of the thresholdOfBelowNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfBelowNormal() {
        return thresholdOfBelowNormal;
    }

    /**
     * Sets the value of the thresholdOfBelowNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfBelowNormal(TypeThreshold value) {
        this.thresholdOfBelowNormal = value;
    }

    /**
     * Gets the value of the thresholdOfAboveNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfAboveNormal() {
        return thresholdOfAboveNormal;
    }

    /**
     * Sets the value of the thresholdOfAboveNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfAboveNormal(TypeThreshold value) {
        this.thresholdOfAboveNormal = value;
    }

    /**
     * Gets the value of the thresholdOfSignificantlyAboveNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfSignificantlyAboveNormal() {
        return thresholdOfSignificantlyAboveNormal;
    }

    /**
     * Sets the value of the thresholdOfSignificantlyAboveNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfSignificantlyAboveNormal(TypeThreshold value) {
        this.thresholdOfSignificantlyAboveNormal = value;
    }

    /**
     * Gets the value of the thresholdOfMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link TypeThreshold }
     *     
     */
    public TypeThreshold getThresholdOfMaximum() {
        return thresholdOfMaximum;
    }

    /**
     * Sets the value of the thresholdOfMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeThreshold }
     *     
     */
    public void setThresholdOfMaximum(TypeThreshold value) {
        this.thresholdOfMaximum = value;
    }

}
