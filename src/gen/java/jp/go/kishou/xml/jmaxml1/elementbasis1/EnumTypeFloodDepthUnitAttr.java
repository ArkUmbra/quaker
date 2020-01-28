
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.FloodDepth.unit.attr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.FloodDepth.unit.attr"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="m"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.FloodDepth.unit.attr")
@XmlEnum
public enum EnumTypeFloodDepthUnitAttr {

    @XmlEnumValue("m")
    M("m");
    private final String value;

    EnumTypeFloodDepthUnitAttr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTypeFloodDepthUnitAttr fromValue(String v) {
        for (EnumTypeFloodDepthUnitAttr c: EnumTypeFloodDepthUnitAttr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
