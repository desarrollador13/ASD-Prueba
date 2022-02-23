package com.backendAsd.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Activo")
public class ActivoEntidad implements Serializable{
	
	private static final long serialVersionUID = -6128077463400689472L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Activo_1")
	@SequenceGenerator(name = "Activo_1", sequenceName = "Activo", allocationSize = 1)
	@Column(name = "IdActivo")
	private Long IdActivo;
	@Column(name = "Nombre")
	private String Nombre;
	@Column(name = "Descripcion")
	private String Descripcion;
	@Column(name = "Tipo")
	private String Tipo;
	@Column(name = "Serial")
	private String Serial;
	@Column(name = "NumeroInternoInventario")
	private String NumeroInternoInventario;
	@Column(name = "Peso")
	private String Peso;
	@Column(name = "Alto")
	private String Alto;
	@Column(name = "Ancho")
	private String Ancho;
	@Column(name = "Largo")
	private String Largo;
	@Column(name = "ValorCompra")
	private String ValorCompra;
	@Column(name = "FechaCompra")
	private String FechaCompra;

}
