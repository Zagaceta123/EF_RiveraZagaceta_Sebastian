package com.cibertec.dswii_ef_soap_sebastian_rivera.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Transacciones;
import com.cibertec.dswii_ef_soap_sebastian_rivera.repository.TransaccionRepository;
import com.cibertec.dswii_ef_soap_sebastian_rivera.service.TransaccionService;

@Service
public class TransaccionServiceImpl  implements TransaccionService	{

	   @Autowired
	    private TransaccionRepository transaccionRepository;
	   
	@Override
	public List<Transacciones> findAll() {
		// TODO Auto-generated method stub
        return transaccionRepository.findAll();
	}

	@Override
	public Optional<Transacciones> findById(Integer id) {
		// TODO Auto-generated method stub
        return transaccionRepository.findById(id);
	}

	@Override
	public Transacciones save(Transacciones transaccion) {
		// TODO Auto-generated method stub
        return transaccionRepository.save(transaccion);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
        transaccionRepository.deleteById(id);
	}

}
