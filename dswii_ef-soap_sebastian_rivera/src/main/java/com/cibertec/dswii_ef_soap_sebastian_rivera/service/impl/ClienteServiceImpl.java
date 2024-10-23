package com.cibertec.dswii_ef_soap_sebastian_rivera.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Clientes;
import com.cibertec.dswii_ef_soap_sebastian_rivera.repository.ClienteRepository;
import com.cibertec.dswii_ef_soap_sebastian_rivera.service.ClienteService;

@Service
public class ClienteServiceImpl  implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    
	@Override
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
        return clienteRepository.findAll();
	}

	@Override
	public Optional<Clientes> findById(Integer id) {
		// TODO Auto-generated method stub
        return clienteRepository.findById(id);
	}

	@Override
	public Clientes save(Clientes cliente) {
		// TODO Auto-generated method stub
        return clienteRepository.save(cliente);
	}

	@Override
	public void deleteById(Integer id) {
        clienteRepository.deleteById(id);
		
	}

	@Override
	public Clientes update(Integer id, Clientes cliente) {
		 // Verifica si el cliente existe
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("Cliente no encontrado con id: " + id);
        }
        cliente.setIdcliente(id); // Establece el ID en el cliente a actualizar
        return clienteRepository.save(cliente); // Actualiza el cliente
	}

}
