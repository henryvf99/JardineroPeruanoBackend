package com.upao.swventas.infrastructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upao.swventas.domain.entities.Formulario;
import com.upao.swventas.domain.repositories.FormularioRepository;


@Component
public class FormularioRepositoryImpl implements FormularioRepository{

	@Autowired
    FormularioJpaRepository db;

    @Override
    public List<Formulario> Listar() {
        return db.findAll();
    }

	@Override
	public Formulario addFormulario(Formulario formulario) {
		return db.save(formulario);
	}

	@Override
	public Formulario updateFormulario(Formulario formulario) {
		return db.save(formulario);
	}

	@Override
	public void deleteFormulario(Integer id) {
		db.deleteById(id);
	}
	
}
