
package StampProd;

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
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}comprobante" minOccurs="0"/>
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
    "comprobante",
    "tokenAutenticacion"
})
@XmlRootElement(name = "TimbrarCFDI")
public class TimbrarCFDI {

    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3")
    protected Comprobante comprobante;
    protected String tokenAutenticacion;

    /**
     * Obtiene el valor de la propiedad comprobante.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante }
     *     
     */
    public Comprobante getComprobante() {
        return comprobante;
    }

    /**
     * Define el valor de la propiedad comprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante }
     *     
     */
    public void setComprobante(Comprobante value) {
        this.comprobante = value;
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
