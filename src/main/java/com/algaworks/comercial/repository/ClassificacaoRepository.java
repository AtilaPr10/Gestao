package com.algaworks.comercial.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.algaworks.comercial.model.Classificacao;
import com.algaworks.comercial.model.Cliente;

@SuppressWarnings("unused")
public class ClassificacaoRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	@Inject
	private EntityManager manager;
	
	
	
	public Classificacao guardar(Classificacao classificacao) {
		return manager.merge(classificacao);
	}
	
	
	public List<Classificacao> retornaSecoes(){
		
		TypedQuery<Classificacao> query =
	    manager.createNamedQuery("Classificacao.listarTodos", Classificacao.class);
		
		return query.getResultList();
		
	}

	
	public Classificacao retornaSecao(Long id){
		
		TypedQuery<Classificacao> query =
	    manager.createNamedQuery("Classificacao.findbyId", Classificacao.class);
		query.setParameter("id", id);
		return query.getSingleResult();
		
	}
	
	
}
