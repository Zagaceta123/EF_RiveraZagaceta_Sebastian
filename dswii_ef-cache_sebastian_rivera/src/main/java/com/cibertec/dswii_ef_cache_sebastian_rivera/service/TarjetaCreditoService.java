package com.cibertec.dswii_ef_cache_sebastian_rivera.service;

import java.util.List;

import com.cibertec.dswii_ef_cache_sebastian_rivera.model.TarjetasCredito;

public interface TarjetaCreditoService {
    List<TarjetasCredito> findByClienteId(Integer clienteId);

}
