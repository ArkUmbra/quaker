
package jp.go.kishou.xml.jmaxml1.body.seismology1;

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
 *         &lt;element name="Naming" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Naming" minOccurs="0"/&gt;
 *         &lt;element name="Tsunami" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Tsunami" minOccurs="0"/&gt;
 *         &lt;element name="Earthquake" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Earthquake" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Intensity" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Intensity" minOccurs="0"/&gt;
 *         &lt;element name="Tokai" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Tokai" minOccurs="0"/&gt;
 *         &lt;element name="EarthquakeCount" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.EarthquakeCount" minOccurs="0"/&gt;
 *         &lt;element name="Aftershock" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Aftershocks" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NextAdvisory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.Comment" minOccurs="0"/&gt;
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
    "naming",
    "tsunami",
    "earthquake",
    "intensity",
    "tokai",
    "earthquakeCount",
    "aftershock",
    "text",
    "nextAdvisory",
    "comments"
})
public class TypeBody {

    @XmlElement(name = "Naming")
    protected TypeNaming naming;
    @XmlElement(name = "Tsunami")
    protected TypeTsunami tsunami;
    @XmlElement(name = "Earthquake")
    protected List<TypeEarthquake> earthquake;
    @XmlElement(name = "Intensity")
    protected TypeIntensity intensity;
    @XmlElement(name = "Tokai")
    protected TypeTokai tokai;
    @XmlElement(name = "EarthquakeCount")
    protected TypeEarthquakeCount earthquakeCount;
    @XmlElement(name = "Aftershock")
    protected TypeAftershocks aftershock;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "NextAdvisory")
    protected String nextAdvisory;
    @XmlElement(name = "Comments")
    protected TypeComment comments;

    /**
     * Gets the value of the naming property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNaming }
     *     
     */
    public TypeNaming getNaming() {
        return naming;
    }

    /**
     * Sets the value of the naming property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNaming }
     *     
     */
    public void setNaming(TypeNaming value) {
        this.naming = value;
    }

    /**
     * Gets the value of the tsunami property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTsunami }
     *     
     */
    public TypeTsunami getTsunami() {
        return tsunami;
    }

    /**
     * Sets the value of the tsunami property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTsunami }
     *     
     */
    public void setTsunami(TypeTsunami value) {
        this.tsunami = value;
    }

    /**
     * Gets the value of the earthquake property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earthquake property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarthquake().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeEarthquake }
     * 
     * 
     */
    public List<TypeEarthquake> getEarthquake() {
        if (earthquake == null) {
            earthquake = new ArrayList<TypeEarthquake>();
        }
        return this.earthquake;
    }

    /**
     * Gets the value of the intensity property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIntensity }
     *     
     */
    public TypeIntensity getIntensity() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIntensity }
     *     
     */
    public void setIntensity(TypeIntensity value) {
        this.intensity = value;
    }

    /**
     * Gets the value of the tokai property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTokai }
     *     
     */
    public TypeTokai getTokai() {
        return tokai;
    }

    /**
     * Sets the value of the tokai property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTokai }
     *     
     */
    public void setTokai(TypeTokai value) {
        this.tokai = value;
    }

    /**
     * Gets the value of the earthquakeCount property.
     * 
     * @return
     *     possible object is
     *     {@link TypeEarthquakeCount }
     *     
     */
    public TypeEarthquakeCount getEarthquakeCount() {
        return earthquakeCount;
    }

    /**
     * Sets the value of the earthquakeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEarthquakeCount }
     *     
     */
    public void setEarthquakeCount(TypeEarthquakeCount value) {
        this.earthquakeCount = value;
    }

    /**
     * Gets the value of the aftershock property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAftershocks }
     *     
     */
    public TypeAftershocks getAftershock() {
        return aftershock;
    }

    /**
     * Sets the value of the aftershock property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAftershocks }
     *     
     */
    public void setAftershock(TypeAftershocks value) {
        this.aftershock = value;
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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link TypeComment }
     *     
     */
    public TypeComment getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeComment }
     *     
     */
    public void setComments(TypeComment value) {
        this.comments = value;
    }

}
