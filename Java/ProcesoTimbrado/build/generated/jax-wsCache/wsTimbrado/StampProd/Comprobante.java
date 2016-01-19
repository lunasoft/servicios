
package StampProd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Emisor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DomicilioFiscal" type="{http://www.sat.gob.mx/cfd/3}t_UbicacionFiscal" minOccurs="0"/>
 *                   &lt;element name="ExpedidoEn" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
 *                   &lt;element name="RegimenFiscal" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Regimen" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Receptor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Domicilio" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Conceptos" type="{http://www.sat.gob.mx/cfd/3}ArrayOfComprobanteConcepto" minOccurs="0"/>
 *         &lt;element name="Impuestos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Retenciones" type="{http://www.sat.gob.mx/cfd/3}ArrayOfComprobanteImpuestosRetencion" minOccurs="0"/>
 *                   &lt;element name="Traslados" type="{http://www.sat.gob.mx/cfd/3}ArrayOfComprobanteImpuestosTraslado" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="totalImpuestosRetenidos" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="totalImpuestosTrasladados" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Complemento" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Addenda" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="folio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumCtaPago" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FolioFiscalOrig" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SerieFolioFiscalOrig" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FechaFolioFiscalOrig" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="MontoFolioFiscalOrig" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="sello" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="formaDePago" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="noCertificado" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="certificado" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="condicionesDePago" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="descuento" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="motivoDescuento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="metodoDePago" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tipoDeComprobante" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ingreso"/>
 *             &lt;enumeration value="egreso"/>
 *             &lt;enumeration value="traslado"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emisor",
    "receptor",
    "conceptos",
    "impuestos",
    "complemento",
    "addenda"
})
@XmlRootElement(name = "comprobante", namespace = "http://www.sat.gob.mx/cfd/3")
public class Comprobante {

