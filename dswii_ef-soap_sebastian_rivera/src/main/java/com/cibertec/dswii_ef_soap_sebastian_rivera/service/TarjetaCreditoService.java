package com.cibertec.dswii_ef_soap_sebastian_rivera.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.dswii_ef_soap_sebastian_rivera.model.TarjetasCredito;

public interface TarjetaCreditoService {
	 List<TarjetasCredito> findAll();
	    Optional<TarjetasCredito> findById(Integer id);
	    TarjetasCredito save(TarjetasCredito tarjetaCredito);
	    void deleteById(Integer id);
}
