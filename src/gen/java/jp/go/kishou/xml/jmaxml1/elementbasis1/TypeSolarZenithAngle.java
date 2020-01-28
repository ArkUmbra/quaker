
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for type.SolarZenithAngle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.SolarZenithAngle"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
 *       &lt;attribute name="unit" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}enum.type.SolarZenithAngle.unit.attr" /&gt;
 *       &lt;attribute name="refID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
 *       &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.SolarZenithAngle", propOrder = {
    "value"
})
public class TypeSolarZenithAngle {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "unit")
    protected EnumTypeSolarZenithAngleUnitAttr unit;
    @XmlAttribute(name = "refID")
    @XmlSchemaType(name = "unsignedByte")
    protected Short refID;
    @XmlAttribute(name = "condition")
    protected String condition;

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeSolarZenithAngleUnitAttr }
     *     
     */
    public EnumTypeSolarZenithAngleUnitAttr getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeSolarZenithAngleUnitAttr }
     *     
     */
    public void setUnit(EnumTypeSolarZenithAngleUnitAttr value) {
        this.unit = value;
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

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

}
