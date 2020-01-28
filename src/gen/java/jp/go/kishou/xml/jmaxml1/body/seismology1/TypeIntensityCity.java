
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for type.IntensityCity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.IntensityCity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Category" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Category" minOccurs="0"/&gt;
 *         &lt;element name="MaxInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForecastInt" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.ForecastInt" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Revise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntensityStation" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityStation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.IntensityCity", propOrder = {
    "name",
    "code",
    "category",
    "maxInt",
    "forecastInt",
    "arrivalTime",
    "condition",
    "revise",
    "intensityStation"
})
public class TypeIntensityCity {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Category")
    protected TypeCategory category;
    @XmlElement(name = "MaxInt")
    protected String maxInt;
    @XmlElement(name = "ForecastInt")
    protected TypeForecastInt forecastInt;
    @XmlElement(name = "ArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "Revise")
    protected String revise;
    @XmlElement(name = "IntensityStation")
    protected List<TypeIntensityStation> intensityStation;

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
     * Gets the value of the maxInt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxInt() {
        return maxInt;
    }

    /**
     * Sets the value of the maxInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxInt(String value) {
        this.maxInt = value;
    }

    /**
     * Gets the value of the forecastInt property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastInt }
     *     
     */
    public TypeForecastInt getForecastInt() {
        return forecastInt;
    }

    /**
     * Sets the value of the forecastInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastInt }
     *     
     */
    public void setForecastInt(TypeForecastInt value) {
        this.forecastInt = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the revise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevise() {
        return revise;
    }

    /**
     * Sets the value of the revise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevise(String value) {
        this.revise = value;
    }

    /**
     * Gets the value of the intensityStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intensityStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntensityStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeIntensityStation }
     * 
     * 
     */
    public List<TypeIntensityStation> getIntensityStation() {
        if (intensityStation == null) {
            intensityStation = new ArrayList<TypeIntensityStation>();
        }
        return this.intensityStation;
    }

}
