package com.algaworks.comercial.service;

import java.io.Serializable;
import javax.inject.Inject;
import com.algaworks.comercial.model.Conta;
import com.algaworks.comercial.repository.ContaRepository;
import com.algaworks.comercial.util.Transacional;

public class ContaService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private ContaRepository contas_repository;
	
	
	@Transacional
	public void salvar(Conta conta) {
		contas_repository.guardar(conta);
		
	}
	

}
