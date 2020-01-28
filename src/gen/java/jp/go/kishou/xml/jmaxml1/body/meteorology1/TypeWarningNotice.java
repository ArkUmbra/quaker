
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.WarningNotice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.WarningNotice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.WarningNotice", propOrder = {
    "startTime",
    "note"
})
public class TypeWarningNotice {

    @XmlElement(name = "StartTime", required = true)
    protected TypeForecastTerm startTime;
    @XmlElement(name = "Note", required = true)
    protected String note;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setStartTime(TypeForecastTerm value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
