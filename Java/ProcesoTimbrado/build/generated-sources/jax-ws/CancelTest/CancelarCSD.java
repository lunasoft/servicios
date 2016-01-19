
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
 *         &lt;element name="CSDCer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSDKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFCEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UUIDs" type="{http://sufacturacion.com/}ArrayOfString" minOccurs="0"/>
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
    "csdCer",
    "csdKey",
    "password",
    "rfcEmisor",
    "uuiDs",
    "tokenAutenticacion"
})
@XmlRootElement(name = "CancelarCSD", namespace = "http://sufacturacion.com/")
public class CancelarCSD {

    @XmlElement(name = "CSDCer", namespace = "http://sufacturacion.com/")
    protected String csdCer;
    @XmlElement(name = "CSDKey", namespace = "http://sufacturacion.com/")
    protected String csdKey;
    @XmlElement(namespace = "http://sufacturacion.com/")
    protected String password;
    @XmlElement(name = "RFCEmisor", namespace = "http://sufacturacion.com/")
    protected String rfcEmisor;
    @XmlElement(name = "UUIDs", namespace = "http://sufacturacion.com/")
    protected ArrayOfString uuiDs;
    @XmlElement(namespace = "http://sufacturacion.com/")
    protected String tokenAutenticacion;

    /**
     * Obtiene el valor de la propiedad csdCer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSDCer() {
        return csdCer;
    }

    /**
     * Define el valor de la propiedad csdCer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSDCer(String value) {
        this.csdCer = value;
    }

    /**
     * Obtiene el valor de la propiedad csdKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSDKey() {
        return csdKey;
    }

    /**
     * Define el valor de la propiedad csdKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSDKey(String value) {
        this.csdKey = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCEmisor() {
        return rfcEmisor;
    }

    /**
     * Define el valor de la propiedad rfcEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCEmisor(String value) {
        this.rfcEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad uuiDs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getUUIDs() {
        return uuiDs;
    }

    /**
     * Define el valor de la propiedad uuiDs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setUUIDs(ArrayOfString value) {
        this.uuiDs = value;
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
