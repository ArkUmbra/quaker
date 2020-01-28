
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
 * <p>Java class for type.volcanoInfoContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.volcanoInfoContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VolcanoHeadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolcanoActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolcanoPrevention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NextAdvisory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Appendix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "type.volcanoInfoContent", propOrder = {
    "volcanoHeadline",
    "volcanoActivity",
    "volcanoPrevention",
    "nextAdvisory",
    "otherInfo",
    "appendix",
    "text",
    "any"
})
public class TypeVolcanoInfoContent {

    @XmlElement(name = "VolcanoHeadline")
    protected String volcanoHeadline;
    @XmlElement(name = "VolcanoActivity")
    protected String volcanoActivity;
    @XmlElement(name = "VolcanoPrevention")
    protected String volcanoPrevention;
    @XmlElement(name = "NextAdvisory")
    protected String nextAdvisory;
    @XmlElement(name = "OtherInfo")
    protected String otherInfo;
    @XmlElement(name = "Appendix")
    protected String appendix;
    @XmlElement(name = "Text")
    protected String text;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the volcanoHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolcanoHeadline() {
        return volcanoHeadline;
    }

    /**
     * Sets the value of the volcanoHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolcanoHeadline(String value) {
        this.volcanoHeadline = value;
    }

    /**
     * Gets the value of the volcanoActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolcanoActivity() {
        return volcanoActivity;
    }

    /**
     * Sets the value of the volcanoActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolcanoActivity(String value) {
        this.volcanoActivity = value;
    }

    /**
     * Gets the value of the volcanoPrevention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolcanoPrevention() {
        return volcanoPrevention;
    }

    /**
     * Sets the value of the volcanoPrevention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolcanoPrevention(String value) {
        this.volcanoPrevention = value;
    }

    /**
     * Gets the value of the nextAdvisory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextAdvisory() {
        return nextAdvisory;
    }

    /**
     * Sets the value of the nextAdvisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextAdvisory(String value) {
        this.nextAdvisory = value;
    }

    /**
     * Gets the value of the otherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * Sets the value of the otherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInfo(String value) {
        this.otherInfo = value;
    }

    /**
     * Gets the value of the appendix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendix() {
        return appendix;
    }

    /**
     * Sets the value of the appendix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendix(String value) {
        this.appendix = value;
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