    @XmlElement(name = "Emisor", namespace = "http://www.sat.gob.mx/cfd/3")
    protected Comprobante.Emisor emisor;
    @XmlElement(name = "Receptor", namespace = "http://www.sat.gob.mx/cfd/3")
    protected Comprobante.Receptor receptor;
    @XmlElement(name = "Conceptos", namespace = "http://www.sat.gob.mx/cfd/3")
    protected ArrayOfComprobanteConcepto conceptos;
    @XmlElement(name = "Impuestos", namespace = "http://www.sat.gob.mx/cfd/3")
    protected Comprobante.Impuestos impuestos;
    @XmlElement(name = "Complemento", namespace = "http://www.sat.gob.mx/cfd/3")
    protected Comprobante.Complemento complemento;
    @XmlElement(name = "Addenda", namespace = "http://www.sat.gob.mx/cfd/3")
    protected Comprobante.Addenda addenda;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "serie")
    protected String serie;
    @XmlAttribute(name = "folio")
    protected String folio;
    @XmlAttribute(name = "LugarExpedicion")
    protected String lugarExpedicion;
    @XmlAttribute(name = "NumCtaPago")
    protected String numCtaPago;
    @XmlAttribute(name = "TipoCambio")
    protected String tipoCambio;
    @XmlAttribute(name = "Moneda")
    protected String moneda;
    @XmlAttribute(name = "FolioFiscalOrig")
    protected String folioFiscalOrig;
    @XmlAttribute(name = "SerieFolioFiscalOrig")
    protected String serieFolioFiscalOrig;
    @XmlAttribute(name = "FechaFolioFiscalOrig")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFolioFiscalOrig;
    @XmlAttribute(name = "MontoFolioFiscalOrig")
    protected BigDecimal montoFolioFiscalOrig;
    @XmlAttribute(name = "fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlAttribute(name = "sello")
    protected String sello;
    @XmlAttribute(name = "formaDePago")
    protected String formaDePago;
    @XmlAttribute(name = "noCertificado")
    protected String noCertificado;
    @XmlAttribute(name = "certificado")
    protected String certificado;
    @XmlAttribute(name = "condicionesDePago")
    protected String condicionesDePago;
    @XmlAttribute(name = "subTotal", required = true)
    protected BigDecimal subTotal;
    @XmlAttribute(name = "descuento")
    protected BigDecimal descuento;
    @XmlAttribute(name = "motivoDescuento")
    protected String motivoDescuento;
    @XmlAttribute(name = "total", required = true)
    protected BigDecimal total;
    @XmlAttribute(name = "metodoDePago")
    protected String metodoDePago;
    @XmlAttribute(name = "tipoDeComprobante", required = true)
    protected String tipoDeComprobante;

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Emisor }
     *     
     */
    public Comprobante.Emisor getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Emisor }
     *     
     */
    public void setEmisor(Comprobante.Emisor value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Receptor }
     *     
     */
    public Comprobante.Receptor getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Receptor }
     *     
     */
    public void setReceptor(Comprobante.Receptor value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComprobanteConcepto }
     *     
     */
    public ArrayOfComprobanteConcepto getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComprobanteConcepto }
     *     
     */
    public void setConceptos(ArrayOfComprobanteConcepto value) {
        this.conceptos = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestos.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Impuestos }
     *     
     */
    public Comprobante.Impuestos getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Impuestos }
     *     
     */
    public void setImpuestos(Comprobante.Impuestos value) {
        this.impuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad complemento.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Complemento }
     *     
     */
    public Comprobante.Complemento getComplemento() {
        return complemento;
    }

    /**
     * Define el valor de la propiedad complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Complemento }
     *     
     */
    public void setComplemento(Comprobante.Complemento value) {
        this.complemento = value;
    }

    /**
     * Obtiene el valor de la propiedad addenda.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Addenda }
     *     
     */
    public Comprobante.Addenda getAddenda() {
        return addenda;
    }

    /**
     * Define el valor de la propiedad addenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Addenda }
     *     
     */
    public void setAddenda(Comprobante.Addenda value) {
        this.addenda = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad numCtaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCtaPago() {
        return numCtaPago;
    }

    /**
     * Define el valor de la propiedad numCtaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCtaPago(String value) {
        this.numCtaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCambio(String value) {
        this.tipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad folioFiscalOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioFiscalOrig() {
        return folioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad folioFiscalOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioFiscalOrig(String value) {
        this.folioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad serieFolioFiscalOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieFolioFiscalOrig() {
        return serieFolioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad serieFolioFiscalOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieFolioFiscalOrig(String value) {
        this.serieFolioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFolioFiscalOrig.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFolioFiscalOrig() {
        return fechaFolioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad fechaFolioFiscalOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFolioFiscalOrig(XMLGregorianCalendar value) {
        this.fechaFolioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad montoFolioFiscalOrig.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoFolioFiscalOrig() {
        return montoFolioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad montoFolioFiscalOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoFolioFiscalOrig(BigDecimal value) {
        this.montoFolioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad sello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSello() {
        return sello;
    }

    /**
     * Define el valor de la propiedad sello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSello(String value) {
        this.sello = value;
    }

    /**
     * Obtiene el valor de la propiedad formaDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaDePago() {
        return formaDePago;
    }

    /**
     * Define el valor de la propiedad formaDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaDePago(String value) {
        this.formaDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad noCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificado() {
        return noCertificado;
    }

    /**
     * Define el valor de la propiedad noCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCertificado(String value) {
        this.noCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionesDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionesDePago() {
        return condicionesDePago;
    }

    /**
     * Define el valor de la propiedad condicionesDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionesDePago(String value) {
        this.condicionesDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Define el valor de la propiedad subTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuento(BigDecimal value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDescuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    /**
     * Define el valor de la propiedad motivoDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDescuento(String value) {
        this.motivoDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * Define el valor de la propiedad metodoDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoDePago(String value) {
        this.metodoDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * Define el valor de la propiedad tipoDeComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeComprobante(String value) {
        this.tipoDeComprobante = value;
    }


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
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    public static class Addenda {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }


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
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    public static class Complemento {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }


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
     *         &lt;element name="DomicilioFiscal" type="{http://www.sat.gob.mx/cfd/3}t_UbicacionFiscal" minOccurs="0"/>
     *         &lt;element name="ExpedidoEn" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
     *         &lt;element name="RegimenFiscal" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Regimen" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "domicilioFiscal",
        "expedidoEn",
        "regimenFiscal"
    })
    public static class Emisor {

        @XmlElement(name = "DomicilioFiscal", namespace = "http://www.sat.gob.mx/cfd/3")
        protected TUbicacionFiscal domicilioFiscal;
        @XmlElement(name = "ExpedidoEn", namespace = "http://www.sat.gob.mx/cfd/3")
        protected TUbicacion expedidoEn;
        @XmlElement(name = "RegimenFiscal", namespace = "http://www.sat.gob.mx/cfd/3")
        protected List<Comprobante.Emisor.RegimenFiscal> regimenFiscal;
        @XmlAttribute(name = "rfc")
        protected String rfc;
        @XmlAttribute(name = "nombre")
        protected String nombre;

        /**
         * Obtiene el valor de la propiedad domicilioFiscal.
         * 
         * @return
         *     possible object is
         *     {@link TUbicacionFiscal }
         *     
         */
        public TUbicacionFiscal getDomicilioFiscal() {
            return domicilioFiscal;
        }

        /**
         * Define el valor de la propiedad domicilioFiscal.
         * 
         * @param value
         *     allowed object is
         *     {@link TUbicacionFiscal }
         *     
         */
        public void setDomicilioFiscal(TUbicacionFiscal value) {
            this.domicilioFiscal = value;
        }

        /**
         * Obtiene el valor de la propiedad expedidoEn.
         * 
         * @return
         *     possible object is
         *     {@link TUbicacion }
         *     
         */
        public TUbicacion getExpedidoEn() {
            return expedidoEn;
        }

        /**
         * Define el valor de la propiedad expedidoEn.
         * 
         * @param value
         *     allowed object is
         *     {@link TUbicacion }
         *     
         */
        public void setExpedidoEn(TUbicacion value) {
            this.expedidoEn = value;
        }

        /**
         * Gets the value of the regimenFiscal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the regimenFiscal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegimenFiscal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Comprobante.Emisor.RegimenFiscal }
         * 
         * 
         */
        public List<Comprobante.Emisor.RegimenFiscal> getRegimenFiscal() {
            if (regimenFiscal == null) {
                regimenFiscal = new ArrayList<Comprobante.Emisor.RegimenFiscal>();
            }
            return this.regimenFiscal;
        }

        /**
         * Obtiene el valor de la propiedad rfc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRfc() {
            return rfc;
        }

        /**
         * Define el valor de la propiedad rfc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRfc(String value) {
            this.rfc = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Regimen" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RegimenFiscal {

            @XmlAttribute(name = "Regimen")
            protected String regimen;

            /**
             * Obtiene el valor de la propiedad regimen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegimen() {
                return regimen;
            }

            /**
             * Define el valor de la propiedad regimen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegimen(String value) {
                this.regimen = value;
            }

        }

    }


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
     *         &lt;element name="Retenciones" type="{http://www.sat.gob.mx/cfd/3}ArrayOfComprobanteImpuestosRetencion" minOccurs="0"/>
     *         &lt;element name="Traslados" type="{http://www.sat.gob.mx/cfd/3}ArrayOfComprobanteImpuestosTraslado" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="totalImpuestosRetenidos" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="totalImpuestosTrasladados" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "retenciones",
        "traslados"
    })
    public static class Impuestos {

        @XmlElement(name = "Retenciones", namespace = "http://www.sat.gob.mx/cfd/3")
        protected ArrayOfComprobanteImpuestosRetencion retenciones;
        @XmlElement(name = "Traslados", namespace = "http://www.sat.gob.mx/cfd/3")
        protected ArrayOfComprobanteImpuestosTraslado traslados;
        @XmlAttribute(name = "totalImpuestosRetenidos")
        protected BigDecimal totalImpuestosRetenidos;
        @XmlAttribute(name = "totalImpuestosTrasladados")
        protected BigDecimal totalImpuestosTrasladados;

        /**
         * Obtiene el valor de la propiedad retenciones.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfComprobanteImpuestosRetencion }
         *     
         */
        public ArrayOfComprobanteImpuestosRetencion getRetenciones() {
            return retenciones;
        }

        /**
         * Define el valor de la propiedad retenciones.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfComprobanteImpuestosRetencion }
         *     
         */
        public void setRetenciones(ArrayOfComprobanteImpuestosRetencion value) {
            this.retenciones = value;
        }

        /**
         * Obtiene el valor de la propiedad traslados.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfComprobanteImpuestosTraslado }
         *     
         */
        public ArrayOfComprobanteImpuestosTraslado getTraslados() {
            return traslados;
        }

        /**
         * Define el valor de la propiedad traslados.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfComprobanteImpuestosTraslado }
         *     
         */
        public void setTraslados(ArrayOfComprobanteImpuestosTraslado value) {
            this.traslados = value;
        }

        /**
         * Obtiene el valor de la propiedad totalImpuestosRetenidos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalImpuestosRetenidos() {
            return totalImpuestosRetenidos;
        }

        /**
         * Define el valor de la propiedad totalImpuestosRetenidos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalImpuestosRetenidos(BigDecimal value) {
            this.totalImpuestosRetenidos = value;
        }

        /**
         * Obtiene el valor de la propiedad totalImpuestosTrasladados.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalImpuestosTrasladados() {
            return totalImpuestosTrasladados;
        }

        /**
         * Define el valor de la propiedad totalImpuestosTrasladados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalImpuestosTrasladados(BigDecimal value) {
            this.totalImpuestosTrasladados = value;
        }

    }


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
     *         &lt;element name="Domicilio" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "domicilio"
    })
    public static class Receptor {

        @XmlElement(name = "Domicilio", namespace = "http://www.sat.gob.mx/cfd/3")
        protected TUbicacion domicilio;
        @XmlAttribute(name = "rfc")
        protected String rfc;
        @XmlAttribute(name = "nombre")
        protected String nombre;

        /**
         * Obtiene el valor de la propiedad domicilio.
         * 
         * @return
         *     possible object is
         *     {@link TUbicacion }
         *     
         */
        public TUbicacion getDomicilio() {
            return domicilio;
        }

        /**
         * Define el valor de la propiedad domicilio.
         * 
         * @param value
         *     allowed object is
         *     {@link TUbicacion }
         *     
         */
        public void setDomicilio(TUbicacion value) {
            this.domicilio = value;
        }

        /**
         * Obtiene el valor de la propiedad rfc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRfc() {
            return rfc;
        }

        /**
         * Define el valor de la propiedad rfc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRfc(String value) {
            this.rfc = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

    }

}
