
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypeDateTime;


/**
 * <p>Java class for type.Kind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Kind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastKind" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.NextKind" minOccurs="0"/&gt;
 *         &lt;element name="NextKinds" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.NextKinds" minOccurs="0"/&gt;
 *         &lt;element name="Attention" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Attention" minOccurs="0"/&gt;
 *         &lt;element name="WarningNotice" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.WarningNotice" minOccurs="0"/&gt;
 *         &lt;element name="Addition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Addition" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" type="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}type.DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Property" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Kind", propOrder = {
    "name",
    "code",
    "status",
    "className",
    "condition",
    "lastKind",
    "nextKinds",
    "attention",
    "warningNotice",
    "addition",
    "dateTime",
    "property"
})
public class TypeKind {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "LastKind")
    protected TypeNextKind lastKind;
    @XmlElement(name = "NextKinds")
    protected TypeNextKinds nextKinds;
    @XmlElement(name = "Attention")
    protected TypeAttention attention;
    @XmlElement(name = "WarningNotice")
    protected TypeWarningNotice warningNotice;
    @XmlElement(name = "Addition")
    protected TypeAddition addition;
    @XmlElement(name = "DateTime")
    protected TypeDateTime dateTime;
    @XmlElement(name = "Property")
    protected List<TypeProperty> property;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
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
     * Gets the value of the lastKind property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNextKind }
     *     
     */
    public TypeNextKind getLastKind() {
        return lastKind;
    }

    /**
     * Sets the value of the lastKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNextKind }
     *     
     */
    public void setLastKind(TypeNextKind value) {
        this.lastKind = value;
    }

    /**
     * Gets the value of the nextKinds property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNextKinds }
     *     
     */
    public TypeNextKinds getNextKinds() {
        return nextKinds;
    }

    /**
     * Sets the value of the nextKinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNextKinds }
     *     
     */
    public void setNextKinds(TypeNextKinds value) {
        this.nextKinds = value;
    }

    /**
     * Gets the value of the attention property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAttention }
     *     
     */
    public TypeAttention getAttention() {
        return attention;
    }

    /**
     * Sets the value of the attention property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAttention }
     *     
     */
    public void setAttention(TypeAttention value) {
        this.attention = value;
    }

    /**
     * Gets the value of the warningNotice property.
     * 
     * @return
     *     possible object is
     *     {@link TypeWarningNotice }
     *     
     */
    public TypeWarningNotice getWarningNotice() {
        return warningNotice;
    }

    /**
     * Sets the value of the warningNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWarningNotice }
     *     
     */
    public void setWarningNotice(TypeWarningNotice value) {
        this.warningNotice = value;
    }

    /**
     * Gets the value of the addition property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAddition }
     *     
     */
    public TypeAddition getAddition() {
        return addition;
    }

    /**
     * Sets the value of the addition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAddition }
     *     
     */
    public void setAddition(TypeAddition value) {
        this.addition = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateTime }
     *     
     */
    public TypeDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateTime }
     *     
     */
    public void setDateTime(TypeDateTime value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeProperty }
     * 
     * 
     */
    public List<TypeProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<TypeProperty>();
        }
        return this.property;
    }

}
