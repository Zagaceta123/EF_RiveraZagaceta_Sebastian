package com.cibertec.dswii_ef_cache_sebastian_rivera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.dswii_ef_cache_sebastian_rivera.model.TarjetasCredito;

@Repository
public interface TarjetaCreditoRepository extends JpaRepository<TarjetasCredito, Integer> {
    List<TarjetasCredito> findByClienteId(Integer clienteId);
}