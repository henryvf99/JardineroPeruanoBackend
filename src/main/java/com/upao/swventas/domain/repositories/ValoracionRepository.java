package com.upao.swventas.domain.repositories;

import java.util.List;

import com.upao.swventas.domain.entities.Valoracion;

public interface ValoracionRepository {
	List<Valoracion> Listar();
	Valoracion addValoracion(Valoracion valoracion);
	Valoracion updateValoracion(Valoracion valoracion);
    void deleteValoracion(Integer id);
}
