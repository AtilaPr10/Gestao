package com.algaworks.comercial.service;

import java.io.Serializable;
import javax.inject.Inject;
import com.algaworks.comercial.model.Email;
import com.algaworks.comercial.repository.EmailRepository;
import com.algaworks.comercial.util.Transacional;

public class EmailService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EmailRepository email_repository;
	
	
	@Transacional
	public void salvar(Email email){
		
		  email_repository.guardar(email);
		
	}
	
	

}
