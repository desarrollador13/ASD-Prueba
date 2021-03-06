package com.backendAsd.servicio;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.backendAsd.dto.ActivoBodyDto;
import com.backendAsd.dto.ActivoBodyResponseDto;
import com.backendAsd.dto.ActivoDto;
import com.backendAsd.dto.ActivosCrearDto;
import com.backendAsd.dto.FiltroRequestDto;
import com.backendAsd.dto.ActivosDto;

public interface IActivoServicio {

	ActivosDto listarActivos();
	ActivosDto filtrosActivos(FiltroRequestDto filtro);
	ActivosCrearDto crearActivo(ActivoBodyDto body);
}
