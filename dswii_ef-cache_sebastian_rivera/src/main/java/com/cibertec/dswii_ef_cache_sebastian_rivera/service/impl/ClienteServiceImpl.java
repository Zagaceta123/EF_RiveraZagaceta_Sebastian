package com.cibertec.dswii_ef_cache_sebastian_rivera.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cibertec.dswii_ef_cache_sebastian_rivera.model.Clientes;
import com.cibertec.dswii_ef_cache_sebastian_rivera.repository.ClienteRepository;
import com.cibertec.dswii_ef_cache_sebastian_rivera.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
    private ClienteRepository clienteRepository;
	
	@Override
    @Cacheable("clientes")
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
        return clienteRepository.findAll();
	}

	@Override
    @Cacheable("clientes")
	public Optional<Clientes> findById(Integer id) {
		// TODO Auto-generated method stub
        return clienteRepository.findById(id);
	}

}
