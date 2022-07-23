package com.upao.swventas.application.controllers;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.upao.swventas.domain.entities.Formulario;



public interface FormularioController {
	
	@RequestMapping(value="/listar", produces = {"application/json"}, method = RequestMethod.GET)
    public List<Formulario> ListarFormulario();
	
	@PostMapping
	public ResponseEntity<Formulario> addFormulario(Formulario formulario);
	
	@PutMapping
	public ResponseEntity<Formulario> updateFormulario(Formulario formulario);
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFormulario(@PathVariable("id") Integer id);
	
}
