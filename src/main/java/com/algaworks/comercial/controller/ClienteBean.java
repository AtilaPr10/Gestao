package com.algaworks.comercial.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.context.RequestContext;
import com.algaworks.comercial.model.Cliente;
import com.algaworks.comercial.service.ClienteService;
import com.algaworks.comercial.util.FacesUtils;


@Named(value="controllerCliente")
@ViewScoped
public class ClienteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ClienteService cliente_service ;
	
	@Inject
	private FacesUtils facesutils;
	
	private List<Cliente> clientes; 
	
	private String mask;
	
	private Cliente cliente = new Cliente();
	
	
	
	public void salvar() {
		
		cliente_service.salvar(cliente);
		facesutils.exibeSucesso("Cliente salvo com sucesso!");
		
	}
	
	
	@PostConstruct
	public void Init(){
		
	    mask = "99.999.999/9999-99";
	}
	
	public void novo(){
	    
		cliente = new Cliente();
		reset();
		
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
	
	
	
	public void reset() {
        RequestContext.getCurrentInstance().reset("frm_cliente");
    }
	
	
	

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public String getMask() {
		return mask;
	}


	public void setMask(String mask) {
		this.mask = mask;
	}


}
