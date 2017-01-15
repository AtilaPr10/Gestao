package com.algaworks.comercial.controller;

import java.io.Serializable;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import com.algaworks.comercial.model.Cliente;

@Named
@ViewScoped
public class ControllerUtils implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Cliente cliente;
	private String mask_cnpj_cpf_;
	
	public void setaTipo(AjaxBehaviorEvent abe){
		
		cliente.setTipo_pessoa("FISICA");
		
	}
	
	public String retornaMascara(){
		
		if(cliente.getTipo_pessoa().equals("FISICA")){
			
			mask_cnpj_cpf_="99.99.99";
		}
	     return mask_cnpj_cpf_;	
		
	}
	
	

	public String getMask_cnpj_cpf_() {
		return mask_cnpj_cpf_;
	}

	public void setMask_cnpj_cpf_(String mask_cnpj_cpf_) {
		this.mask_cnpj_cpf_ = mask_cnpj_cpf_;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	

	
	
 
	
	
	

}
