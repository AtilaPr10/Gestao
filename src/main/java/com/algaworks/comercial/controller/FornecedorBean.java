package com.algaworks.comercial.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.context.RequestContext;

import com.algaworks.comercial.exceptions.NegocioException;
import com.algaworks.comercial.model.Fornecedor;
import com.algaworks.comercial.model.Municipio;
import com.algaworks.comercial.model.Pessoa;
import com.algaworks.comercial.service.FornecedorService;
import com.algaworks.comercial.service.MunicipiosService;
import com.algaworks.comercial.util.FacesUtils;

@Named(value="controllerFornecedor")
@ViewScoped
public class FornecedorBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private FornecedorService  fornecedor_service ;
	
	@Inject
	private FacesUtils facesutils;
	
	@Inject
	private MunicipiosService municipio_service;
	
	private String estado;
	
	private String cpf_cnpj;
	
	private List<Municipio> municipios = new ArrayList<Municipio>();
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	private Fornecedor fornecedor = new Fornecedor();
	
	
	
	public void novo(){
		
		this.fornecedor = new Fornecedor();
		reset();
		facesutils.setMask("99.999.999/9999-99");
		
	}
	
	
	public void salvar() {
		
		Municipio municipio = municipios.get(0);
		fornecedor.setCodigo_ibge(municipio.getId());
		fornecedor.setEstado(municipio_service.retornaUf(estado));
		try {
			
			fornecedor_service.salvar(fornecedor);
			facesutils.exibeSucesso("Fornecedor salvo com sucesso!");
			
		} catch (NegocioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			facesutils.exibeErro("Fornecedor ja Cadastrado");
		}
		
	}


	
	
	public void listarFornecedor(){
		
	
			
			pessoas = fornecedor_service.listaFornecedorporDocumento(cpf_cnpj);
			if(pessoas.isEmpty()){
				facesutils.exibeErro("Fornecedor não cadastrado!!");
			}
			
		
	}
	
	
	
	public void buscaMunicipios(AjaxBehaviorEvent event){
		
		municipios = municipio_service.buscarMunicipiosporUF(estado);
		

	}
	
	public String direcionaConsultaFornecedor(){
		
		return "/dialogos/selecao_fornecedor";
		
	}
	
	
	public void reset() {
        RequestContext.getCurrentInstance().reset("frm_fornecedor");
    }
	

	public Fornecedor getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}


	public List<Pessoa> getPessoas() {
		return pessoas;
	}


	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}


	public String getCpf_cnpj() {
		return cpf_cnpj;
	}


	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
	
	
	
	

}
