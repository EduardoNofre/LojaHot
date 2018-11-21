package com.br.loja.view;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.br.loja.dao.UsuarioDao;
import com.br.loja.entity.Usuario;

@Controller
@ManagedBean
@ViewScoped
public class UsuarioView {

	@Autowired
	private UsuarioDao usuarioDao;

	public Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void login() {

		usuarioDao.logar(usuario);
	}
}