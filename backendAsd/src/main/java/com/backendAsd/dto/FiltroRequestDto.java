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
public class FiltroRequestDto implements Serializable{
	
	private static final long serialVersionUID = -2583245140288277668L;
	
	private String serial;
	private String fecha;
}
