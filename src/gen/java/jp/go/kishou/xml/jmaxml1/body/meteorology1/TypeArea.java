
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCircle;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeCoordinate;


/**
 * <p>Java class for type.Area complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Area"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prefecture" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PrefectureCity" minOccurs="0"/&gt;
 *         &lt;element name="PrefectureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrefectureList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.PrefectureList" minOccurs="0"/&gt;
 *         &lt;element name="PrefectureCodeList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.PrefectureCodeList" minOccurs="0"/&gt;
 *         &lt;element name="SubPrefecture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubPrefectureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubPrefectureList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.SubPrefectureList" minOccurs="0"/&gt;
 *         &lt;element name="SubPrefectureCodeList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.SubPrefectureCodeList" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.PrefectureCity" minOccurs="0"/&gt;
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.CityList" minOccurs="0"/&gt;
 *         &lt;element name="CityCodeList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.CityCodeList" minOccurs="0"/&gt;
 *         &lt;element name="SubCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubCityList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.SubCityList" minOccurs="0"/&gt;
 *         &lt;element name="SubCityCodeList" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}list.type.Area.SubCityCodeList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Circle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Coordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Line" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}Polygon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.Area.Status" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="codeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Area", propOrder = {
    "name",
    "code",
    "prefecture",
    "prefectureCode",
    "prefectureList",
    "prefectureCodeList",
    "subPrefecture",
    "subPrefectureCode",
    "subPrefectureList",
    "subPrefectureCodeList",
    "city",
    "cityCode",
    "cityList",
    "cityCodeList",
    "subCity",
    "subCityCode",
    "subCityList",
    "subCityCodeList",
    "circle",
    "coordinate",
    "line",
    "polygon",
    "location",
    "status"
})
public class TypeArea {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Prefecture")
    protected TypePrefectureCity prefecture;
    @XmlElement(name = "PrefectureCode")
    protected String prefectureCode;
    @XmlList
    @XmlElement(name = "PrefectureList")
    protected List<String> prefectureList;
    @XmlList
    @XmlElement(name = "PrefectureCodeList")
    protected List<String> prefectureCodeList;
    @XmlElement(name = "SubPrefecture")
    protected String subPrefecture;
    @XmlElement(name = "SubPrefectureCode")
    protected String subPrefectureCode;
    @XmlList
    @XmlElement(name = "SubPrefectureList")
    protected List<String> subPrefectureList;
    @XmlList
    @XmlElement(name = "SubPrefectureCodeList")
    protected List<String> subPrefectureCodeList;
    @XmlElement(name = "City")
    protected TypePrefectureCity city;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlList
    @XmlElement(name = "CityList")
    protected List<String> cityList;
    @XmlList
    @XmlElement(name = "CityCodeList")
    protected List<String> cityCodeList;
    @XmlElement(name = "SubCity")
    protected String subCity;
    @XmlElement(name = "SubCityCode")
    protected String subCityCode;
    @XmlList
    @XmlElement(name = "SubCityList")
    protected List<String> subCityList;
    @XmlList
    @XmlElement(name = "SubCityCodeList")
    protected List<String> subCityCodeList;
    @XmlElement(name = "Circle", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCircle> circle;
    @XmlElement(name = "Coordinate", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> coordinate;
    @XmlElement(name = "Line", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> line;
    @XmlElement(name = "Polygon", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeCoordinate> polygon;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected EnumTypeAreaStatus status;
    @XmlAttribute(name = "codeType")
    protected String codeType;

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
     * Gets the value of the prefecture property.
     * 
     * @return
     *     possible object is
     *     {@link TypePrefectureCity }
     *     
     */
    public TypePrefectureCity getPrefecture() {
        return prefecture;
    }

    /**
     * Sets the value of the prefecture property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrefectureCity }
     *     
     */
    public void setPrefecture(TypePrefectureCity value) {
        this.prefecture = value;
    }

    /**
     * Gets the value of the prefectureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefectureCode() {
        return prefectureCode;
    }

    /**
     * Sets the value of the prefectureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefectureCode(String value) {
        this.prefectureCode = value;
    }

    /**
     * Gets the value of the prefectureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefectureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefectureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrefectureList() {
        if (prefectureList == null) {
            prefectureList = new ArrayList<String>();
        }
        return this.prefectureList;
    }

    /**
     * Gets the value of the prefectureCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefectureCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefectureCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrefectureCodeList() {
        if (prefectureCodeList == null) {
            prefectureCodeList = new ArrayList<String>();
        }
        return this.prefectureCodeList;
    }

    /**
     * Gets the value of the subPrefecture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPrefecture() {
        return subPrefecture;
    }

    /**
     * Sets the value of the subPrefecture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPrefecture(String value) {
        this.subPrefecture = value;
    }

    /**
     * Gets the value of the subPrefectureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPrefectureCode() {
        return subPrefectureCode;
    }

    /**
     * Sets the value of the subPrefectureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPrefectureCode(String value) {
        this.subPrefectureCode = value;
    }

    /**
     * Gets the value of the subPrefectureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPrefectureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPrefectureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubPrefectureList() {
        if (subPrefectureList == null) {
            subPrefectureList = new ArrayList<String>();
        }
        return this.subPrefectureList;
    }

    /**
     * Gets the value of the subPrefectureCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPrefectureCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPrefectureCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubPrefectureCodeList() {
        if (subPrefectureCodeList == null) {
            subPrefectureCodeList = new ArrayList<String>();
        }
        return this.subPrefectureCodeList;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link TypePrefectureCity }
     *     
     */
    public TypePrefectureCity getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrefectureCity }
     *     
     */
    public void setCity(TypePrefectureCity value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the cityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCityList() {
        if (cityList == null) {
            cityList = new ArrayList<String>();
        }
        return this.cityList;
    }

    /**
     * Gets the value of the cityCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCityCodeList() {
        if (cityCodeList == null) {
            cityCodeList = new ArrayList<String>();
        }
        return this.cityCodeList;
    }

    /**
     * Gets the value of the subCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCity() {
        return subCity;
    }

    /**
     * Sets the value of the subCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCity(String value) {
        this.subCity = value;
    }

    /**
     * Gets the value of the subCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCityCode() {
        return subCityCode;
    }

    /**
     * Sets the value of the subCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCityCode(String value) {
        this.subCityCode = value;
    }

    /**
     * Gets the value of the subCityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubCityList() {
        if (subCityList == null) {
            subCityList = new ArrayList<String>();
        }
        return this.subCityList;
    }

    /**
     * Gets the value of the subCityCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCityCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCityCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubCityCodeList() {
        if (subCityCodeList == null) {
            subCityCodeList = new ArrayList<String>();
        }
        return this.subCityCodeList;
    }

    /**
     * Gets the value of the circle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the circle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCircle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCircle }
     * 
     * 
     */
    public List<TypeCircle> getCircle() {
        if (circle == null) {
            circle = new ArrayList<TypeCircle>();
        }
        return this.circle;
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
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCoordinate }
     * 
     * 
     */
    public List<TypeCoordinate> getLine() {
        if (line == null) {
            line = new ArrayList<TypeCoordinate>();
        }
        return this.line;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCoordinate }
     * 
     * 
     */
    public List<TypeCoordinate> getPolygon() {
        if (polygon == null) {
            polygon = new ArrayList<TypeCoordinate>();
        }
        return this.polygon;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeAreaStatus }
     *     
     */
    public EnumTypeAreaStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeAreaStatus }
     *     
     */
    public void setStatus(EnumTypeAreaStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the codeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * Sets the value of the codeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeType(String value) {
        this.codeType = value;
    }

}
