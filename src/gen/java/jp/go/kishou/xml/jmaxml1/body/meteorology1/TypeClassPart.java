
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeAreaClass;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeIntensityClass;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeTyphoonClass;


/**
 * <p>Java class for type.ClassPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.ClassPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}TyphoonClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}AreaClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}IntensityClass" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ClassPart", propOrder = {
    "typhoonClass",
    "areaClass",
    "intensityClass",
    "time",
    "remark"
})
public class TypeClassPart {

    @XmlElement(name = "TyphoonClass", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeTyphoonClass typhoonClass;
    @XmlElement(name = "AreaClass", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeAreaClass areaClass;
    @XmlElement(name = "IntensityClass", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypeIntensityClass intensityClass;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * Gets the value of the typhoonClass property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTyphoonClass }
     *     
     */
    public TypeTyphoonClass getTyphoonClass() {
        return typhoonClass;
    }

    /**
     * Sets the value of the typhoonClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTyphoonClass }
     *     
     */
    public void setTyphoonClass(TypeTyphoonClass value) {
        this.typhoonClass = value;
    }

    /**
     * Gets the value of the areaClass property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAreaClass }
     *     
     */
    public TypeAreaClass getAreaClass() {
        return areaClass;
    }

    /**
     * Sets the value of the areaClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAreaClass }
     *     
     */
    public void setAreaClass(TypeAreaClass value) {
        this.areaClass = value;
    }

    /**
     * Gets the value of the intensityClass property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensityClass }
     *     
     */
    public TypeIntensityClass getIntensityClass() {
        return intensityClass;
    }

    /**
     * Sets the value of the intensityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensityClass }
     *     
     */
    public void setIntensityClass(TypeIntensityClass value) {
        this.intensityClass = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
