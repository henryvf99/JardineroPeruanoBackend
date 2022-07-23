package com.upao.swventas.domain.repositories;

import java.util.List;

import com.upao.swventas.domain.entities.Usuario;

public interface UsuarioRepository {
	List<Usuario> Listar();
	Usuario addUsuario(Usuario usuario);
	Usuario updateUsuario(Usuario usuario);
    void deleteUsuario(Integer id);
}
