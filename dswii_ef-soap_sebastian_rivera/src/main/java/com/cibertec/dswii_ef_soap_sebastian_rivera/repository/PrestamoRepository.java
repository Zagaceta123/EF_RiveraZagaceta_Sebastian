package com.cibertec.dswii_ef_soap_sebastian_rivera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.Prestamos;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamos, Integer> {

}
