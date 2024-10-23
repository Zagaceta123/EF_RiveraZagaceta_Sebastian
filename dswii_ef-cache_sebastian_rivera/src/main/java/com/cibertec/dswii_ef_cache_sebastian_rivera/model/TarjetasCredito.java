package com.cibertec.dswii_ef_cache_sebastian_rivera.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "tarjetasCredito")
public class TarjetasCredito {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idtarjeta;

	    @ManyToOne
	    @JoinColumn(name = "idcliente", nullable = false)
	    private Clientes cliente;

	    private String numero_tarjeta;

	    @Column(nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date fecha_vencimiento;

	    private BigDecimal limite_credito;
}
