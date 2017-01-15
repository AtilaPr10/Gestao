package com.algaworks.comercial.service;

import java.io.Serializable;

import javax.inject.Inject;
import com.algaworks.comercial.model.Produto;
import com.algaworks.comercial.repository.ProdutoRepository;
import com.algaworks.comercial.util.Transacional;

public class ProdutoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	@Inject
	private ProdutoRepository produto_repository;
	
	
	@Transacional
	public void salvar(Produto produto) {
		produto_repository.guardar(produto);
		
	}
	

}
