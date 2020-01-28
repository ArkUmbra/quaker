
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.SignificantClimateElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.SignificantClimateElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Text" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.ReferableString" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ProbabilityOfBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/&gt;
 *         &lt;element name="ProbabilityOfNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/&gt;
 *         &lt;element name="ProbabilityOfAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/&gt;
 *         &lt;element name="ProbabilityOfSignificantlyBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/&gt;
 *         &lt;element name="ProbabilityOfSignificantlyAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdOfBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdOfAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdOfSignificantlyBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *         &lt;element name="ThresholdOfSignificantlyAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Threshold" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="kind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.SignificantClimateElement", propOrder = {
    "text",
    "probabilityOfBelowNormal",
    "probabilityOfNormal",
    "probabilityOfAboveNormal",
    "probabilityOfSignificantlyBelowNormal",
    "probabilityOfSignificantlyAboveNormal",
    "thresholdOfBelowNormal",
    "thresholdOfAboveNormal",
    "thresholdOfSignificantlyBelowNormal",
    "thresholdOfSignificantlyAboveNormal"
})
public class TypeSignificantClimateElement {

    @XmlElement(name = "Text", required = true)
    protected List<TypeReferableString> text;
    @XmlElement(name = "ProbabilityOfBelowNormal")
    protected TypeProbability probabilityOfBelowNormal;
    @XmlElement(name = "ProbabilityOfNormal")
    protected TypeProbability probabilityOfNormal;
    @XmlElement(name = "ProbabilityOfAboveNormal")
    protected TypeProbability probabilityOfAboveNormal;
    @XmlElement(name = "ProbabilityOfSignificantlyBelowNormal")
    protected TypeProbability probabilityOfSignificantlyBelowNormal;
    @XmlElement(name = "ProbabilityOfSignificantlyAboveNormal")
    protected TypeProbability probabilityOfSignificantlyAboveNormal;
    @XmlElement(name = "ThresholdOfBelowNormal")
    protected TypeThreshold thresholdOfBelowNormal;
    @XmlElement(name = "ThresholdOfAboveNormal")
    protected TypeThreshold thresholdOfAboveNormal;
    @XmlElement(name = "ThresholdOfSignificantlyBelowNormal")
    protected TypeThreshold thresholdOfSignificantlyBelowNormal;
    @XmlElement(name = "ThresholdOfSignificantlyAboveNormal")
    protected TypeThreshold thresholdOfSignificantlyAboveNormal;
    @XmlAttribute(name = "kind", required = true)
    protected String kind;

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReferableString }
     * 
     * 
     */
    public List<TypeReferableString> getText() {
        if (text == null) {
            text = new ArrayList<TypeReferableString>();
        }
        return this.text;
    }

    /**
     * Gets the value of the probabilityOfBelowNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfBelowNormal() {
        return probabilityOfBelowNormal;
    }

    /**
     * Sets the value of the probabilityOfBelowNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfBelowNormal(TypeProbability value) {
        this.probabilityOfBelowNormal = value;
    }

    /**
     * Gets the value of the probabilityOfNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfNormal() {
        return probabilityOfNormal;
    }

    /**
     * Sets the value of the probabilityOfNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfNormal(TypeProbability value) {
        this.probabilityOfNormal = value;
    }

    /**
     * Gets the value of the probabilityOfAboveNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfAboveNormal() {
        return probabilityOfAboveNormal;
    }

    /**
     * Sets the value of the probabilityOfAboveNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfAboveNormal(TypeProbability value) {
        this.probabilityOfAboveNormal = value;
    }

    /**
     * Gets the value of the probabilityOfSignificantlyBelowNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfSignificantlyBelowNormal() {
        return probabilityOfSignificantlyBelowNormal;
    }

    /**
     * Sets the value of the probabilityOfSignificantlyBelowNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfSignificantlyBelowNormal(TypeProbability value) {
        this.probabilityOfSignificantlyBelowNormal = value;
    }

    /**
     * Gets the value of the probabilityOfSignificantlyAboveNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProbability }
     *     
     */
    public TypeProbability getProbabilityOfSignificantlyAboveNormal() {
        return probabilityOfSignificantlyAboveNormal;
    }

    /**
     * Sets the value of the probabilityOfSignificantlyAboveNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProbability }
     *     
     */
    public void setProbabilityOfSignificantlyAboveNormal(TypeProbability value) {
        this.probabilityOfSignificantlyAboveNormal = value;
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
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

}
