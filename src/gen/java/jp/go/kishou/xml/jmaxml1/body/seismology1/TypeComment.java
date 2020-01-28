
package jp.go.kishou.xml.jmaxml1.body.seismology1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.Comment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type.Comment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WarningComment" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CommentForm" minOccurs="0"/&gt;
 *         &lt;element name="ForecastComment" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CommentForm" minOccurs="0"/&gt;
 *         &lt;element name="ObservationComment" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CommentForm" minOccurs="0"/&gt;
 *         &lt;element name="VarComment" type="{http://xml.kishou.go.jp/jmaxml1/body/seismology1/}type.CommentForm" minOccurs="0"/&gt;
 *         &lt;element name="FreeFormComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type.Comment", propOrder = {
    "warningComment",
    "forecastComment",
    "observationComment",
    "varComment",
    "freeFormComment"
})
public class TypeComment {

    @XmlElement(name = "WarningComment")
    protected TypeCommentForm warningComment;
    @XmlElement(name = "ForecastComment")
    protected TypeCommentForm forecastComment;
    @XmlElement(name = "ObservationComment")
    protected TypeCommentForm observationComment;
    @XmlElement(name = "VarComment")
    protected TypeCommentForm varComment;
    @XmlElement(name = "FreeFormComment")
    protected String freeFormComment;

    /**
     * Gets the value of the warningComment property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommentForm }
     *     
     */
    public TypeCommentForm getWarningComment() {
        return warningComment;
    }

    /**
     * Sets the value of the warningComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommentForm }
     *     
     */
    public void setWarningComment(TypeCommentForm value) {
        this.warningComment = value;
    }

    /**
     * Gets the value of the forecastComment property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommentForm }
     *     
     */
    public TypeCommentForm getForecastComment() {
        return forecastComment;
    }

    /**
     * Sets the value of the forecastComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommentForm }
     *     
     */
    public void setForecastComment(TypeCommentForm value) {
        this.forecastComment = value;
    }

    /**
     * Gets the value of the observationComment property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommentForm }
     *     
     */
    public TypeCommentForm getObservationComment() {
        return observationComment;
    }

    /**
     * Sets the value of the observationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommentForm }
     *     
     */
    public void setObservationComment(TypeCommentForm value) {
        this.observationComment = value;
    }

    /**
     * Gets the value of the varComment property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommentForm }
     *     
     */
    public TypeCommentForm getVarComment() {
        return varComment;
    }

    /**
     * Sets the value of the varComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommentForm }
     *     
     */
    public void setVarComment(TypeCommentForm value) {
        this.varComment = value;
    }

    /**
     * Gets the value of the freeFormComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFormComment() {
        return freeFormComment;
    }

    /**
     * Sets the value of the freeFormComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFormComment(String value) {
        this.freeFormComment = value;
    }

}
