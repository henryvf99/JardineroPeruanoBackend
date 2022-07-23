package com.upao.swventas.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upao.swventas.domain.entities.Usuario;
import com.upao.swventas.infrastructure.repositories.UsuarioRepositoryImpl;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
    private UsuarioRepositoryImpl UsuarioRepository;

    @Override
    public List<Usuario> Listar() {
        return UsuarioRepository.Listar();
    }

	@Override
	public Usuario addUsuario(Usuario usuario) {
		return UsuarioRepository.addUsuario(usuario);
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		return UsuarioRepository.updateUsuario(usuario);
	}

	@Override
	public void deleteUsuario(Integer id) {
		UsuarioRepository.deleteUsuario(id);
	}
}
