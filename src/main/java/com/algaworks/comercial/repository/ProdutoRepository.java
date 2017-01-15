package com.algaworks.comercial.repository;

import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import com.algaworks.comercial.model.Produto;

public class ProdutoRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	

	@Inject
	private EntityManager manager;
	
	
	
	public Produto guardar(Produto produto) {
		return manager.merge(produto);
	}
	
	
	
	
	

}
