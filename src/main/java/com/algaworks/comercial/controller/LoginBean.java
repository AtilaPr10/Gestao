package com.algaworks.comercial.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.comercial.model.Usuario;


@Named
@RequestScoped
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	Usuario usuario;
	
	private String nome;
	private String senha;
	
	
	public String login() {
		FacesContext context = FacesContext.getCurrentInstance();
		       if ("admin".equals(this.nome)
		                    && "123".equals(this.senha)) {
		         this.usuario.setNome(this.nome);
		         return "principais/pessoas.xhtml?faces-redirect=true";
		   } else {
			FacesMessage mensagem = new FacesMessage(
			"Usuário/senha inválidos!");
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
			}
			return null;
	
	}

	//Logoff da aplicacao
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext()
		.invalidateSession();
		return "/index?faces-redirect=true";
		}
	
	

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
		
	
	
	
	
	
}
