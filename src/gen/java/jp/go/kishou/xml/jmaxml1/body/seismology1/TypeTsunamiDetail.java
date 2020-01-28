
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.TsunamiDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.TsunamiDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodeDefine" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CodeDefine" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.TsunamiItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.TsunamiDetail", propOrder = {
    "codeDefine",
    "item"
})
public class TypeTsunamiDetail {

    @XmlElement(name = "CodeDefine")
    protected TypeCodeDefine codeDefine;
    @XmlElement(name = "Item", required = true)
    protected List<TypeTsunamiItem> item;

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
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTsunamiItem }
     * 
     * 
     */
    public List<TypeTsunamiItem> getItem() {
        if (item == null) {
            item = new ArrayList<TypeTsunamiItem>();
        }
        return this.item;
    }

}
