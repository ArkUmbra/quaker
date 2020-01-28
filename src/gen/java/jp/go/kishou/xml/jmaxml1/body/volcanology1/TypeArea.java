
package jp.go.kishou.xml.jmaxml1.body.volcanology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;
import org.w3c.dom.Element;


/**
 * <p>Java class for type.area complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.area"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Coordinate" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="AreaFromMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CraterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CraterCoordinate" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.Coordinate" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='http://xml.kishou.go.jp/jmaxml1/addition1/' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.area", propOrder = {
    "name",
    "code",
    "coordinate",
    "areaFromMark",
    "craterName",
    "craterCoordinate",
    "any"
})
public class TypeArea {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Coordinate")
    protected TypeCoordinate coordinate;
    @XmlElement(name = "AreaFromMark")
    protected String areaFromMark;
    @XmlElement(name = "CraterName")
    protected String craterName;
    @XmlElement(name = "CraterCoordinate")
    protected TypeCoordinate craterCoordinate;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the coordinate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinate }
     *     
     */
    public TypeCoordinate getCoordinate() {
        return coordinate;
    }

    /**
     * Sets the value of the coordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinate }
     *     
     */
    public void setCoordinate(TypeCoordinate value) {
        this.coordinate = value;
    }

    /**
     * Gets the value of the areaFromMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaFromMark() {
        return areaFromMark;
    }

    /**
     * Sets the value of the areaFromMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaFromMark(String value) {
        this.areaFromMark = value;
    }

    /**
     * Gets the value of the craterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCraterName() {
        return craterName;
    }

    /**
     * Sets the value of the craterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCraterName(String value) {
        this.craterName = value;
    }

    /**
     * Gets the value of the craterCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCoordinate }
     *     
     */
    public TypeCoordinate getCraterCoordinate() {
        return craterCoordinate;
    }

    /**
     * Sets the value of the craterCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoordinate }
     *     
     */
    public void setCraterCoordinate(TypeCoordinate value) {
        this.craterCoordinate = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
