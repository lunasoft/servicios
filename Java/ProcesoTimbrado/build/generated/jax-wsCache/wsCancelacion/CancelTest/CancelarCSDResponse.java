
package CancelTest;

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
 *         &lt;element name="CancelarCSDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cancelarCSDResult"
})
@XmlRootElement(name = "CancelarCSDResponse", namespace = "http://sufacturacion.com/")
public class CancelarCSDResponse {

    @XmlElement(name = "CancelarCSDResult", namespace = "http://sufacturacion.com/")
    protected String cancelarCSDResult;

    /**
     * Obtiene el valor de la propiedad cancelarCSDResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelarCSDResult() {
        return cancelarCSDResult;
    }

    /**
     * Define el valor de la propiedad cancelarCSDResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelarCSDResult(String value) {
        this.cancelarCSDResult = value;
    }

}
