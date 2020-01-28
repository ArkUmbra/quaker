
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.ClimateProbabilityValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.ClimateProbabilityValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProbabilityOfBelowNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability"/&gt;
 *         &lt;element name="ProbabilityOfNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability"/&gt;
 *         &lt;element name="ProbabilityOfAboveNormal" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Probability"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="kind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="refID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ClimateProbabilityValues", propOrder = {
    "probabilityOfBelowNormal",
    "probabilityOfNormal",
    "probabilityOfAboveNormal"
})
public class TypeClimateProbabilityValues {

    @XmlElement(name = "ProbabilityOfBelowNormal", required = true)
    protected TypeProbability probabilityOfBelowNormal;
    @XmlElement(name = "ProbabilityOfNormal", required = true)
    protected TypeProbability probabilityOfNormal;
    @XmlElement(name = "ProbabilityOfAboveNormal", required = true)
    protected TypeProbability probabilityOfAboveNormal;
    @XmlAttribute(name = "kind", required = true)
    protected String kind;
    @XmlAttribute(name = "refID")
    @XmlSchemaType(name = "unsignedByte")
    protected Short refID;

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

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRefID(Short value) {
        this.refID = value;
    }

}
