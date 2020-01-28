
package jp.go.kishou.xml.jmaxml1.body.volcanology1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.go.kishou.xml.jmaxml1.body.volcanology1 package. 
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

    private final static QName _Body_QNAME = new QName("http://xml.kishou.go.jp/jmaxml1/body/volcanology1/", "Body");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.go.kishou.xml.jmaxml1.body.volcanology1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeBody }
     * 
     */
    public TypeBody createTypeBody() {
        return new TypeBody();
    }

    /**
     * Create an instance of {@link TypeVolcanoInfo }
     * 
     */
    public TypeVolcanoInfo createTypeVolcanoInfo() {
        return new TypeVolcanoInfo();
    }

    /**
     * Create an instance of {@link TypeItem }
     * 
     */
    public TypeItem createTypeItem() {
        return new TypeItem();
    }

    /**
     * Create an instance of {@link TypeEventTime }
     * 
     */
    public TypeEventTime createTypeEventTime() {
        return new TypeEventTime();
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
     * Create an instance of {@link TypeAshInfos }
     * 
     */
    public TypeAshInfos createTypeAshInfos() {
        return new TypeAshInfos();
    }

    /**
     * Create an instance of {@link TypeAshInfo }
     * 
     */
    public TypeAshInfo createTypeAshInfo() {
        return new TypeAshInfo();
    }

    /**
     * Create an instance of {@link TypeProperty }
     * 
     */
    public TypeProperty createTypeProperty() {
        return new TypeProperty();
    }

    /**
     * Create an instance of {@link TypeSize }
     * 
     */
    public TypeSize createTypeSize() {
        return new TypeSize();
    }

    /**
     * Create an instance of {@link TypeDistance }
     * 
     */
    public TypeDistance createTypeDistance() {
        return new TypeDistance();
    }

    /**
     * Create an instance of {@link TypeVolcanoInfoContent }
     * 
     */
    public TypeVolcanoInfoContent createTypeVolcanoInfoContent() {
        return new TypeVolcanoInfoContent();
    }

    /**
     * Create an instance of {@link TypeVolcanoObservation }
     * 
     */
    public TypeVolcanoObservation createTypeVolcanoObservation() {
        return new TypeVolcanoObservation();
    }

    /**
     * Create an instance of {@link TypePlume }
     * 
     */
    public TypePlume createTypePlume() {
        return new TypePlume();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeBody }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeBody }{@code >}
     */
    @XmlElementDecl(namespace = "http://xml.kishou.go.jp/jmaxml1/body/volcanology1/", name = "Body")
    public JAXBElement<TypeBody> createBody(TypeBody value) {
        return new JAXBElement<TypeBody>(_Body_QNAME, TypeBody.class, null, value);
    }

}
