package com.upao.swventas.domain.repositories;

import java.util.List;

import com.upao.swventas.domain.entities.Formulario;

public interface FormularioRepository {
	List<Formulario> Listar();
	Formulario addFormulario(Formulario formulario);
	Formulario updateFormulario(Formulario formulario);
    void deleteFormulario(Integer id);
}
