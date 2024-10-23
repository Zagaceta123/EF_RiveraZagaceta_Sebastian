package com.cibertec.dswii_ef_soap_sebastian_rivera.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Prestamos;

public interface PrestamoService {
	List<Prestamos> findAll();
    Optional<Prestamos> findById(Integer id);
    Prestamos save(Prestamos prestamo);
    void deleteById(Integer id);
    Optional<Prestamos> findByIdCliente(Integer idCliente);

}
