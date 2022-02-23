package com.backendAsd.controlador;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.backendAsd.dto.ActivoDto;
import com.backendAsd.dto.ActivosCrearDto;
import com.backendAsd.dto.FiltroRequestDto;
import com.backendAsd.servicio.IActivoServicio;
import com.backendAsd.dto.ActivoBodyDto;
import com.backendAsd.dto.ActivoBodyResponseDto;
import com.backendAsd.dto.ActivosDto;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/")
public class ActivosControlador {
	
	@Autowired
	private IActivoServicio activoServicio;
	//@PostMapping
	/*@GetMapping
	public Map<String, Object> prueba() {
		
		Map<String, Object> rtn = new LinkedHashMap<>();
	    rtn.put("name", "Jonathan");
	    rtn.put("lastName", "Pinto Aroca");
	    return rtn;
		
	}*/
	
	@GetMapping("activos")
	public ResponseEntity<ActivosDto> listarActivos() {
		return ResponseEntity.status(HttpStatus.OK).body(activoServicio.listarActivos());
	}
	
	@PostMapping("activos/filtros")
	public ResponseEntity<ActivosDto> filtrosActivos(
			@RequestBody FiltroRequestDto filtro) {
		return ResponseEntity.status(HttpStatus.OK).body(activoServicio.filtrosActivos(filtro));
	}
	
	@PostMapping("activos")
	public ResponseEntity<ActivosCrearDto> crearActivos(
			@RequestBody ActivoBodyDto body) {
		return ResponseEntity.status(HttpStatus.CREATED).body(activoServicio.crearActivo(body));
	}

}
