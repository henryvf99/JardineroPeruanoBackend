package com.upao.swventas.domain.services;

import java.util.List;

import com.upao.swventas.domain.entities.Formulario;

public interface FormularioService {
	List<Formulario> Listar();
	Formulario addFormulario(Formulario formulario);
	Formulario updateFormulario(Formulario formulario);
    void deleteFormulario(Integer id);
}
