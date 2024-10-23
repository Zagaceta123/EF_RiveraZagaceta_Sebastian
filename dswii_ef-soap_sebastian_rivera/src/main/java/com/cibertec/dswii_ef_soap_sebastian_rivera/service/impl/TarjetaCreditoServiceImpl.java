package com.cibertec.dswii_ef_soap_sebastian_rivera.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.TarjetasCredito;
import com.cibertec.dswii_ef_soap_sebastian_rivera.repository.TarjetaCreditoRepository;
import com.cibertec.dswii_ef_soap_sebastian_rivera.service.TarjetaCreditoService;

@Service
public class TarjetaCreditoServiceImpl implements TarjetaCreditoService{

	  @Autowired
	    private TarjetaCreditoRepository tarjetaCreditoRepository;

	
	@Override
	public List<TarjetasCredito> findAll() {
		// TODO Auto-generated method stub
        return tarjetaCreditoRepository.findAll();
	}

	@Override
	public Optional<TarjetasCredito> findById(Integer id) {
		// TODO Auto-generated method stub
        return tarjetaCreditoRepository.findById(id);
	}

	@Override
	public TarjetasCredito save(TarjetasCredito tarjetaCredito) {
		// TODO Auto-generated method stub
        return tarjetaCreditoRepository.save(tarjetaCredito);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
        tarjetaCreditoRepository.deleteById(id);

	}

}
