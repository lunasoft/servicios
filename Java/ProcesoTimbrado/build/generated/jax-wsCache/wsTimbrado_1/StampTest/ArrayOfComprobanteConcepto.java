
package StampTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfComprobanteConcepto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfComprobanteConcepto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Concepto" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" minOccurs="0"/>
 *                     &lt;element name="Parte" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                             &lt;attribute name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="noIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                             &lt;attribute name="importe" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="ComplementoConcepto" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="CuentaPredial" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="numero" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="noIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="valorUnitario" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="importe" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComprobanteConcepto", namespace = "http://www.sat.gob.mx/cfd/3", propOrder = {
    "concepto"
})
public class ArrayOfComprobanteConcepto {

    @XmlElement(name = "Concepto")
    protected List<ArrayOfComprobanteConcepto.Concepto> concepto;

    /**
     * Gets the value of the concepto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concepto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcepto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfComprobanteConcepto.Concepto }
     * 
     * 
     */
    public List<ArrayOfComprobanteConcepto.Concepto> getConcepto() {
        if (concepto == null) {
            concepto = new ArrayList<ArrayOfComprobanteConcepto.Concepto>();
        }
        return this.concepto;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" minOccurs="0"/>
     *           &lt;element name="Parte" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                   &lt;attribute name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="noIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                   &lt;attribute name="importe" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="ComplementoConcepto" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="CuentaPredial" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="numero" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="noIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="valorUnitario" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="importe" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "informacionAduaneraOrParteOrComplementoConcepto"
    })
    public static class Concepto {

        @XmlElements({
            @XmlElement(name = "InformacionAduanera", namespace = "http://www.sat.gob.mx/cfd/3", type = TInformacionAduanera.class),
            @XmlElement(name = "Parte", namespace = "http://www.sat.gob.mx/cfd/3", type = ArrayOfComprobanteConcepto.Concepto.Parte.class),
            @XmlElement(name = "ComplementoConcepto", namespace = "http://www.sat.gob.mx/cfd/3", type = ArrayOfComprobanteConcepto.Concepto.ComplementoConcepto.class),
            @XmlElement(name = "CuentaPredial", namespace = "http://www.sat.gob.mx/cfd/3", type = ArrayOfComprobanteConcepto.Concepto.CuentaPredial.class)
        })
        protected List<Object> informacionAduaneraOrParteOrComplementoConcepto;
        @XmlAttribute(name = "cantidad", required = true)
        protected BigDecimal cantidad;
        @XmlAttribute(name = "unidad")
        protected String unidad;
        @XmlAttribute(name = "noIdentificacion")
        protected String noIdentificacion;
        @XmlAttribute(name = "descripcion")
        protected String descripcion;
        @XmlAttribute(name = "valorUnitario", required = true)
        protected BigDecimal valorUnitario;
        @XmlAttribute(name = "importe", required = true)
        protected BigDecimal importe;

        /**
         * Gets the value of the informacionAduaneraOrParteOrComplementoConcepto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informacionAduaneraOrParteOrComplementoConcepto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformacionAduaneraOrParteOrComplementoConcepto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TInformacionAduanera }
         * {@link ArrayOfComprobanteConcepto.Concepto.Parte }
         * {@link ArrayOfComprobanteConcepto.Concepto.ComplementoConcepto }
         * {@link ArrayOfComprobanteConcepto.Concepto.CuentaPredial }
         * 
         * 
         */
        public List<Object> getInformacionAduaneraOrParteOrComplementoConcepto() {
            if (informacionAduaneraOrParteOrComplementoConcepto == null) {
                informacionAduaneraOrParteOrComplementoConcepto = new ArrayList<Object>();
            }
            return this.informacionAduaneraOrParteOrComplementoConcepto;
        }

        /**
         * Obtiene el valor de la propiedad cantidad.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCantidad() {
            return cantidad;
        }

        /**
         * Define el valor de la propiedad cantidad.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCantidad(BigDecimal value) {
            this.cantidad = value;
        }

        /**
         * Obtiene el valor de la propiedad unidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnidad() {
            return unidad;
        }

        /**
         * Define el valor de la propiedad unidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnidad(String value) {
            this.unidad = value;
        }

        /**
         * Obtiene el valor de la propiedad noIdentificacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoIdentificacion() {
            return noIdentificacion;
        }

        /**
         * Define el valor de la propiedad noIdentificacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoIdentificacion(String value) {
            this.noIdentificacion = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

        /**
         * Obtiene el valor de la propiedad valorUnitario.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorUnitario() {
            return valorUnitario;
        }

        /**
         * Define el valor de la propiedad valorUnitario.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorUnitario(BigDecimal value) {
            this.valorUnitario = value;
        }

        /**
         * Obtiene el valor de la propiedad importe.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getImporte() {
            return importe;
        }

        /**
         * Define el valor de la propiedad importe.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setImporte(BigDecimal value) {
            this.importe = value;
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
        public static class ComplementoConcepto {

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
         *       &lt;attribute name="numero" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CuentaPredial {

            @XmlAttribute(name = "numero")
            protected String numero;

            /**
             * Obtiene el valor de la propiedad numero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumero() {
                return numero;
            }

            /**
             * Define el valor de la propiedad numero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumero(String value) {
                this.numero = value;
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
         *         &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="noIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="importe" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "informacionAduanera"
        })
        public static class Parte {

            @XmlElement(name = "InformacionAduanera", namespace = "http://www.sat.gob.mx/cfd/3")
            protected List<TInformacionAduanera> informacionAduanera;
            @XmlAttribute(name = "cantidad", required = true)
            protected BigDecimal cantidad;
            @XmlAttribute(name = "unidad")
            protected String unidad;
            @XmlAttribute(name = "noIdentificacion")
            protected String noIdentificacion;
            @XmlAttribute(name = "descripcion")
            protected String descripcion;
            @XmlAttribute(name = "valorUnitario")
            protected BigDecimal valorUnitario;
            @XmlAttribute(name = "importe")
            protected BigDecimal importe;

            /**
             * Gets the value of the informacionAduanera property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the informacionAduanera property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInformacionAduanera().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TInformacionAduanera }
             * 
             * 
             */
            public List<TInformacionAduanera> getInformacionAduanera() {
                if (informacionAduanera == null) {
                    informacionAduanera = new ArrayList<TInformacionAduanera>();
                }
                return this.informacionAduanera;
            }

            /**
             * Obtiene el valor de la propiedad cantidad.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidad(BigDecimal value) {
                this.cantidad = value;
            }

            /**
             * Obtiene el valor de la propiedad unidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidad() {
                return unidad;
            }

            /**
             * Define el valor de la propiedad unidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidad(String value) {
                this.unidad = value;
            }

            /**
             * Obtiene el valor de la propiedad noIdentificacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoIdentificacion() {
                return noIdentificacion;
            }

            /**
             * Define el valor de la propiedad noIdentificacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoIdentificacion(String value) {
                this.noIdentificacion = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Define el valor de la propiedad descripcion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcion(String value) {
                this.descripcion = value;
            }

            /**
             * Obtiene el valor de la propiedad valorUnitario.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorUnitario() {
                return valorUnitario;
            }

            /**
             * Define el valor de la propiedad valorUnitario.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorUnitario(BigDecimal value) {
                this.valorUnitario = value;
            }

            /**
             * Obtiene el valor de la propiedad importe.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporte() {
                return importe;
            }

            /**
             * Define el valor de la propiedad importe.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImporte(BigDecimal value) {
                this.importe = value;
            }

        }

    }

}
