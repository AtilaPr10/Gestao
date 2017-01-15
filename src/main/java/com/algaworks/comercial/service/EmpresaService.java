package com.algaworks.comercial.service;

import java.io.Serializable;

import javax.inject.Inject;
import com.algaworks.comercial.exceptions.NegocioException;
import com.algaworks.comercial.model.Empresa;
import com.algaworks.comercial.repository.PessoaRepository;
import com.algaworks.comercial.util.Transacional;

public class EmpresaService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private PessoaRepository pessoa_repository;
	
	
	@Transacional
	public void salvar(Empresa empresa) throws NegocioException {
		
		      pessoa_repository.guardar(empresa);
		
	}
	
	

}
