
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
 *         &lt;element name="TimbrarXMLV3Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "timbrarXMLV3Result"
})
@XmlRootElement(name = "TimbrarXMLV3Response")
public class TimbrarXMLV3Response {

    @XmlElement(name = "TimbrarXMLV3Result")
    protected String timbrarXMLV3Result;

    /**
     * Obtiene el valor de la propiedad timbrarXMLV3Result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimbrarXMLV3Result() {
        return timbrarXMLV3Result;
    }

    /**
     * Define el valor de la propiedad timbrarXMLV3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimbrarXMLV3Result(String value) {
        this.timbrarXMLV3Result = value;
    }

}
