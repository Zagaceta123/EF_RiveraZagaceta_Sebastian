//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.22 a las 10:24:08 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TarjetaCreditoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TarjetaCreditoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_tarjeta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero_tarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha_vencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="limite_credito" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TarjetaCreditoType", propOrder = {
    "idTarjeta",
    "idCliente",
    "numeroTarjeta",
    "fechaVencimiento",
    "limiteCredito"
})
public class TarjetaCreditoType {

    @XmlElement(name = "id_tarjeta")
    protected int idTarjeta;
    @XmlElement(name = "id_cliente")
    protected int idCliente;
    @XmlElement(name = "numero_tarjeta", required = true)
    protected String numeroTarjeta;
    @XmlElement(name = "fecha_vencimiento", required = true)
    protected String fechaVencimiento;
    @XmlElement(name = "limite_credito")
    protected double limiteCredito;

    /**
     * Obtiene el valor de la propiedad idTarjeta.
     * 
     */
    public int getIdTarjeta() {
        return idTarjeta;
    }

    /**
     * Define el valor de la propiedad idTarjeta.
     * 
     */
    public void setIdTarjeta(int value) {
        this.idTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Define el valor de la propiedad numeroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimiento(String value) {
        this.fechaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad limiteCredito.
     * 
     */
    public double getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * Define el valor de la propiedad limiteCredito.
     * 
     */
    public void setLimiteCredito(double value) {
        this.limiteCredito = value;
    }

}
