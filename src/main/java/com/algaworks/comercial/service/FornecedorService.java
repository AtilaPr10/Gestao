package com.algaworks.comercial.service;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import com.algaworks.comercial.exceptions.NegocioException;
import com.algaworks.comercial.model.Fornecedor;
import com.algaworks.comercial.model.Pessoa;
import com.algaworks.comercial.repository.PessoaRepository;
import com.algaworks.comercial.util.Transacional;

public class FornecedorService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	
	@Inject
	private PessoaRepository pessoa_repository;
	
	
	@Transacional
	public void salvar(Fornecedor fornecedor) throws NegocioException {
		
		      pessoa_repository.guardar(fornecedor);
		
	}
	
	
	@Transacional
	public List<Pessoa> listaFornecedorporDocumento(String cpf_cnpj){
		
		return pessoa_repository.listaPessoas(cpf_cnpj);
		
	}

}
