
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.Area.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.Area.Status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="付近"/&gt;
 *     &lt;enumeration value="臨時支援"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.Area.Status")
@XmlEnum
public enum EnumTypeAreaStatus {

    付近,
    臨時支援;

    public String value() {
        return name();
    }

    public static EnumTypeAreaStatus fromValue(String v) {
        return valueOf(v);
    }

}
