
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kind" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Kind" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Areas" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Areas" minOccurs="0"/&gt;
 *         &lt;element name="Stations" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Stations" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Area" minOccurs="0"/&gt;
 *         &lt;element name="Station" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Station" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStatus" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.Item.ChangeStatus" minOccurs="0"/&gt;
 *         &lt;element name="FullStatus" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.Item.FullStatus" minOccurs="0"/&gt;
 *         &lt;element name="EditingMark" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}enum.type.Item.EditingMark" minOccurs="0"/&gt;
 *         &lt;element name="OtherReport" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Item", propOrder = {
    "kind",
    "areas",
    "stations",
    "area",
    "station",
    "changeStatus",
    "fullStatus",
    "editingMark",
    "otherReport"
})
public class TypeItem {

    @XmlElement(name = "Kind", required = true)
    protected List<TypeKind> kind;
    @XmlElement(name = "Areas")
    protected TypeAreas areas;
    @XmlElement(name = "Stations")
    protected TypeStations stations;
    @XmlElement(name = "Area")
    protected TypeArea area;
    @XmlElement(name = "Station")
    protected TypeStation station;
    @XmlElement(name = "ChangeStatus")
    @XmlSchemaType(name = "string")
    protected EnumTypeItemChangeStatus changeStatus;
    @XmlElement(name = "FullStatus")
    @XmlSchemaType(name = "string")
    protected EnumTypeItemFullStatus fullStatus;
    @XmlElement(name = "EditingMark")
    protected String editingMark;
    @XmlElement(name = "OtherReport")
    protected List<String> otherReport;

    /**
     * Gets the value of the kind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKind }
     * 
     * 
     */
    public List<TypeKind> getKind() {
        if (kind == null) {
            kind = new ArrayList<TypeKind>();
        }
        return this.kind;
    }

    /**
     * Gets the value of the areas property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAreas }
     *     
     */
    public TypeAreas getAreas() {
        return areas;
    }

    /**
     * Sets the value of the areas property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAreas }
     *     
     */
    public void setAreas(TypeAreas value) {
        this.areas = value;
    }

    /**
     * Gets the value of the stations property.
     * 
     * @return
     *     possible object is
     *     {@link TypeStations }
     *     
     */
    public TypeStations getStations() {
        return stations;
    }

    /**
     * Sets the value of the stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStations }
     *     
     */
    public void setStations(TypeStations value) {
        this.stations = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link TypeArea }
     *     
     */
    public TypeArea getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeArea }
     *     
     */
    public void setArea(TypeArea value) {
        this.area = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link TypeStation }
     *     
     */
    public TypeStation getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStation }
     *     
     */
    public void setStation(TypeStation value) {
        this.station = value;
    }

    /**
     * Gets the value of the changeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeItemChangeStatus }
     *     
     */
    public EnumTypeItemChangeStatus getChangeStatus() {
        return changeStatus;
    }

    /**
     * Sets the value of the changeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeItemChangeStatus }
     *     
     */
    public void setChangeStatus(EnumTypeItemChangeStatus value) {
        this.changeStatus = value;
    }

    /**
     * Gets the value of the fullStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeItemFullStatus }
     *     
     */
    public EnumTypeItemFullStatus getFullStatus() {
        return fullStatus;
    }

    /**
     * Sets the value of the fullStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeItemFullStatus }
     *     
     */
    public void setFullStatus(EnumTypeItemFullStatus value) {
        this.fullStatus = value;
    }

    /**
     * Gets the value of the editingMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditingMark() {
        return editingMark;
    }

    /**
     * Sets the value of the editingMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditingMark(String value) {
        this.editingMark = value;
    }

    /**
     * Gets the value of the otherReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherReport() {
        if (otherReport == null) {
            otherReport = new ArrayList<String>();
        }
        return this.otherReport;
    }

}
