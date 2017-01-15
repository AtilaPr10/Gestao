package com.algaworks.comercial.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.comercial.model.ProdutoEan;
import com.algaworks.comercial.repository.ProdutoEanRepository;
import com.algaworks.comercial.util.Transacional;

public class ProdutoEanService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProdutoEanRepository pr;
	
	
	@Transacional
	public void salvar(ProdutoEan prod_ean){
		
		pr.salvar(prod_ean);
		
	}

}
