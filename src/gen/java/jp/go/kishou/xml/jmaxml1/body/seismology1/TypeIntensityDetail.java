
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.IntensityDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.IntensityDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodeDefine" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CodeDefine" minOccurs="0"/&gt;
 *         &lt;element name="MaxInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForecastInt" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.ForecastInt" minOccurs="0"/&gt;
 *         &lt;element name="Appendix" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityAppendix" minOccurs="0"/&gt;
 *         &lt;element name="Pref" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.IntensityPref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.IntensityDetail", propOrder = {
    "codeDefine",
    "maxInt",
    "forecastInt",
    "appendix",
    "pref"
})
public class TypeIntensityDetail {

    @XmlElement(name = "CodeDefine")
    protected TypeCodeDefine codeDefine;
    @XmlElement(name = "MaxInt")
    protected String maxInt;
    @XmlElement(name = "ForecastInt")
    protected TypeForecastInt forecastInt;
    @XmlElement(name = "Appendix")
    protected TypeIntensityAppendix appendix;
    @XmlElement(name = "Pref")
    protected List<TypeIntensityPref> pref;

    /**
     * Gets the value of the codeDefine property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCodeDefine }
     *     
     */
    public TypeCodeDefine getCodeDefine() {
        return codeDefine;
    }

    /**
     * Sets the value of the codeDefine property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCodeDefine }
     *     
     */
    public void setCodeDefine(TypeCodeDefine value) {
        this.codeDefine = value;
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
     * Gets the value of the appendix property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensityAppendix }
     *     
     */
    public TypeIntensityAppendix getAppendix() {
        return appendix;
    }

    /**
     * Sets the value of the appendix property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensityAppendix }
     *     
     */
    public void setAppendix(TypeIntensityAppendix value) {
        this.appendix = value;
    }

    /**
     * Gets the value of the pref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeIntensityPref }
     * 
     * 
     */
    public List<TypeIntensityPref> getPref() {
        if (pref == null) {
            pref = new ArrayList<TypeIntensityPref>();
        }
        return this.pref;
    }

}
