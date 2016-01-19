
package StampTest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "wsTimbradoSoap", targetNamespace = "http://sufacturacion.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsTimbradoSoap {


    /**
     * 
     * @param xmlComprobante
     * @param tokenAutenticacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TimbrarXML", action = "http://sufacturacion.com/TimbrarXML")
    @WebResult(name = "TimbrarXMLResult", targetNamespace = "http://sufacturacion.com/")
    @RequestWrapper(localName = "TimbrarXML", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarXML")
    @ResponseWrapper(localName = "TimbrarXMLResponse", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarXMLResponse")
    public String timbrarXML(
        @WebParam(name = "xmlComprobante", targetNamespace = "http://sufacturacion.com/")
        String xmlComprobante,
        @WebParam(name = "tokenAutenticacion", targetNamespace = "http://sufacturacion.com/")
        String tokenAutenticacion);

    /**
     * 
     * @param xmlComprobante
     * @param tokenAutenticacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TimbrarXMLV2", action = "http://sufacturacion.com/TimbrarXMLV2")
    @WebResult(name = "TimbrarXMLV2Result", targetNamespace = "http://sufacturacion.com/")
    @RequestWrapper(localName = "TimbrarXMLV2", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarXMLV2")
    @ResponseWrapper(localName = "TimbrarXMLV2Response", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarXMLV2Response")
    public String timbrarXMLV2(
        @WebParam(name = "xmlComprobante", targetNamespace = "http://sufacturacion.com/")
        String xmlComprobante,
        @WebParam(name = "tokenAutenticacion", targetNamespace = "http://sufacturacion.com/")
        String tokenAutenticacion);

    /**
     * 
     * @param xmlComprobante
     * @param tokenAutenticacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TimbrarXMLV3", action = "http://sufacturacion.com/TimbrarXMLV3")
    @WebResult(name = "TimbrarXMLV3Result", targetNamespace = "http://sufacturacion.com/")
    @RequestWrapper(localName = "TimbrarXMLV3", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarXMLV3")
    @ResponseWrapper(localName = "TimbrarXMLV3Response", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarXMLV3Response")
    public String timbrarXMLV3(
        @WebParam(name = "xmlComprobante", targetNamespace = "http://sufacturacion.com/")
        String xmlComprobante,
        @WebParam(name = "tokenAutenticacion", targetNamespace = "http://sufacturacion.com/")
        String tokenAutenticacion);

    /**
     * 
     * @param xmlComprobante
     * @param tokenAutenticacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TimbrarXMLV4", action = "http://sufacturacion.com/TimbrarXMLV4")
    @WebResult(name = "TimbrarXMLV4Result", targetNamespace = "http://sufacturacion.com/")
    @RequestWrapper(localName = "TimbrarXMLV4", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarXMLV4")
    @ResponseWrapper(localName = "TimbrarXMLV4Response", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarXMLV4Response")
    public String timbrarXMLV4(
        @WebParam(name = "xmlComprobante", targetNamespace = "http://sufacturacion.com/")
        String xmlComprobante,
        @WebParam(name = "tokenAutenticacion", targetNamespace = "http://sufacturacion.com/")
        String tokenAutenticacion);

    /**
     * 
     * @param comprobante
     * @param tokenAutenticacion
     * @return
     *     returns StampTest.TimbrarCFDIResult
     */
    @WebMethod(operationName = "TimbrarCFDI", action = "http://sufacturacion.com/TimbrarCFDI")
    @WebResult(name = "TimbrarCFDIResult", targetNamespace = "http://www.sat.gob.mx/TimbreFiscalDigital")
    @RequestWrapper(localName = "TimbrarCFDI", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarCFDI")
    @ResponseWrapper(localName = "TimbrarCFDIResponse", targetNamespace = "http://sufacturacion.com/", className = "StampTest.TimbrarCFDIResponse")
    public TimbrarCFDIResult timbrarCFDI(
        @WebParam(name = "comprobante", targetNamespace = "http://www.sat.gob.mx/cfd/3")
        Comprobante comprobante,
        @WebParam(name = "tokenAutenticacion", targetNamespace = "http://sufacturacion.com/")
        String tokenAutenticacion);

}