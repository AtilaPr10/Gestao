package com.algaworks.comercial.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import com.algaworks.comercial.model.Email;

public class EmailRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	
	public void guardar(Email email) {
		 manager.persist(email);
	}
	
	
	
	

}
