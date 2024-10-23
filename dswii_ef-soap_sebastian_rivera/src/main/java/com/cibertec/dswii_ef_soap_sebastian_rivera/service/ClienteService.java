package com.cibertec.dswii_ef_soap_sebastian_rivera.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Clientes;

public interface ClienteService {
    List<Clientes> findAll();
    Optional<Clientes> findById(Integer id);
    Clientes save(Clientes cliente);
    void deleteById(Integer id);
    Clientes update(Integer id, Clientes cliente); 
}
