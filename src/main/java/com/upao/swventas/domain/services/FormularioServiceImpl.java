package com.upao.swventas.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upao.swventas.domain.entities.Formulario;
import com.upao.swventas.infrastructure.repositories.FormularioRepositoryImpl;

@Service
public class FormularioServiceImpl implements FormularioService{

	@Autowired
    private FormularioRepositoryImpl formularioRepository;

    @Override
    public List<Formulario> Listar() {
        return formularioRepository.Listar();
    }

	@Override
	public Formulario addFormulario(Formulario formulario) {
		return formularioRepository.addFormulario(formulario);
	}

	@Override
	public Formulario updateFormulario(Formulario formulario) {
		return formularioRepository.updateFormulario(formulario);
	}

	@Override
	public void deleteFormulario(Integer id) {
		formularioRepository.deleteFormulario(id);
	}
	
}
