package com.cibertec.dswii_ef_soap_sebastian_rivera.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Cuentas;
import com.cibertec.dswii_ef_soap_sebastian_rivera.repository.CuentaRepository;
import com.cibertec.dswii_ef_soap_sebastian_rivera.service.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {

	  @Autowired
	    private CuentaRepository cuentaRepository;
	  
	@Override
	public List<Cuentas> findAll() {
		// TODO Auto-generated method stub
        return cuentaRepository.findAll();
	}

	@Override
	public Optional<Cuentas> findById(Integer id) {
		// TODO Auto-generated method stub
        return cuentaRepository.findById(id);
	}

	@Override
	public Cuentas save(Cuentas cuenta) {
		// TODO Auto-generated method stub
        return cuentaRepository.save(cuenta);
	}

	@Override
	public void deleteById(Integer id) {
        cuentaRepository.deleteById(id);
		
	}

}
