
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for type.TsunamiItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.TsunamiItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.ForecastArea"/&gt;
 *         &lt;element name="Category" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Category" minOccurs="0"/&gt;
 *         &lt;element name="FirstHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.FirstHeight" minOccurs="0"/&gt;
 *         &lt;element name="MaxHeight" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.MaxHeight" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Station" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiStation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.TsunamiItem", propOrder = {
    "area",
    "category",
    "firstHeight",
    "maxHeight",
    "duration",
    "station"
})
public class TypeTsunamiItem {

    @XmlElement(name = "Area", required = true)
    protected TypeForecastArea area;
    @XmlElement(name = "Category")
    protected TypeCategory category;
    @XmlElement(name = "FirstHeight")
    protected TypeFirstHeight firstHeight;
    @XmlElement(name = "MaxHeight")
    protected TypeMaxHeight maxHeight;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "Station")
    protected List<TypeTsunamiStation> station;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastArea }
     *     
     */
    public TypeForecastArea getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastArea }
     *     
     */
    public void setArea(TypeForecastArea value) {
        this.area = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCategory }
     *     
     */
    public TypeCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCategory }
     *     
     */
    public void setCategory(TypeCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the firstHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFirstHeight }
     *     
     */
    public TypeFirstHeight getFirstHeight() {
        return firstHeight;
    }

    /**
     * Sets the value of the firstHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFirstHeight }
     *     
     */
    public void setFirstHeight(TypeFirstHeight value) {
        this.firstHeight = value;
    }

    /**
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMaxHeight }
     *     
     */
    public TypeMaxHeight getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMaxHeight }
     *     
     */
    public void setMaxHeight(TypeMaxHeight value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the station property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTsunamiStation }
     * 
     * 
     */
    public List<TypeTsunamiStation> getStation() {
        if (station == null) {
            station = new ArrayList<TypeTsunamiStation>();
        }
        return this.station;
    }

}
