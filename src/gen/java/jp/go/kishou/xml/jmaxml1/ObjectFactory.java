
package jp.go.kishou.xml.jmaxml1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.go.kishou.xml.jmaxml1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Report_QNAME = new QName("http://xml.kishou.go.jp/jmaxml1/", "Report");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.go.kishou.xml.jmaxml1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeReport }
     * 
     */
    public TypeReport createTypeReport() {
        return new TypeReport();
    }

    /**
     * Create an instance of {@link TypeControl }
     * 
     */
    public TypeControl createTypeControl() {
        return new TypeControl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeReport }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeReport }{@code >}
     */
    @XmlElementDecl(namespace = "http://xml.kishou.go.jp/jmaxml1/", name = "Report")
    public JAXBElement<TypeReport> createReport(TypeReport value) {
        return new JAXBElement<TypeReport>(_Report_QNAME, TypeReport.class, null, value);
    }

}
