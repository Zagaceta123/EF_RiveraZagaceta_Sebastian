package com.cibertec.dswii_ef_soap_sebastian_rivera.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "updateClienteResponse")
public class UpdateClienteResponse {

    @XmlElement(required = true)
    protected String message; // Mensaje de éxito o error

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }
}
