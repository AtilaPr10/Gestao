package com.algaworks.comercial.service;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import com.algaworks.comercial.model.Grupo;
import com.algaworks.comercial.repository.GrupoRepository;
import com.algaworks.comercial.util.Transacional;

public class GrupoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private GrupoRepository gr;
	
	private List<Grupo> lista_secoes;
	
	
	@Transacional
	 public void salvar(Grupo grupo) throws PersistenceException {
		   
		gr.guardar(grupo);
		   
	}  
	
	
	
	@Transacional
	public List<Grupo> retornaLista(){
		
		lista_secoes = gr.retornaGrupos();
		return lista_secoes;
		
	}
	
	
	@Transacional
	public Grupo retornaSecao(Long id){
		
		return  gr.retornaGrupo(id);
		
	}
	
	@Transacional
	public List<Grupo> retornaGrupoporSecao(Long id_secao){
		
		return  gr.retornaGrupoSecao(id_secao);
		
	}

}
