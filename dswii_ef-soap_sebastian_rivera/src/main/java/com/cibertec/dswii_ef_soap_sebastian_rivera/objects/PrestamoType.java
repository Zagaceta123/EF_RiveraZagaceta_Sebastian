package com.cibertec.dswii_ef_soap_sebastian_rivera.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrestamoType", propOrder = {
    "idPrestamo",
    "idCliente",
    "montoPrestamo",
    "tasaInteres",
    "fechaOtorgamiento"
})
public class PrestamoType {

    @XmlElement(name = "id_prestamo", required = true)
    protected int idPrestamo;

    @XmlElement(name = "id_cliente", required = true)
    protected int idCliente;

    @XmlElement(name = "monto_prestamo", required = true)
    protected double montoPrestamo;

    @XmlElement(name = "tasa_interes", required = true)
    protected double tasaInteres;

    @XmlElement(name = "fecha_otorgamiento", required = true)
    protected String fechaOtorgamiento;

    // Getters y Setters
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public String getFechaOtorgamiento() {
        return fechaOtorgamiento;
    }

    public void setFechaOtorgamiento(String fechaOtorgamiento) {
        this.fechaOtorgamiento = fechaOtorgamiento;
    }
}
