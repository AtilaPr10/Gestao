package com.algaworks.comercial.repository;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.algaworks.comercial.model.Pessoa;

public class PessoaRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private EntityManager manager;
	
	
	public Pessoa guardar(Pessoa pessoa) {
		return manager.merge(pessoa);
	
	}
	
	
	public List<Pessoa> listaPessoas(String cpf_cnpj){
		
		TypedQuery<Pessoa> query =
			    manager.createNamedQuery("Pessoa.buscaPorDocumento", Pessoa.class);
				query.setParameter("cpf_cnpj", cpf_cnpj);
				return query.getResultList();
		
	}
	
	
    public boolean validaPessoa(String cpf_cnpj){
    	
    	Pessoa pessoa = null;
    	TypedQuery<Pessoa> query =
			    manager.createNamedQuery("Pessoa.buscaPorDocumento", Pessoa.class);
				query.setParameter("cpf_cnpj", cpf_cnpj);
			    pessoa = query.getSingleResult();
				
		  if(pessoa != null){
			  return true;
		  }
    	
		      return false;
    }
	
	

}
