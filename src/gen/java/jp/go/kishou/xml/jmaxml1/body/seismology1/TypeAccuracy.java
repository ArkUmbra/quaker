
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Accuracy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Accuracy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Epicenter" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.AccuracyEpicenter"/&gt;
 *         &lt;element name="Depth" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.AccuracyDepth"/&gt;
 *         &lt;element name="MagnitudeCalculation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.AccuracyMagnitude"/&gt;
 *         &lt;element name="NumberOfMagnitudeCalculation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Accuracy", propOrder = {
    "epicenter",
    "depth",
    "magnitudeCalculation",
    "numberOfMagnitudeCalculation"
})
public class TypeAccuracy {

    @XmlElement(name = "Epicenter", required = true)
    protected TypeAccuracyEpicenter epicenter;
    @XmlElement(name = "Depth", required = true)
    protected TypeAccuracyDepth depth;
    @XmlElement(name = "MagnitudeCalculation", required = true)
    protected TypeAccuracyMagnitude magnitudeCalculation;
    @XmlElement(name = "NumberOfMagnitudeCalculation")
    protected int numberOfMagnitudeCalculation;

    /**
     * Gets the value of the epicenter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccuracyEpicenter }
     *     
     */
    public TypeAccuracyEpicenter getEpicenter() {
        return epicenter;
    }

    /**
     * Sets the value of the epicenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccuracyEpicenter }
     *     
     */
    public void setEpicenter(TypeAccuracyEpicenter value) {
        this.epicenter = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccuracyDepth }
     *     
     */
    public TypeAccuracyDepth getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccuracyDepth }
     *     
     */
    public void setDepth(TypeAccuracyDepth value) {
        this.depth = value;
    }

    /**
     * Gets the value of the magnitudeCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccuracyMagnitude }
     *     
     */
    public TypeAccuracyMagnitude getMagnitudeCalculation() {
        return magnitudeCalculation;
    }

    /**
     * Sets the value of the magnitudeCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccuracyMagnitude }
     *     
     */
    public void setMagnitudeCalculation(TypeAccuracyMagnitude value) {
        this.magnitudeCalculation = value;
    }

    /**
     * Gets the value of the numberOfMagnitudeCalculation property.
     * 
     */
    public int getNumberOfMagnitudeCalculation() {
        return numberOfMagnitudeCalculation;
    }

    /**
     * Sets the value of the numberOfMagnitudeCalculation property.
     * 
     */
    public void setNumberOfMagnitudeCalculation(int value) {
        this.numberOfMagnitudeCalculation = value;
    }

}
