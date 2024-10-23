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
 * <p>Clase Java para PrestamoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PrestamoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_prestamo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monto_prestamo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tasa_interes" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="fecha_otorgamiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrestamoType", propOrder = {
    "idPrestamo",
    "idCliente",
    "montoPrestamo",
    "tasaInteres",
    "fechaOtorgamiento"
})
public class PrestamoType {

    @XmlElement(name = "id_prestamo")
    protected int idPrestamo;
    @XmlElement(name = "id_cliente")
    protected int idCliente;
    @XmlElement(name = "monto_prestamo")
    protected double montoPrestamo;
    @XmlElement(name = "tasa_interes")
    protected double tasaInteres;
    @XmlElement(name = "fecha_otorgamiento", required = true)
    protected String fechaOtorgamiento;

    /**
     * Obtiene el valor de la propiedad idPrestamo.
     * 
     */
    public int getIdPrestamo() {
        return idPrestamo;
    }

    /**
     * Define el valor de la propiedad idPrestamo.
     * 
     */
    public void setIdPrestamo(int value) {
        this.idPrestamo = value;
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
     * Obtiene el valor de la propiedad montoPrestamo.
     * 
     */
    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    /**
     * Define el valor de la propiedad montoPrestamo.
     * 
     */
    public void setMontoPrestamo(double value) {
        this.montoPrestamo = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaInteres.
     * 
     */
    public double getTasaInteres() {
        return tasaInteres;
    }

    /**
     * Define el valor de la propiedad tasaInteres.
     * 
     */
    public void setTasaInteres(double value) {
        this.tasaInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOtorgamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOtorgamiento() {
        return fechaOtorgamiento;
    }

    /**
     * Define el valor de la propiedad fechaOtorgamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOtorgamiento(String value) {
        this.fechaOtorgamiento = value;
    }

}
