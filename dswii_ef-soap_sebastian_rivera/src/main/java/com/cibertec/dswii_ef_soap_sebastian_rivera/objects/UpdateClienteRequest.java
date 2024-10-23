package com.cibertec.dswii_ef_soap_sebastian_rivera.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cliente"
})
@XmlRootElement(name = "updateClienteRequest")
public class UpdateClienteRequest {

    @XmlElement(required = true)
    protected Clientesws cliente;

    public Clientesws getCliente() {
        return cliente;
    }

    public void setCliente(Clientesws value) {
        this.cliente = value;
    }
}
