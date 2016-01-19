
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
 *         &lt;element name="CancelarResult" type="{http://cancelacfd.sat.gob.mx}Acuse" minOccurs="0"/>
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
    "cancelarResult"
})
@XmlRootElement(name = "CancelarResponse", namespace = "http://sufacturacion.com/")
public class CancelarResponse {

    @XmlElement(name = "CancelarResult", namespace = "http://sufacturacion.com/")
    protected Acuse cancelarResult;

    /**
     * Obtiene el valor de la propiedad cancelarResult.
     * 
     * @return
     *     possible object is
     *     {@link Acuse }
     *     
     */
    public Acuse getCancelarResult() {
        return cancelarResult;
    }

    /**
     * Define el valor de la propiedad cancelarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Acuse }
     *     
     */
    public void setCancelarResult(Acuse value) {
        this.cancelarResult = value;
    }

}
