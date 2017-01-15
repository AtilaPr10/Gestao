package com.algaworks.comercial.util;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class FacesUtils implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mask; 
	
	
	@PostConstruct
	public void Init(){
		
	    mask = "99.999.999/9999-99";
	}
	
	
	
	//Exiber msg de Sucesso
	 public void exibeErro(String mensagem) {
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                          mensagem, mensagem);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                facesContext.addMessage(null, facesMessage);
       }
	 
	 
		//Exiber msg de Erro	 
	 public void exibeSucesso(String mensagem) {
         FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, 
                                   mensagem, mensagem);
         FacesContext facesContext = FacesContext.getCurrentInstance();
         facesContext.addMessage(null, facesMessage);
       }
	 
	 
	//Muda as mascara do cpf_cnpj
		public void mudaMascara(){
			
			if(mask.equals("99.999.999/9999-99")){
				
				mask = "999.999.999-99";
			}
			else
			if(mask.equals("999.999.999-99")){
				mask = "99.999.999/9999-99";
			}
		
		}
		
		

		public String getMask() {
			return mask;
		}

		public void setMask(String mask) {
			this.mask = mask;
		}
		
	 
	 
	
}
