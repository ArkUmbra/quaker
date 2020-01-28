
package jp.go.kishou.xml.jmaxml1.body.meteorology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.LocalSignificancy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.LocalSignificancy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AreaName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Significancy" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Significancy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sentence" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Sentence" minOccurs="0"/&gt;
 *         &lt;element name="PeakTime" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.ForecastTerm" minOccurs="0"/&gt;
 *         &lt;element name="Attention" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Attention" minOccurs="0"/&gt;
 *         &lt;element name="Addition" type="{http://xml.kishou.go.jp/jmaxml1/body/meteorology1/}type.Addition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.LocalSignificancy", propOrder = {
    "areaName",
    "significancy",
    "sentence",
    "peakTime",
    "attention",
    "addition"
})
public class TypeLocalSignificancy {

    @XmlElement(name = "AreaName", required = true)
    protected String areaName;
    @XmlElement(name = "Significancy")
    protected List<TypeSignificancy> significancy;
    @XmlElement(name = "Sentence")
    protected TypeSentence sentence;
    @XmlElement(name = "PeakTime")
    protected TypeForecastTerm peakTime;
    @XmlElement(name = "Attention")
    protected TypeAttention attention;
    @XmlElement(name = "Addition")
    protected TypeAddition addition;

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

    /**
     * Gets the value of the significancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the significancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignificancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSignificancy }
     * 
     * 
     */
    public List<TypeSignificancy> getSignificancy() {
        if (significancy == null) {
            significancy = new ArrayList<TypeSignificancy>();
        }
        return this.significancy;
    }

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
     * Gets the value of the peakTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypeForecastTerm }
     *     
     */
    public TypeForecastTerm getPeakTime() {
        return peakTime;
    }

    /**
     * Sets the value of the peakTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeForecastTerm }
     *     
     */
    public void setPeakTime(TypeForecastTerm value) {
        this.peakTime = value;
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

}
