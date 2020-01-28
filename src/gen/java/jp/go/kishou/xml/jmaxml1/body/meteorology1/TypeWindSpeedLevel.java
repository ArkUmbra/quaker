
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for type.WindSpeedLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.WindSpeedLevel"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://xml.kishou.go.jp/jmaxml1/elementBasis1/&gt;nullablefloat"&gt;
 *       &lt;attribute name="type" use="required" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.WindSpeedLevel.type.attr" /&gt;
 *       &lt;attribute name="refID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="range" use="required" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.WindSpeedLevel.range.attr" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.WindSpeedLevel", propOrder = {
    "value"
})
public class TypeWindSpeedLevel {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type", required = true)
    protected EnumTypeWindSpeedLevelTypeAttr type;
    @XmlAttribute(name = "refID", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short refID;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "range", required = true)
    protected List<String> range;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeWindSpeedLevelTypeAttr }
     *     
     */
    public EnumTypeWindSpeedLevelTypeAttr getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeWindSpeedLevelTypeAttr }
     *     
     */
    public void setType(EnumTypeWindSpeedLevelTypeAttr value) {
        this.type = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     */
    public short getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     */
    public void setRefID(short value) {
        this.refID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the range property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRange() {
        if (range == null) {
            range = new ArrayList<String>();
        }
        return this.range;
    }

}
