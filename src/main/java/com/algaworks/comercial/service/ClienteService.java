package com.algaworks.comercial.service;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import com.algaworks.comercial.model.Cliente;
import com.algaworks.comercial.repository.PessoaRepository;
import com.algaworks.comercial.util.Transacional;

public class ClienteService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	
	@Inject
	private PessoaRepository pessoa_repository;
	

	
	
	@Transacional
	public void salvar(Cliente cliente) {
	  pessoa_repository.guardar(cliente);
		
	}
	
	


}
