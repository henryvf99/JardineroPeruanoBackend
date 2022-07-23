package com.upao.swventas.application.controllers;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.upao.swventas.domain.entities.Valoracion;

public interface ValoracionController {
	
	@RequestMapping(value="/listar", produces = {"application/json"}, method = RequestMethod.GET)
	public List<Valoracion> ListarValoracion();
	
	@PostMapping
	public ResponseEntity<Valoracion> addValoracion(Valoracion valoracion);
	
	@PutMapping
	public ResponseEntity<Valoracion> updateValoracion(Valoracion valoracion);
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteValoracion(@PathVariable("id") Integer id);

}
