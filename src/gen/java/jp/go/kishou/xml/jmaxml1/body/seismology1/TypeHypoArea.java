
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;


/**
 * <p>Java class for type.HypoArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.HypoArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Code" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaCode"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Coordinate" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReduceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReduceCode" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaReduceCode" minOccurs="0"/&gt;
 *         &lt;element name="DetailedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DetailedCode" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaDetailedCode" minOccurs="0"/&gt;
 *         &lt;element name="NameFromMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarkCode" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaMarkCode" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.HypoAreaDistance" minOccurs="0"/&gt;
 *         &lt;element name="LandOrSea" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}enum.type.HypoArea.LandOrSea" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.HypoArea", propOrder = {
    "name",
    "code",
    "coordinate",
    "reduceName",
    "reduceCode",
    "detailedName",
    "detailedCode",
    "nameFromMark",
    "markCode",
    "direction",
    "distance",
    "landOrSea"
})
public class TypeHypoArea {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected TypeHypoAreaCode code;
    @XmlElement(name = "Coordinate", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected List<TypeCoordinate> coordinate;
    @XmlElement(name = "ReduceName")
    protected String reduceName;
    @XmlElement(name = "ReduceCode")
    protected TypeHypoAreaReduceCode reduceCode;
    @XmlElement(name = "DetailedName")
    protected String detailedName;
    @XmlElement(name = "DetailedCode")
    protected TypeHypoAreaDetailedCode detailedCode;
    @XmlElement(name = "NameFromMark")
    protected String nameFromMark;
    @XmlElement(name = "MarkCode")
    protected TypeHypoAreaMarkCode markCode;
    @XmlElement(name = "Direction")
    protected String direction;
    @XmlElement(name = "Distance")
    protected TypeHypoAreaDistance distance;
    @XmlElement(name = "LandOrSea")
    @XmlSchemaType(name = "string")
    protected EnumTypeHypoAreaLandOrSea landOrSea;

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
     *     {@link TypeHypoAreaCode }
     *     
     */
    public TypeHypoAreaCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaCode }
     *     
     */
    public void setCode(TypeHypoAreaCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the coordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCoordinate }
     * 
     * 
     */
    public List<TypeCoordinate> getCoordinate() {
        if (coordinate == null) {
            coordinate = new ArrayList<TypeCoordinate>();
        }
        return this.coordinate;
    }

    /**
     * Gets the value of the reduceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReduceName() {
        return reduceName;
    }

    /**
     * Sets the value of the reduceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReduceName(String value) {
        this.reduceName = value;
    }

    /**
     * Gets the value of the reduceCode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoAreaReduceCode }
     *     
     */
    public TypeHypoAreaReduceCode getReduceCode() {
        return reduceCode;
    }

    /**
     * Sets the value of the reduceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaReduceCode }
     *     
     */
    public void setReduceCode(TypeHypoAreaReduceCode value) {
        this.reduceCode = value;
    }

    /**
     * Gets the value of the detailedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedName() {
        return detailedName;
    }

    /**
     * Sets the value of the detailedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedName(String value) {
        this.detailedName = value;
    }

    /**
     * Gets the value of the detailedCode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoAreaDetailedCode }
     *     
     */
    public TypeHypoAreaDetailedCode getDetailedCode() {
        return detailedCode;
    }

    /**
     * Sets the value of the detailedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaDetailedCode }
     *     
     */
    public void setDetailedCode(TypeHypoAreaDetailedCode value) {
        this.detailedCode = value;
    }

    /**
     * Gets the value of the nameFromMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFromMark() {
        return nameFromMark;
    }

    /**
     * Sets the value of the nameFromMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFromMark(String value) {
        this.nameFromMark = value;
    }

    /**
     * Gets the value of the markCode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoAreaMarkCode }
     *     
     */
    public TypeHypoAreaMarkCode getMarkCode() {
        return markCode;
    }

    /**
     * Sets the value of the markCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaMarkCode }
     *     
     */
    public void setMarkCode(TypeHypoAreaMarkCode value) {
        this.markCode = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHypoAreaDistance }
     *     
     */
    public TypeHypoAreaDistance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHypoAreaDistance }
     *     
     */
    public void setDistance(TypeHypoAreaDistance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the landOrSea property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeHypoAreaLandOrSea }
     *     
     */
    public EnumTypeHypoAreaLandOrSea getLandOrSea() {
        return landOrSea;
    }

    /**
     * Sets the value of the landOrSea property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeHypoAreaLandOrSea }
     *     
     */
    public void setLandOrSea(EnumTypeHypoAreaLandOrSea value) {
        this.landOrSea = value;
    }

}
