package com.upao.swventas.infrastructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upao.swventas.domain.entities.Usuario;
import com.upao.swventas.domain.repositories.UsuarioRepository;

@Component
public class UsuarioRepositoryImpl implements UsuarioRepository{
	@Autowired
    UsuarioJpaRepository db;

    @Override
    public List<Usuario> Listar() {
        return db.findAll();
    }

	@Override
	public Usuario addUsuario(Usuario usuario) {
		return db.save(usuario);
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		return db.save(usuario);
	}

	@Override
	public void deleteUsuario(Integer id) {
		db.deleteById(id);
	}
    
    

}
