
package br.edu.ifsul.cliente01;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicoMedia", targetNamespace = "http://servicos.ifsul.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicoMedia {


    /**
     * 
     * @param valor1
     * @param valor3
     * @param valor2
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "media", targetNamespace = "http://servicos.ifsul.edu.br/", className = "br.edu.ifsul.cliente01.Media")
    @ResponseWrapper(localName = "mediaResponse", targetNamespace = "http://servicos.ifsul.edu.br/", className = "br.edu.ifsul.cliente01.MediaResponse")
    @Action(input = "http://servicos.ifsul.edu.br/ServicoMedia/mediaRequest", output = "http://servicos.ifsul.edu.br/ServicoMedia/mediaResponse")
    public Double media(
        @WebParam(name = "valor1", targetNamespace = "")
        double valor1,
        @WebParam(name = "valor2", targetNamespace = "")
        double valor2,
        @WebParam(name = "valor3", targetNamespace = "")
        double valor3);

}
