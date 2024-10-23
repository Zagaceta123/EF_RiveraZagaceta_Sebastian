package com.cibertec.dswii_ef_soap_sebastian_rivera.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientes"
})
@XmlRootElement(name = "postClienteResponse")
public class PostClienteResponse {
	 @XmlElement(required = true)
	    protected Clientesws clientes;

	    public Clientesws getClientesws() {
	        return clientes;
	    }

	    

	    public void setCliente(Clientesws value) {
	        this.clientes = value;
	    }
}
