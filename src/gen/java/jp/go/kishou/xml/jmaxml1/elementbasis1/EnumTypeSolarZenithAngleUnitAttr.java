
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.SolarZenithAngle.unit.attr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.SolarZenithAngle.unit.attr"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="度"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.SolarZenithAngle.unit.attr")
@XmlEnum
public enum EnumTypeSolarZenithAngleUnitAttr {

    度;

    public String value() {
        return name();
    }

    public static EnumTypeSolarZenithAngleUnitAttr fromValue(String v) {
        return valueOf(v);
    }

}
