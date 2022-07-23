package com.upao.swventas.domain.services;

import java.util.List;

import com.upao.swventas.domain.entities.Valoracion;

public interface ValoracionService {
	List<Valoracion> Listar();
	Valoracion addValoracion(Valoracion valoracion);
	Valoracion updateValoracion(Valoracion valoracion);
    void deleteValoracion(Integer id);
}
