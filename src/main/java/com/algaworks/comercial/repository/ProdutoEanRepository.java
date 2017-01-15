package com.algaworks.comercial.repository;

import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import com.algaworks.comercial.model.ProdutoEan;

public class ProdutoEanRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	 EntityManager em;
	
	
	public void salvar(ProdutoEan prod_ean){
		
		em.persist(prod_ean);
		
	}
	

}
