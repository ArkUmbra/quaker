
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Body complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Body"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetArea" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Area" minOccurs="0"/&gt;
 *         &lt;element name="Notice" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Warning" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MeteorologicalInfos" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.MeteorologicalInfos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Comment" minOccurs="0"/&gt;
 *         &lt;element name="OfficeInfo" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.OfficeInfo" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInfo" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.AdditionalInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Body", propOrder = {
    "targetArea",
    "notice",
    "warning",
    "meteorologicalInfos",
    "comment",
    "officeInfo",
    "additionalInfo"
})
public class TypeBody {

    @XmlElement(name = "TargetArea")
    protected TypeArea targetArea;
    @XmlElement(name = "Notice")
    protected List<String> notice;
    @XmlElement(name = "Warning")
    protected List<TypeWarning> warning;
    @XmlElement(name = "MeteorologicalInfos")
    protected List<TypeMeteorologicalInfos> meteorologicalInfos;
    @XmlElement(name = "Comment")
    protected TypeComment comment;
    @XmlElement(name = "OfficeInfo")
    protected TypeOfficeInfo officeInfo;
    @XmlElement(name = "AdditionalInfo")
    protected TypeAdditionalInfo additionalInfo;

    /**
     * Gets the value of the targetArea property.
     * 
     * @return
     *     possible object is
     *     {@link TypeArea }
     *     
     */
    public TypeArea getTargetArea() {
        return targetArea;
    }

    /**
     * Sets the value of the targetArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeArea }
     *     
     */
    public void setTargetArea(TypeArea value) {
        this.targetArea = value;
    }

    /**
     * Gets the value of the notice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotice() {
        if (notice == null) {
            notice = new ArrayList<String>();
        }
        return this.notice;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeWarning }
     * 
     * 
     */
    public List<TypeWarning> getWarning() {
        if (warning == null) {
            warning = new ArrayList<TypeWarning>();
        }
        return this.warning;
    }

    /**
     * Gets the value of the meteorologicalInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meteorologicalInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeteorologicalInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeMeteorologicalInfos }
     * 
     * 
     */
    public List<TypeMeteorologicalInfos> getMeteorologicalInfos() {
        if (meteorologicalInfos == null) {
            meteorologicalInfos = new ArrayList<TypeMeteorologicalInfos>();
        }
        return this.meteorologicalInfos;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link TypeComment }
     *     
     */
    public TypeComment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeComment }
     *     
     */
    public void setComment(TypeComment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the officeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfficeInfo }
     *     
     */
    public TypeOfficeInfo getOfficeInfo() {
        return officeInfo;
    }

    /**
     * Sets the value of the officeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfficeInfo }
     *     
     */
    public void setOfficeInfo(TypeOfficeInfo value) {
        this.officeInfo = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAdditionalInfo }
     *     
     */
    public TypeAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAdditionalInfo }
     *     
     */
    public void setAdditionalInfo(TypeAdditionalInfo value) {
        this.additionalInfo = value;
    }

}
