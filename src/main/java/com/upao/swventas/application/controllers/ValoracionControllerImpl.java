package com.upao.swventas.application.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upao.swventas.domain.entities.Valoracion;
import com.upao.swventas.domain.services.ValoracionService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/valoracion")
public class ValoracionControllerImpl implements ValoracionController{
	
	@Autowired 
	private ValoracionService valoracionService;
	
	@Override
	public List<Valoracion> ListarValoracion() {
		return valoracionService.Listar();
	}

	@Override
	public ResponseEntity<Valoracion> addValoracion(@RequestBody Valoracion valoracion) {
		Valoracion register = valoracionService.addValoracion(valoracion);
		return new ResponseEntity<Valoracion>(register, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Valoracion> updateValoracion(@RequestBody Valoracion valoracion) {
		Valoracion update = valoracionService.updateValoracion(valoracion);
		return new ResponseEntity<Valoracion>(update, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<String> deleteValoracion(Integer id) {
		valoracionService.deleteValoracion(id);
		return new ResponseEntity<String>("Valoracion eliminado", HttpStatus.OK);
	}

}
