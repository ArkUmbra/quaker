
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.ClimateForecastAddition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.ClimateForecastAddition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetDateTimeNotice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NextForecastSchedule" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastSchedule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NoticeOfSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalNotice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.ClimateForecastAddition", propOrder = {
    "targetDateTimeNotice",
    "nextForecastSchedule",
    "noticeOfSchedule",
    "additionalNotice"
})
public class TypeClimateForecastAddition {

    @XmlElement(name = "TargetDateTimeNotice")
    protected String targetDateTimeNotice;
    @XmlElement(name = "NextForecastSchedule")
    protected List<TypeForecastSchedule> nextForecastSchedule;
    @XmlElement(name = "NoticeOfSchedule")
    protected String noticeOfSchedule;
    @XmlElement(name = "AdditionalNotice")
    protected String additionalNotice;

    /**
     * Gets the value of the targetDateTimeNotice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDateTimeNotice() {
        return targetDateTimeNotice;
    }

    /**
     * Sets the value of the targetDateTimeNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDateTimeNotice(String value) {
        this.targetDateTimeNotice = value;
    }

    /**
     * Gets the value of the nextForecastSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextForecastSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextForecastSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeForecastSchedule }
     * 
     * 
     */
    public List<TypeForecastSchedule> getNextForecastSchedule() {
        if (nextForecastSchedule == null) {
            nextForecastSchedule = new ArrayList<TypeForecastSchedule>();
        }
        return this.nextForecastSchedule;
    }

    /**
     * Gets the value of the noticeOfSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeOfSchedule() {
        return noticeOfSchedule;
    }

    /**
     * Sets the value of the noticeOfSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeOfSchedule(String value) {
        this.noticeOfSchedule = value;
    }

    /**
     * Gets the value of the additionalNotice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalNotice() {
        return additionalNotice;
    }

    /**
     * Sets the value of the additionalNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalNotice(String value) {
        this.additionalNotice = value;
    }

}
