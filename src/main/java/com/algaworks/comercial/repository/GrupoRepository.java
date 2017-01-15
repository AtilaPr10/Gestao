package com.algaworks.comercial.repository;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.algaworks.comercial.model.Grupo;

public class GrupoRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Inject
	private EntityManager manager;
	
	
	//salva um grupo
	public Grupo guardar(Grupo grupo) {
		return manager.merge(grupo);
	}
	
	//retorna todos os grupos
	public List<Grupo> retornaGrupos(){
		
		TypedQuery<Grupo> query =
	    manager.createNamedQuery("Grupo.listarTodos", Grupo.class);
		return query.getResultList();
		
	}

	//retorna grupo por id
	public Grupo retornaGrupo(Long id){
		
		TypedQuery<Grupo> query =
	    manager.createNamedQuery("Grupo.findbyId", Grupo.class);
		query.setParameter("id", id);
		return query.getSingleResult();
		
	}
	
	//retorna os grupos dentro da secao
	public List<Grupo> retornaGrupoSecao(Long id_secao){
		List<Grupo> grupos;
		String jpql =
				"select g from Grupo g where g.secao.id  = :id_secao";
				Query query = manager.createQuery(jpql, Grupo.class);
				query.setParameter("id_secao", id_secao);
				grupos = query.getResultList();
		        return grupos;
	}
	
	

}
