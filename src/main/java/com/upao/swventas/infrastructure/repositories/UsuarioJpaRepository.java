package com.upao.swventas.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upao.swventas.domain.entities.Usuario;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, Integer> {
	List<Usuario> findByNombre(String nombre);

}
