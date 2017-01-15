package com.algaworks.comercial.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.PersistenceException;
import com.algaworks.comercial.model.LocalEstoque;
import com.algaworks.comercial.service.LocalEstoqueService;
import com.algaworks.comercial.util.FacesUtils;


@Named
@ViewScoped
public class LocalEstoqueBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	LocalEstoqueService les;
	
	@Inject
	FacesUtils fc;
	
	
	LocalEstoque locale = new LocalEstoque();
	
	
	 public void novo(){
	      locale  = new LocalEstoque();
    }

	
	
	public void salvar(){
		
		try {
			
			les.salvar(locale);
			fc.exibeSucesso("Local salvo com sucesso!");
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			fc.exibeErro("Erro "+e.getMessage());
			e.printStackTrace();
		}
		
	}



	public LocalEstoque getLocale() {
		return locale;
	}



	public void setLocale(LocalEstoque locale) {
		this.locale = locale;
	}


	
	
	
	

}
