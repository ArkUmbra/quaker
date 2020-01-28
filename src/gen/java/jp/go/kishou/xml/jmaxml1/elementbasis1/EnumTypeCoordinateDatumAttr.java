
package jp.go.kishou.xml.jmaxml1.elementbasis1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.Coordinate.datum.attr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.Coordinate.datum.attr"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="日本測地系"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.Coordinate.datum.attr")
@XmlEnum
public enum EnumTypeCoordinateDatumAttr {

    日本測地系;

    public String value() {
        return name();
    }

    public static EnumTypeCoordinateDatumAttr fromValue(String v) {
        return valueOf(v);
    }

}
