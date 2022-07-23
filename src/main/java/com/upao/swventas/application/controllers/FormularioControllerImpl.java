package com.upao.swventas.application.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upao.swventas.domain.entities.Formulario;
import com.upao.swventas.domain.services.FormularioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/formulario")
public class FormularioControllerImpl implements FormularioController{
	
	@Autowired
    private FormularioService formularioService;
	
    @Override
    public List<Formulario> ListarFormulario() {
        return formularioService.Listar();
    }

	@Override
	public ResponseEntity<Formulario> addFormulario (@RequestBody Formulario formulario){
		Formulario register = formularioService.addFormulario(formulario);
        return new ResponseEntity<Formulario>(register, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Formulario> updateFormulario(@RequestBody Formulario formulario) {
		Formulario update = formularioService.updateFormulario(formulario);
        return new ResponseEntity<Formulario>(update, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<String> deleteFormulario(Integer id) {
		formularioService.deleteFormulario(id);
		return new ResponseEntity<String>("Formulario eliminado", HttpStatus.OK);
	}
	
}
