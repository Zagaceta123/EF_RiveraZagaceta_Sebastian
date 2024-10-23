package com.cibertec.dswii_ef_soap_sebastian_rivera.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Cuentas;

public interface CuentaService {
    List<Cuentas> findAll();
    Optional<Cuentas> findById(Integer id);
    Cuentas save(Cuentas cuenta);
    void deleteById(Integer id);
}
