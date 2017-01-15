package com.algaworks.comercial.repository;

import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import com.algaworks.comercial.model.Conta;

public class ContaRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Inject
	private EntityManager manager;
	
	
	
	public Conta guardar(Conta conta) {
		return manager.merge(conta);
	}
	
	

}
