package com.cibertec.dswii_ef_soap_sebastian_rivera.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "cuentas")
public class Cuentas {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idcuenta;

	    @ManyToOne
	    @JoinColumn(name = "idcliente", nullable = false)
	    private Clientes cliente;
	    private String numero_cuenta;
	    private String tipo_cuenta;
	    private BigDecimal saldo;

	    // Relación uno a muchos con transacciones
	    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
	    private List<Transacciones> transacciones;
}
