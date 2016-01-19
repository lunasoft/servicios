
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
 *         &lt;element ref="{http://cancelacfd.sat.gob.mx}cancelacion"/>
 *         &lt;element name="tokenAutenticacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cancelacion",
    "tokenAutenticacion"
})
@XmlRootElement(name = "Cancelar", namespace = "http://sufacturacion.com/")
public class Cancelar {

    @XmlElement(namespace = "http://cancelacfd.sat.gob.mx", required = true, nillable = true)
    protected Cancelacion cancelacion;
    @XmlElement(namespace = "http://sufacturacion.com/")
    protected String tokenAutenticacion;

    /**
     * Obtiene el valor de la propiedad cancelacion.
     * 
     * @return
     *     possible object is
     *     {@link Cancelacion }
     *     
     */
    public Cancelacion getCancelacion() {
        return cancelacion;
    }

    /**
     * Define el valor de la propiedad cancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Cancelacion }
     *     
     */
    public void setCancelacion(Cancelacion value) {
        this.cancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenAutenticacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenAutenticacion() {
        return tokenAutenticacion;
    }

    /**
     * Define el valor de la propiedad tokenAutenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenAutenticacion(String value) {
        this.tokenAutenticacion = value;
    }

}
