package com.backendAsd.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ActivoBodyDto implements Serializable{
	
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

}
