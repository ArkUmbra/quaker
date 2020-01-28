
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.WindSpeedLevel.type.attr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.WindSpeedLevel.type.attr"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="風速階級"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.WindSpeedLevel.type.attr")
@XmlEnum
public enum EnumTypeWindSpeedLevelTypeAttr {

    風速階級;

    public String value() {
        return name();
    }

    public static EnumTypeWindSpeedLevelTypeAttr fromValue(String v) {
        return valueOf(v);
    }

}
