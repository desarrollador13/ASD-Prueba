package com.backendAsd.repositorio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.backendAsd.modelo.ActivoEntidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backendAsd.dto.ActivoDto;

@Repository
public interface ActivoRepositorio extends JpaRepository<ActivoEntidad, Long>{
	
	@Query("SELECT new com.backendAsd.dto.ActivoDto"
			+ " (activo.IdActivo, activo.Nombre, activo.Descripcion, activo.Tipo,activo.Serial, "
			+ "  activo.NumeroInternoInventario, activo.Peso, activo.Alto,"
			+ " activo.Ancho, activo.Largo, activo.ValorCompra) "
			+ "  FROM ActivoEntidad activo ")
	List<ActivoDto> listar();
	
	 @Modifying
	 @Transactional
	    @Query(value = "INSERT INTO Activo (Nombre,Descripcion, Tipo, Serial,"
	    		+ " NumeroInternoInventario,Peso,Alto,Ancho,Largo,ValorCompra)"
	    		+ " VALUES( :Nombre,:Descripcion,:Tipo,:Serial,:NumeroInternoInventario,:Peso,"
	    		+ " :Alto,:Ancho,:Largo,:ValorCompra"
	    		+ " )" , nativeQuery = true)
	 //public int crearActivo();
	 public int crearActivo(@Param("Nombre")String nombre, @Param("Descripcion")String descripcion, 
			 @Param("Tipo")String tipo,@Param("Serial")String serial, 
			 @Param("NumeroInternoInventario")String numeroInternoInventario,
			 @Param("Peso")String peso,@Param("Alto")String alto,@Param("Ancho")String ancho,
			 @Param("Largo")String largo,@Param("ValorCompra")String valorCompra);

}
