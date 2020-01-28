
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.PrefectureCity.partType.attr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.PrefectureCity.partType.attr"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="全域"/&gt;
 *     &lt;enumeration value="一部"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.PrefectureCity.partType.attr")
@XmlEnum
public enum EnumTypePrefectureCityPartTypeAttr {

    全域,
    一部;

    public String value() {
        return name();
    }

    public static EnumTypePrefectureCityPartTypeAttr fromValue(String v) {
        return valueOf(v);
    }

}
