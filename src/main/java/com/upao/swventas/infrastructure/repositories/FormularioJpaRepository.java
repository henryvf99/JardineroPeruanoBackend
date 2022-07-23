package com.upao.swventas.infrastructure.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.upao.swventas.domain.entities.Formulario;

@Repository
public interface FormularioJpaRepository extends JpaRepository<Formulario, Integer>{
	
	List<Formulario> findByNombre(String nombre);

}
