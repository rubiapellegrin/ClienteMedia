
package br.edu.ifsul.cliente01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifsul.cliente01 package. 
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

    private final static QName _Media_QNAME = new QName("http://servicos.ifsul.edu.br/", "media");
    private final static QName _MediaResponse_QNAME = new QName("http://servicos.ifsul.edu.br/", "mediaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifsul.cliente01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Media }
     * 
     */
    public Media createMedia() {
        return new Media();
    }

    /**
     * Create an instance of {@link MediaResponse }
     * 
     */
    public MediaResponse createMediaResponse() {
        return new MediaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Media }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Media }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicos.ifsul.edu.br/", name = "media")
    public JAXBElement<Media> createMedia(Media value) {
        return new JAXBElement<Media>(_Media_QNAME, Media.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MediaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicos.ifsul.edu.br/", name = "mediaResponse")
    public JAXBElement<MediaResponse> createMediaResponse(MediaResponse value) {
        return new JAXBElement<MediaResponse>(_MediaResponse_QNAME, MediaResponse.class, null, value);
    }

}
