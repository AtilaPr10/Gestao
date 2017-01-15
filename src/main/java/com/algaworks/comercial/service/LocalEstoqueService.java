package com.algaworks.comercial.service;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import com.algaworks.comercial.model.LocalEstoque;
import com.algaworks.comercial.repository.LocalEstoqueRepository;
import com.algaworks.comercial.util.Transacional;

public class LocalEstoqueService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	public LocalEstoqueRepository ler;
	
	
	@Transacional
	 public void salvar(LocalEstoque local) throws PersistenceException {
		   
		ler.guardar(local);
		   
	}  
	
   
	@Transacional
	public List<LocalEstoque> retornaLocaisEstoque(){
		
		  return ler.retornaLocEstoques();
		
	}

    @Transacional
	public LocalEstoque retornaLocEstoque(Long id) {
		
    	return ler.retornaEstoque(id);
		
	}
	
	
}
