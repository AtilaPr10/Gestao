package com.algaworks.comercial.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import com.algaworks.comercial.model.Classificacao;
import com.algaworks.comercial.repository.ClassificacaoRepository;
import com.algaworks.comercial.util.Transacional;

public class ClassificacaoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	

	
	@Inject
	private ClassificacaoRepository cr;
	
	private List<Classificacao> lista_secoes;
	
	
	@Transacional
	 public void salvar(Classificacao classificacao) throws PersistenceException {
		   
		cr.guardar(classificacao);
		   
	}  
	
	
	
	@Transacional
	public List<Classificacao> retornaLista(){
		
		lista_secoes = cr.retornaSecoes();
		return lista_secoes;
		
	}
	
	
	@Transacional
	public Classificacao retornaSecao(Long id){
		
		return  cr.retornaSecao(id);
		
	}
	
	
	
}
