
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.Item.ChangeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.Item.ChangeStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="警報・注意報種別に変化有"/&gt;
 *     &lt;enumeration value="警報・注意報種別に変化無、量的予想事項等に変化有"/&gt;
 *     &lt;enumeration value="変化無"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.Item.ChangeStatus")
@XmlEnum
public enum EnumTypeItemChangeStatus {

    @XmlEnumValue("\u8b66\u5831\u30fb\u6ce8\u610f\u5831\u7a2e\u5225\u306b\u5909\u5316\u6709")
    警報_注意報種別に変化有("\u8b66\u5831\u30fb\u6ce8\u610f\u5831\u7a2e\u5225\u306b\u5909\u5316\u6709"),
    @XmlEnumValue("\u8b66\u5831\u30fb\u6ce8\u610f\u5831\u7a2e\u5225\u306b\u5909\u5316\u7121\u3001\u91cf\u7684\u4e88\u60f3\u4e8b\u9805\u7b49\u306b\u5909\u5316\u6709")
    警報_注意報種別に変化無_量的予想事項等に変化有("\u8b66\u5831\u30fb\u6ce8\u610f\u5831\u7a2e\u5225\u306b\u5909\u5316\u7121\u3001\u91cf\u7684\u4e88\u60f3\u4e8b\u9805\u7b49\u306b\u5909\u5316\u6709"),
    変化無("\u5909\u5316\u7121");
    private final String value;

    EnumTypeItemChangeStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTypeItemChangeStatus fromValue(String v) {
        for (EnumTypeItemChangeStatus c: EnumTypeItemChangeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
