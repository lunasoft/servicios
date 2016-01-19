
package AuthProd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutenticarBasicoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "autenticarBasicoResult"
})
@XmlRootElement(name = "AutenticarBasicoResponse")
public class AutenticarBasicoResponse {

    @XmlElement(name = "AutenticarBasicoResult")
    protected String autenticarBasicoResult;

    /**
     * Obtiene el valor de la propiedad autenticarBasicoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutenticarBasicoResult() {
        return autenticarBasicoResult;
    }

    /**
     * Define el valor de la propiedad autenticarBasicoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutenticarBasicoResult(String value) {
        this.autenticarBasicoResult = value;
    }

}
