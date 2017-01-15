package com.algaworks.comercial.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.algaworks.comercial.model.Email;
import com.algaworks.comercial.service.EmailService;
import com.algaworks.comercial.util.FacesUtils;

@Named(value="controllerEmail")
@ViewScoped
public class EmailBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EmailService email_service;
	
	@Inject
	private FacesUtils facesutils;
	
	private Email email = new Email();
	

	
     public void salvar(){
		 System.out.println(email);
	   	 email_service.salvar(email);
		 facesutils.exibeSucesso("Configuraçoes de email salvo com sucesso!");
	
		 
	}



	public Email getEmail() {
		return email;
	}



	public void setEmail(Email email) {
		this.email = email;
	}
	
	
	

}
