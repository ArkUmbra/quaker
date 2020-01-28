
package jp.go.kishou.xml.jmaxml1.body.volcanology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePlumeDirection;
import jp.go.kishou.xml.jmaxml1.elementbasis1.TypePlumeHeight;
import org.w3c.dom.Element;


/**
 * <p>Java class for type.plume complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.plume"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}PlumeHeightAboveCrater"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}PlumeHeightAboveSeaLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xml.kishou.go.jp/jmaxml1/elementBasis1/}PlumeDirection"/&gt;
 *         &lt;element name="PlumeComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "type.plume", propOrder = {
    "plumeHeightAboveCrater",
    "plumeHeightAboveSeaLevel",
    "plumeDirection",
    "plumeComment",
    "any"
})
public class TypePlume {

    @XmlElement(name = "PlumeHeightAboveCrater", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected TypePlumeHeight plumeHeightAboveCrater;
    @XmlElement(name = "PlumeHeightAboveSeaLevel", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/")
    protected TypePlumeHeight plumeHeightAboveSeaLevel;
    @XmlElement(name = "PlumeDirection", namespace = "http://xml.kishou.go.jp/jmaxml1/elementBasis1/", required = true)
    protected TypePlumeDirection plumeDirection;
    @XmlElement(name = "PlumeComment")
    protected String plumeComment;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the plumeHeightAboveCrater property.
     * 
     * @return
     *     possible object is
     *     {@link TypePlumeHeight }
     *     
     */
    public TypePlumeHeight getPlumeHeightAboveCrater() {
        return plumeHeightAboveCrater;
    }

    /**
     * Sets the value of the plumeHeightAboveCrater property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlumeHeight }
     *     
     */
    public void setPlumeHeightAboveCrater(TypePlumeHeight value) {
        this.plumeHeightAboveCrater = value;
    }

    /**
     * Gets the value of the plumeHeightAboveSeaLevel property.
     * 
     * @return
     *     possible object is
     *     {@link TypePlumeHeight }
     *     
     */
    public TypePlumeHeight getPlumeHeightAboveSeaLevel() {
        return plumeHeightAboveSeaLevel;
    }

    /**
     * Sets the value of the plumeHeightAboveSeaLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlumeHeight }
     *     
     */
    public void setPlumeHeightAboveSeaLevel(TypePlumeHeight value) {
        this.plumeHeightAboveSeaLevel = value;
    }

    /**
     * Gets the value of the plumeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TypePlumeDirection }
     *     
     */
    public TypePlumeDirection getPlumeDirection() {
        return plumeDirection;
    }

    /**
     * Sets the value of the plumeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePlumeDirection }
     *     
     */
    public void setPlumeDirection(TypePlumeDirection value) {
        this.plumeDirection = value;
    }

    /**
     * Gets the value of the plumeComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlumeComment() {
        return plumeComment;
    }

    /**
     * Sets the value of the plumeComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlumeComment(String value) {
        this.plumeComment = value;
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
