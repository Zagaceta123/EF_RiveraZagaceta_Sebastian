package com.cibertec.dswii_ef_soap_sebastian_rivera.util.convert;

import org.springframework.stereotype.Component;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Clientes;
import com.cibertec.dswii_ef_soap_sebastian_rivera.objects.Clientesws;



@Component
public class ClientesConvert {

	  public Clientes mapToClientes(Clientesws clientesws){
		  Clientes clientes = new Clientes();
		  clientes.setIdcliente(clientesws.getIdcliente());
		  clientes.setNombre(clientesws.getNombre());
		  clientes.setDni(clientesws.getDni());
		  clientes.setEmail(clientesws.getEmail());
		  clientes.setTelefono(clientesws.getTelefono());

	        return clientes;
	    }
	    public Clientesws mapToClientesws(Clientes clientes){
	    	Clientesws clientesws = new Clientesws();
	    	
	    	clientesws.setIdcliente(clientes.getIdcliente());
	    	clientesws.setNombre(clientes.getNombre());
	    	clientesws.setDni(clientes.getDni());
	    	clientesws.setEmail(clientes.getEmail());
	    	clientesws.setTelefono(clientes.getTelefono());
	        return clientesws;
	    }
}
