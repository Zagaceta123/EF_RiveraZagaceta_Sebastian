package com.cibertec.dswii_ef_cache_sebastian_rivera.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cibertec.dswii_ef_cache_sebastian_rivera.model.TarjetasCredito;
import com.cibertec.dswii_ef_cache_sebastian_rivera.repository.TarjetaCreditoRepository;
import com.cibertec.dswii_ef_cache_sebastian_rivera.service.TarjetaCreditoService;

@Service
public class TarjetaCreditoServiceImpl implements TarjetaCreditoService{

	 @Autowired
	    private TarjetaCreditoRepository tarjetaCreditoRepository;

	@Override
    @Cacheable("tarjetasCredito")
	public List<TarjetasCredito> findByClienteId(Integer clienteId) {
		// TODO Auto-generated method stub
        return tarjetaCreditoRepository.findByClienteId(clienteId);
	}
	 
}
