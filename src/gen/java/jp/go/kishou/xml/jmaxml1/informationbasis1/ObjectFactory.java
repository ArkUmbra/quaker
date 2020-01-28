
package jp.go.kishou.xml.jmaxml1.informationbasis1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.go.kishou.xml.jmaxml1.informationbasis1 package. 
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

    private final static QName _Head_QNAME = new QName("http://xml.kishou.go.jp/jmaxml1/informationBasis1/", "Head");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.go.kishou.xml.jmaxml1.informationbasis1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeHead }
     * 
     */
    public TypeHead createTypeHead() {
        return new TypeHead();
    }

    /**
     * Create an instance of {@link TypeHeadline }
     * 
     */
    public TypeHeadline createTypeHeadline() {
        return new TypeHeadline();
    }

    /**
     * Create an instance of {@link TypeInformation }
     * 
     */
    public TypeInformation createTypeInformation() {
        return new TypeInformation();
    }

    /**
     * Create an instance of {@link TypeItem }
     * 
     */
    public TypeItem createTypeItem() {
        return new TypeItem();
    }

    /**
     * Create an instance of {@link TypeKind }
     * 
     */
    public TypeKind createTypeKind() {
        return new TypeKind();
    }

    /**
     * Create an instance of {@link TypeAreas }
     * 
     */
    public TypeAreas createTypeAreas() {
        return new TypeAreas();
    }

    /**
     * Create an instance of {@link TypeArea }
     * 
     */
    public TypeArea createTypeArea() {
        return new TypeArea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeHead }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeHead }{@code >}
     */
    @XmlElementDecl(namespace = "http://xml.kishou.go.jp/jmaxml1/informationBasis1/", name = "Head")
    public JAXBElement<TypeHead> createHead(TypeHead value) {
        return new JAXBElement<TypeHead>(_Head_QNAME, TypeHead.class, null, value);
    }

}
