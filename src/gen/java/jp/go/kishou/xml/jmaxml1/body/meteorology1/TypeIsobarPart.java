
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePressure;


/**
 * <p>Java class for type.IsobarPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.IsobarPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Pressure"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Line" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Polygon" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.IsobarPart", propOrder = {
    "pressure",
    "line",
    "polygon"
})
public class TypeIsobarPart {

    @XmlElement(name = "Pressure", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected TypePressure pressure;
    @XmlElement(name = "Line", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeCoordinate line;
    @XmlElement(name = "Polygon", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeCoordinate polygon;

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link TypePressure }
     *     
     */
    public TypePressure getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePressure }
     *     
     */
    public void setPressure(TypePressure value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinate }
     *     
     */
    public TypeCoordinate getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinate }
     *     
     */
    public void setLine(TypeCoordinate value) {
        this.line = value;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinate }
     *     
     */
    public TypeCoordinate getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinate }
     *     
     */
    public void setPolygon(TypeCoordinate value) {
        this.polygon = value;
    }

}
