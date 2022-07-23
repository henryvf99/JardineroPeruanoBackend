package com.upao.swventas.application.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upao.swventas.domain.entities.Usuario;
import com.upao.swventas.domain.services.UsuarioService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/usuario")

public class UsuarioControllerImpl implements UsuarioController{

	@Autowired
    private UsuarioService usuarioService;
	
    @Override
    public List<Usuario> ListarUsuario() {
        return usuarioService.Listar();
    }

	@Override
	public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
		Usuario register = usuarioService.addUsuario(usuario);
        return new ResponseEntity<Usuario>(register, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario) {
		Usuario register = usuarioService.updateUsuario(usuario);
        return new ResponseEntity<Usuario>(register, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<String> deleteUsuario(Integer id) {
		usuarioService.deleteUsuario(id);
		return new ResponseEntity<String>("Usuario eliminado", HttpStatus.OK);
	}
}
