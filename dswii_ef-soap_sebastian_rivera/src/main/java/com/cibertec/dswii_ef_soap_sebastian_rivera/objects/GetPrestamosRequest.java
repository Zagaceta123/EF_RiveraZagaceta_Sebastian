package com.cibertec.dswii_ef_soap_sebastian_rivera.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getPrestamosRequest")
public class GetPrestamosRequest {

    @XmlElement(required = true)
    protected int idCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int value) {
        this.idCliente = value;
    }
}
