package com.upao.swventas.infrastructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upao.swventas.domain.entities.Valoracion;
import com.upao.swventas.domain.repositories.ValoracionRepository;


@Component
public class ValoracionRepositoryImpl implements ValoracionRepository{
	
	@Autowired
	ValoracionJpaRepository db;
	
	@Override
	public List<Valoracion> Listar() {
		return db.findAll();
	}

	@Override
	public Valoracion addValoracion(Valoracion valoracion) {
		return db.save(valoracion);
	}

	@Override
	public Valoracion updateValoracion(Valoracion valoracion) {
		return db.save(valoracion);
	}

	@Override
	public void deleteValoracion(Integer id) {
		db.deleteById(id);
	}

}
