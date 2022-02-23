package com.backendAsd.repositorio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

import com.backendAsd.dto.FiltroRequestDto;
import com.backendAsd.dto.ActivoDto;

@Repository
@Slf4j
public class ActivosFiltrosRepositorioCustomImpl {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<ActivoDto> listarActivosFiltros(String queryParams, 
			FiltroRequestDto filtro) {
		
		Query query = em.createQuery("SELECT new com.backendAsd.dto.ActivoDto"
				+ " (activo.IdActivo, activo.Nombre, activo.Descripcion, activo.Tipo,activo.Serial, "
				+ "  activo.NumeroInternoInventario, activo.Peso, activo.Alto,"
				+ " activo.Ancho, activo.Largo, activo.ValorCompra) "
				+ "  FROM ActivoEntidad activo "
				+ queryParams);
		if(!filtro.getSerial().isEmpty()) {
			query.setParameter("Serial",filtro.getSerial());
		}
		if(!filtro.getFecha().isEmpty()) {
			query.setParameter("FechaCompra",filtro.getFecha());
		}
		List<ActivoDto> activoList =  query.getResultList();
		return activoList;
	}

}
