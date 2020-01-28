
package jp.go.kishou.xml.jmaxml1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.control.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.control.Status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="通常"/&gt;
 *     &lt;enumeration value="訓練"/&gt;
 *     &lt;enumeration value="試験"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.control.Status")
@XmlEnum
public enum EnumTypeControlStatus {

    通常,
    訓練,
    試験;

    public String value() {
        return name();
    }

    public static EnumTypeControlStatus fromValue(String v) {
        return valueOf(v);
    }

}
