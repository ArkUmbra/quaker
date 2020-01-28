
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for type.PrefectureCity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.PrefectureCity"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="partType" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.PrefectureCity.partType.attr" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.PrefectureCity", propOrder = {
    "value"
})
public class TypePrefectureCity {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "partType")
    protected EnumTypePrefectureCityPartTypeAttr partType;

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
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypePrefectureCityPartTypeAttr }
     *     
     */
    public EnumTypePrefectureCityPartTypeAttr getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypePrefectureCityPartTypeAttr }
     *     
     */
    public void setPartType(EnumTypePrefectureCityPartTypeAttr value) {
        this.partType = value;
    }

}
