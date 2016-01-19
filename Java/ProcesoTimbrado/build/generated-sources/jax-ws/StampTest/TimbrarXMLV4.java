
package StampTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="xmlComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "xmlComprobante",
    "tokenAutenticacion"
})
@XmlRootElement(name = "TimbrarXMLV4")
public class TimbrarXMLV4 {

    protected String xmlComprobante;
    protected String tokenAutenticacion;

    /**
     * Obtiene el valor de la propiedad xmlComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlComprobante() {
        return xmlComprobante;
    }

    /**
     * Define el valor de la propiedad xmlComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlComprobante(String value) {
        this.xmlComprobante = value;
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
