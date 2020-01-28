
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enum.type.HypoArea.LandOrSea.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enum.type.HypoArea.LandOrSea"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="内陸"/&gt;
 *     &lt;enumeration value="海域"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enum.type.HypoArea.LandOrSea")
@XmlEnum
public enum EnumTypeHypoAreaLandOrSea {

    内陸,
    海域;

    public String value() {
        return name();
    }

    public static EnumTypeHypoAreaLandOrSea fromValue(String v) {
        return valueOf(v);
    }

}
