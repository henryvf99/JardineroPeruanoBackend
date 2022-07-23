package com.upao.swventas.application.controllers;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.upao.swventas.domain.entities.Usuario;

public interface UsuarioController {
	@RequestMapping(value="/listar", produces = {"application/json"}, method = RequestMethod.GET)
    public List<Usuario> ListarUsuario();
	
	@PostMapping
	public ResponseEntity<Usuario> addUsuario(Usuario usuario);
	
	@PutMapping
	public ResponseEntity<Usuario> updateUsuario(Usuario usuario);
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUsuario(@PathVariable("id") Integer id);
}
