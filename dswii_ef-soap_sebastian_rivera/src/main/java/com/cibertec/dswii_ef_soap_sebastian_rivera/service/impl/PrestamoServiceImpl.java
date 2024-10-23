package com.cibertec.dswii_ef_soap_sebastian_rivera.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Prestamos;
import com.cibertec.dswii_ef_soap_sebastian_rivera.repository.PrestamoRepository;
import com.cibertec.dswii_ef_soap_sebastian_rivera.service.PrestamoService;

@Service
public class PrestamoServiceImpl implements PrestamoService{


    @Autowired
    private PrestamoRepository prestamoRepository;
    
	@Override
	public List<Prestamos> findAll() {
		// TODO Auto-generated method stub
        return prestamoRepository.findAll();
	}

	@Override
	public Optional<Prestamos> findById(Integer id) {
		// TODO Auto-generated method stub
        return prestamoRepository.findById(id);
	}

	@Override
	public Prestamos save(Prestamos prestamo) {
		// TODO Auto-generated method stub
        return prestamoRepository.save(prestamo);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
        prestamoRepository.deleteById(id);
	}

	@Override
	public Optional<Prestamos> findByIdCliente(Integer idCliente) {
		// TODO Auto-generated method stub
        return prestamoRepository.findByIdCliente(idCliente);
	}

}
