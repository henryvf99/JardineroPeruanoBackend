package com.upao.swventas.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upao.swventas.domain.entities.Valoracion;
import com.upao.swventas.infrastructure.repositories.ValoracionRepositoryImpl;

@Service
public class ValoracionServiceImpl implements ValoracionService{
	
	@Autowired
	private ValoracionRepositoryImpl valoracionRepository;

	@Override
	public List<Valoracion> Listar() {
		return valoracionRepository.Listar();
	}

	@Override
	public Valoracion addValoracion(Valoracion valoracion) {
		return valoracionRepository.addValoracion(valoracion);
	}

	@Override
	public Valoracion updateValoracion(Valoracion valoracion) {
		return valoracionRepository.updateValoracion(valoracion);
	}

	@Override
	public void deleteValoracion(Integer id) {
		valoracionRepository.deleteValoracion(id);
	}

}
