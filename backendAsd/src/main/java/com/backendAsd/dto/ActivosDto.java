package com.backendAsd.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.backendAsd.dto.ActivoDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ActivosDto implements Serializable{
	
	private static final long serialVersionUID = 8547771531211171364L;
	private int codigo;
	private String mensanje;
	private List<ActivoDto> datos;
}
