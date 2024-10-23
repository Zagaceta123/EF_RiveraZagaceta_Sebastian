package com.cibertec.dswii_ef_soap_sebastian_rivera.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientesws", propOrder = {
    "idcliente",
    "nombre",
    "dni",
    "email",
    "telefono"
})
public class Clientesws {

	 protected int idcliente;
	    @XmlElement(required = true)
	    protected String nombre;
	    protected String dni;
	    protected String email;
	    protected String telefono;
	    
	    public int getIdcliente() {
	        return idcliente;
	    }

	    public void setIdcliente(int value) {
	        this.idcliente = value;
	    }
	    
	    
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String value) {
	        this.nombre = value;
	    }
	    
	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String value) {
	        this.dni = value;
	    }
	    
	    
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String value) {
	        this.email = value;
	    }
	    
	    
	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String value) {
	        this.telefono = value;
	    }

}
