
package br.edu.ifsul.cliente01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de media complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="media"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valor1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="valor2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="valor3" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "media", propOrder = {
    "valor1",
    "valor2",
    "valor3"
})
public class Media {

    protected double valor1;
    protected double valor2;
    protected double valor3;

    /**
     * Obtém o valor da propriedade valor1.
     * 
     */
    public double getValor1() {
        return valor1;
    }

    /**
     * Define o valor da propriedade valor1.
     * 
     */
    public void setValor1(double value) {
        this.valor1 = value;
    }

    /**
     * Obtém o valor da propriedade valor2.
     * 
     */
    public double getValor2() {
        return valor2;
    }

    /**
     * Define o valor da propriedade valor2.
     * 
     */
    public void setValor2(double value) {
        this.valor2 = value;
    }

    /**
     * Obtém o valor da propriedade valor3.
     * 
     */
    public double getValor3() {
        return valor3;
    }

    /**
     * Define o valor da propriedade valor3.
     * 
     */
    public void setValor3(double value) {
        this.valor3 = value;
    }

}
