
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
 *         &lt;element ref="{http://www.sat.gob.mx/TimbreFiscalDigital}TimbrarCFDIResult" minOccurs="0"/>
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
    "timbrarCFDIResult"
})
@XmlRootElement(name = "TimbrarCFDIResponse")
public class TimbrarCFDIResponse {

    @XmlElement(name = "TimbrarCFDIResult", namespace = "http://www.sat.gob.mx/TimbreFiscalDigital")
    protected TimbrarCFDIResult timbrarCFDIResult;

    /**
     * Obtiene el valor de la propiedad timbrarCFDIResult.
     * 
     * @return
     *     possible object is
     *     {@link TimbrarCFDIResult }
     *     
     */
    public TimbrarCFDIResult getTimbrarCFDIResult() {
        return timbrarCFDIResult;
    }

    /**
     * Define el valor de la propiedad timbrarCFDIResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbrarCFDIResult }
     *     
     */
    public void setTimbrarCFDIResult(TimbrarCFDIResult value) {
        this.timbrarCFDIResult = value;
    }

}
