package com.backendAsd.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Builder
@ToString
public class ActivoDto implements Serializable{
	
	private static final long serialVersionUID = 8547771531211171364L;
	private Long idActivo;
	private String nombre;
	private String descripcion;
	private String tipo;
	private String serial;
	private String numeroInternoInventario;
	private String peso;
	private String alto;
	private String ancho;
	private String largo;
	private String valorCompra;
	public ActivoDto(Long idActivo, String nombre, String descripcion,String tipo,String serial,
			String numeroInternoInventario, String peso, String alto, String ancho,
			String largo, String valorCompra) {
		this.idActivo = idActivo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.serial = serial;
		this.numeroInternoInventario = numeroInternoInventario;
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.valorCompra = valorCompra;
	}

}
