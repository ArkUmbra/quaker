
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.DateTime.significant.attr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.DateTime.significant.attr"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="yyyy"/&gt;
 *     &lt;enumeration value="yyyy-mm"/&gt;
 *     &lt;enumeration value="yyyy-mm-dd"/&gt;
 *     &lt;enumeration value="yyyy-mm-ddThh"/&gt;
 *     &lt;enumeration value="yyyy-mm-ddThh:mm"/&gt;
 *     &lt;enumeration value="yyyy-mm-ddThh:mm:ss"/&gt;
 *     &lt;enumeration value="yyyy-mm-ddThh:mm:ss.sss"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.DateTime.significant.attr")
@XmlEnum
public enum EnumTypeDateTimeSignificantAttr {

    @XmlEnumValue("yyyy")
    YYYY("yyyy"),
    @XmlEnumValue("yyyy-mm")
    YYYY_MM("yyyy-mm"),
    @XmlEnumValue("yyyy-mm-dd")
    YYYY_MM_DD("yyyy-mm-dd"),
    @XmlEnumValue("yyyy-mm-ddThh")
    YYYY_MM_DD_THH("yyyy-mm-ddThh"),
    @XmlEnumValue("yyyy-mm-ddThh:mm")
    YYYY_MM_DD_THH_MM("yyyy-mm-ddThh:mm"),
    @XmlEnumValue("yyyy-mm-ddThh:mm:ss")
    YYYY_MM_DD_THH_MM_SS("yyyy-mm-ddThh:mm:ss"),
    @XmlEnumValue("yyyy-mm-ddThh:mm:ss.sss")
    YYYY_MM_DD_THH_MM_SS_SSS("yyyy-mm-ddThh:mm:ss.sss");
    private final String value;

    EnumTypeDateTimeSignificantAttr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTypeDateTimeSignificantAttr fromValue(String v) {
        for (EnumTypeDateTimeSignificantAttr c: EnumTypeDateTimeSignificantAttr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
