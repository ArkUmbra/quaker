
package jp.go.kishou.xml.jmaxml1.body.volcanology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         &lt;element name="Notice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolcanoInfo" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.volcanoInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AshInfos" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.ashInfos" minOccurs="0"/&gt;
 *         &lt;element name="VolcanoInfoContent" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.volcanoInfoContent" minOccurs="0"/&gt;
 *         &lt;element name="VolcanoObservation" type="{http://xml.kishou.go.jp/jmaxml1/body/volcanology1/}type.volcanoObservation" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "type.Body", propOrder = {
    "notice",
    "volcanoInfo",
    "ashInfos",
    "volcanoInfoContent",
    "volcanoObservation",
    "text",
    "any"
})
public class TypeBody {

    @XmlElement(name = "Notice")
    protected String notice;
    @XmlElement(name = "VolcanoInfo")
    protected List<TypeVolcanoInfo> volcanoInfo;
    @XmlElement(name = "AshInfos")
    protected TypeAshInfos ashInfos;
    @XmlElement(name = "VolcanoInfoContent")
    protected TypeVolcanoInfoContent volcanoInfoContent;
    @XmlElement(name = "VolcanoObservation")
    protected TypeVolcanoObservation volcanoObservation;
    @XmlElement(name = "Text")
    protected String text;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the notice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotice() {
        return notice;
    }

    /**
     * Sets the value of the notice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotice(String value) {
        this.notice = value;
    }

    /**
     * Gets the value of the volcanoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volcanoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolcanoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeVolcanoInfo }
     * 
     * 
     */
    public List<TypeVolcanoInfo> getVolcanoInfo() {
        if (volcanoInfo == null) {
            volcanoInfo = new ArrayList<TypeVolcanoInfo>();
        }
        return this.volcanoInfo;
    }

    /**
     * Gets the value of the ashInfos property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAshInfos }
     *     
     */
    public TypeAshInfos getAshInfos() {
        return ashInfos;
    }

    /**
     * Sets the value of the ashInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAshInfos }
     *     
     */
    public void setAshInfos(TypeAshInfos value) {
        this.ashInfos = value;
    }

    /**
     * Gets the value of the volcanoInfoContent property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVolcanoInfoContent }
     *     
     */
    public TypeVolcanoInfoContent getVolcanoInfoContent() {
        return volcanoInfoContent;
    }

    /**
     * Sets the value of the volcanoInfoContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVolcanoInfoContent }
     *     
     */
    public void setVolcanoInfoContent(TypeVolcanoInfoContent value) {
        this.volcanoInfoContent = value;
    }

    /**
     * Gets the value of the volcanoObservation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVolcanoObservation }
     *     
     */
    public TypeVolcanoObservation getVolcanoObservation() {
        return volcanoObservation;
    }

    /**
     * Sets the value of the volcanoObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVolcanoObservation }
     *     
     */
    public void setVolcanoObservation(TypeVolcanoObservation value) {
        this.volcanoObservation = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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
