
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
 *         &lt;element name="TimbrarXMLV2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "timbrarXMLV2Result"
})
@XmlRootElement(name = "TimbrarXMLV2Response")
public class TimbrarXMLV2Response {

    @XmlElement(name = "TimbrarXMLV2Result")
    protected String timbrarXMLV2Result;

    /**
     * Obtiene el valor de la propiedad timbrarXMLV2Result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimbrarXMLV2Result() {
        return timbrarXMLV2Result;
    }

    /**
     * Define el valor de la propiedad timbrarXMLV2Result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimbrarXMLV2Result(String value) {
        this.timbrarXMLV2Result = value;
    }

}
