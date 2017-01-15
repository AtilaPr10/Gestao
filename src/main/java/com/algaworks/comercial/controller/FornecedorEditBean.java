package com.algaworks.comercial.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.comercial.exceptions.NegocioException;
import com.algaworks.comercial.model.Fornecedor;
import com.algaworks.comercial.model.Municipio;
import com.algaworks.comercial.service.FornecedorService;
import com.algaworks.comercial.service.MunicipiosService;
import com.algaworks.comercial.util.FacesUtils;

@Named(value="controllerEditFornecedor")
@SessionScoped
public class FornecedorEditBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private Fornecedor fornecedor;
	
	@Inject
	private FornecedorService fs;
	
	@Inject
	private FacesUtils fu;
	
	@Inject
	private MunicipiosService municipio_service;
	
	private String estado;
	
	private List<Municipio> municipios = new ArrayList<Municipio>();
	
	@PostConstruct
	public void init(){
		
		fornecedor = new Fornecedor();
		fornecedor.setEstado("CE");
		
		
	}

	
	public void editar(ActionEvent ae){
		
		UIParameter component = (UIParameter) ae.getComponent().findComponent("objeto");
		this.fornecedor = (Fornecedor) component.getValue(); 
		System.out.println(fornecedor.getEstado());
	    System.out.println(estado);
	    System.out.println(fornecedor.getNome());
		
		
		
	}
	
	
	public void atualizarFornecedor(){
		
		try {
			fs.salvar(fornecedor);
		} catch (NegocioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fu.exibeSucesso("Forncedor atualizado com sucesso!");
		
	}

     public void buscaMunicipios(AjaxBehaviorEvent event){
		
		  this.setMunicipios(municipio_service.buscarMunicipiosporUF(estado));
		

	  }
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public List<Municipio> getMunicipios() {
		return municipios;
	}


	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	

	
	
	
	
	
	

}
