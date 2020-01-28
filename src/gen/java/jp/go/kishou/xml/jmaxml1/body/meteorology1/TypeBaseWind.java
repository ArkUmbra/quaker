
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindDegree;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindDirection;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindScale;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindSpeed;


/**
 * <p>Java class for type.BaseWind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.BaseWind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeModifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindDirection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindDegree" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindSpeed" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindScale" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Local" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.LocalWind" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "type.BaseWind", propOrder = {
    "timeModifier",
    "windDirection",
    "windDegree",
    "windSpeed",
    "windScale",
    "local",
    "time",
    "remark"
})
public class TypeBaseWind {

    @XmlElement(name = "TimeModifier")
    protected String timeModifier;
    @XmlElement(name = "WindDirection", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindDirection> windDirection;
    @XmlElement(name = "WindDegree", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindDegree> windDegree;
    @XmlElement(name = "WindSpeed", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindSpeed> windSpeed;
    @XmlElement(name = "WindScale", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindScale> windScale;
    @XmlElement(name = "Local")
    protected List<TypeLocalWind> local;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * Gets the value of the timeModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeModifier() {
        return timeModifier;
    }

    /**
     * Sets the value of the timeModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeModifier(String value) {
        this.timeModifier = value;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindDirection }
     * 
     * 
     */
    public List<TypeWindDirection> getWindDirection() {
        if (windDirection == null) {
            windDirection = new ArrayList<TypeWindDirection>();
        }
        return this.windDirection;
    }

    /**
     * Gets the value of the windDegree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windDegree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindDegree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindDegree }
     * 
     * 
     */
    public List<TypeWindDegree> getWindDegree() {
        if (windDegree == null) {
            windDegree = new ArrayList<TypeWindDegree>();
        }
        return this.windDegree;
    }

    /**
     * Gets the value of the windSpeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windSpeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindSpeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindSpeed }
     * 
     * 
     */
    public List<TypeWindSpeed> getWindSpeed() {
        if (windSpeed == null) {
            windSpeed = new ArrayList<TypeWindSpeed>();
        }
        return this.windSpeed;
    }

    /**
     * Gets the value of the windScale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windScale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindScale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWindScale }
     * 
     * 
     */
    public List<TypeWindScale> getWindScale() {
        if (windScale == null) {
            windScale = new ArrayList<TypeWindScale>();
        }
        return this.windScale;
    }

    /**
     * Gets the value of the local property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the local property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeLocalWind }
     * 
     * 
     */
    public List<TypeLocalWind> getLocal() {
        if (local == null) {
            local = new ArrayList<TypeLocalWind>();
        }
        return this.local;
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
