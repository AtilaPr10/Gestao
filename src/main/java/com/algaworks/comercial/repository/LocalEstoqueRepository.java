package com.algaworks.comercial.repository;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.algaworks.comercial.model.LocalEstoque;

public class LocalEstoqueRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Inject
	private EntityManager manager;
	
	
	//salva um grupo
	public LocalEstoque guardar(LocalEstoque local) {
		return manager.merge(local);
	}
	
	
	//lista locais de estoques
    public List<LocalEstoque> retornaLocEstoques(){
		
		TypedQuery<LocalEstoque> query =
	    manager.createNamedQuery("LocalEstoque.listarTodos", LocalEstoque.class);
	    return query.getResultList();
		
	}

	
    public LocalEstoque retornaEstoque(Long id){
    	
    	TypedQuery<LocalEstoque> query =
    		    manager.createNamedQuery("LocalEstoque.findbyId", LocalEstoque.class);
    			query.setParameter("id",id);
    			return query.getSingleResult();
    	
    	
    }
    

}
