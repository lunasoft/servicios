
package AuthTest;

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
 *         &lt;element name="TokenCambioContraseñaResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tokenCambioContrase\u00f1aResult"
})
@XmlRootElement(name = "TokenCambioContrase\u00f1aResponse")
public class TokenCambioContraseñaResponse {

    @XmlElement(name = "TokenCambioContrase\u00f1aResult")
    protected String tokenCambioContraseñaResult;

    /**
     * Obtiene el valor de la propiedad tokenCambioContraseñaResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenCambioContraseñaResult() {
        return tokenCambioContraseñaResult;
    }

    /**
     * Define el valor de la propiedad tokenCambioContraseñaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenCambioContraseñaResult(String value) {
        this.tokenCambioContraseñaResult = value;
    }

}
