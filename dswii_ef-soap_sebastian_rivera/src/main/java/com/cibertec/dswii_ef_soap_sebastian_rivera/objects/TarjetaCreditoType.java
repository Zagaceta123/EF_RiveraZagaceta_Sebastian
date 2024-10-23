package com.cibertec.dswii_ef_soap_sebastian_rivera.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TarjetaCreditoType", propOrder = {
    "idTarjeta",
    "idCliente",
    "numeroTarjeta",
    "fechaVencimiento",
    "limiteCredito"
})
public class TarjetaCreditoType {

    @XmlElement(name = "id_tarjeta", required = true)
    protected int idTarjeta;

    @XmlElement(name = "id_cliente", required = true)
    protected int idCliente;

    @XmlElement(name = "numero_tarjeta", required = true)
    protected String numeroTarjeta;

    @XmlElement(name = "fecha_vencimiento", required = true)
    protected String fechaVencimiento;

    @XmlElement(name = "limite_credito", required = true)
    protected double limiteCredito;

    // Getters y Setters
    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
