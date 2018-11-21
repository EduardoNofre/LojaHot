package com.br.loja.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.loja.dao.UsuarioDao;
import com.br.loja.entity.Usuario;
import com.br.loja.repository.UsuarioRepository;

@Component
public class UsuarioDaoImpl implements UsuarioDao{

	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario logar(Usuario usuario) {	
				
		Usuario usu = usuarioRepository.loginUsuario(usuario.getEmail());
		
		return usu;
	}

}
