package com.upao.swventas.infrastructure.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.upao.swventas.domain.entities.Valoracion;

@Repository
public interface ValoracionJpaRepository extends JpaRepository<Valoracion, Integer>{
	
	List<Valoracion> findByNombre(String nombre);

}
