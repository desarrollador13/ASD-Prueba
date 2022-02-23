package com.backendAsd.servicio.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendAsd.dto.ActivoBodyDto;
import com.backendAsd.dto.ActivosDto;
import com.backendAsd.dto.ActivoBodyResponseDto;
import com.backendAsd.dto.ActivoDto;
import com.backendAsd.dto.ActivosCrearDto;
import com.backendAsd.dto.FiltroRequestDto;
import com.backendAsd.excepcion.CustomRuntimeException;
import com.backendAsd.repositorio.ActivoRepositorio;
import com.backendAsd.repositorio.ActivosFiltrosRepositorioCustomImpl;
import com.backendAsd.servicio.IActivoServicio;
@Service
public class ActivoServicioImpl implements IActivoServicio{
	
	@Autowired
	private ActivoRepositorio activoRepositorio;
	
	@Autowired
	private ActivosFiltrosRepositorioCustomImpl activosFiltrosRepositorio;
	
	@Override
	public ActivosDto listarActivos() {
		try {
			List<ActivoDto> activo = activoRepositorio.listar();
			return ActivosDto.builder().codigo(200).mensanje("exitoso").datos(activo).build();
		} catch (Exception e) {
			throw new CustomRuntimeException("No es posible listar los Activos. " + e.getMessage());
		}
	}
	
	@Override
	public ActivosDto filtrosActivos(FiltroRequestDto filtro) {
		try {
			String queryParams = agregarConsulta(filtro);
			List<ActivoDto> activoList = activosFiltrosRepositorio
					.listarActivosFiltros(queryParams, filtro);
			return ActivosDto.builder().codigo(200).mensanje("exitoso").datos(activoList).build();
		}catch (Exception e) {
			throw new CustomRuntimeException("No es posible listar los Activos. " + e.getMessage());
		}
	}
	
	@Override
	public ActivosCrearDto crearActivo(ActivoBodyDto body) {
		System.out.println(body.getNombre());
		try {
			int res = activoRepositorio.crearActivo(body.getNombre(), body.getDescripcion(), body.getTipo(), body.getSerial(), 
					body.getNumeroInternoInventario(), body.getPeso(), body.getAlto(), body.getAncho(), 
					body.getLargo(), body.getValorCompra());
			System.out.println(res);
			return ActivosCrearDto.builder().codigo(201).mensanje("Exitoso").build();
		}catch (Exception e) {
			throw new CustomRuntimeException("No es posible crear Activos. " + e.getMessage());
		}
	}
	
	public String agregarConsulta(FiltroRequestDto filtro) {
		String queryParams = "";
		if(!filtro.getSerial().isEmpty() && filtro.getFecha().isEmpty()) {
			queryParams += " where activo.Serial = : Serial";
		}
		if(!filtro.getFecha().isEmpty() && filtro.getSerial().isEmpty()) {
			queryParams += " where activo.FechaCompra like concat('%',:FechaCompra,'%')";
		}
		if(!filtro.getFecha().isEmpty() && !filtro.getSerial().isEmpty()) {
			queryParams += " where activo.Serial = : Serial and  activo.FechaCompra like concat('%',:FechaCompra,'%')";
		}
		return queryParams;
	}
	
}
