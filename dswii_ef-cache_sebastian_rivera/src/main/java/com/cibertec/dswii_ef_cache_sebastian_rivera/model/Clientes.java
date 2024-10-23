package com.cibertec.dswii_ef_cache_sebastian_rivera.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "clientes")
public class Clientes {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idcliente;
	    private String nombre;
	    private String dni;
	    private String email;
	    private String telefono;

	    // Relación uno a muchos con cuentas, tarjetas y préstamos
	    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	    private List<Cuentas> cuentas;

	    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	    private List<TarjetasCredito> tarjetasCredito;

	    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	    private List<Prestamos> prestamos;
}
