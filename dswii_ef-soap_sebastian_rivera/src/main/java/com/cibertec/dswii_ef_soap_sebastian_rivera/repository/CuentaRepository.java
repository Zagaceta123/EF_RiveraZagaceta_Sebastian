package com.cibertec.dswii_ef_soap_sebastian_rivera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Cuentas;

@Repository
public interface CuentaRepository extends JpaRepository<Cuentas, Integer> {

}
