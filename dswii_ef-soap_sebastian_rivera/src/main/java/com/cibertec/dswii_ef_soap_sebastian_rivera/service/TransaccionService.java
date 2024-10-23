package com.cibertec.dswii_ef_soap_sebastian_rivera.service;

import java.util.List;
import java.util.Optional;


import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Transacciones;

public interface TransaccionService {
	List<Transacciones> findAll();
    Optional<Transacciones> findById(Integer id);
    Transacciones save(Transacciones transaccion);
    void deleteById(Integer id);
}
