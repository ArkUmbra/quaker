
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindDirection;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeWindSpeed;


/**
 * <p>Java class for type.WindForecastPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.WindForecastPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sentence" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Sentence" minOccurs="0"/&gt;
 *         &lt;element name="Base" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWind" minOccurs="0"/&gt;
 *         &lt;element name="Temporary" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Becoming" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.BaseWind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubArea" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.SubAreaWind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindDirection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}WindSpeed" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="refID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.WindForecastPart", propOrder = {
    "sentence",
    "base",
    "temporary",
    "becoming",
    "subArea",
    "windDirection",
    "windSpeed",
    "time",
    "remark"
})
public class TypeWindForecastPart {

    @XmlElement(name = "Sentence")
    protected TypeSentence sentence;
    @XmlElement(name = "Base")
    protected TypeBaseWind base;
    @XmlElement(name = "Temporary")
    protected List<TypeBaseWind> temporary;
    @XmlElement(name = "Becoming")
    protected List<TypeBaseWind> becoming;
    @XmlElement(name = "SubArea")
    protected List<TypeSubAreaWind> subArea;
    @XmlElement(name = "WindDirection", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindDirection> windDirection;
    @XmlElement(name = "WindSpeed", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected List<TypeWindSpeed> windSpeed;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "refID", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short refID;

    /**
     * Gets the value of the sentence property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSentence }
     *     
     */
    public TypeSentence getSentence() {
        return sentence;
    }

    /**
     * Sets the value of the sentence property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSentence }
     *     
     */
    public void setSentence(TypeSentence value) {
        this.sentence = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link TypeBaseWind }
     *     
     */
    public TypeBaseWind getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBaseWind }
     *     
     */
    public void setBase(TypeBaseWind value) {
        this.base = value;
    }

    /**
     * Gets the value of the temporary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temporary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemporary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseWind }
     * 
     * 
     */
    public List<TypeBaseWind> getTemporary() {
        if (temporary == null) {
            temporary = new ArrayList<TypeBaseWind>();
        }
        return this.temporary;
    }

    /**
     * Gets the value of the becoming property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the becoming property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBecoming().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseWind }
     * 
     * 
     */
    public List<TypeBaseWind> getBecoming() {
        if (becoming == null) {
            becoming = new ArrayList<TypeBaseWind>();
        }
        return this.becoming;
    }

    /**
     * Gets the value of the subArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSubAreaWind }
     * 
     * 
     */
    public List<TypeSubAreaWind> getSubArea() {
        if (subArea == null) {
            subArea = new ArrayList<TypeSubAreaWind>();
        }
        return this.subArea;
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

    /**
     * Gets the value of the refID property.
     * 
     */
    public short getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     */
    public void setRefID(short value) {
        this.refID = value;
    }

}
