package com.algaworks.comercial.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.algaworks.comercial.model.Classificacao;
import com.algaworks.comercial.model.Grupo;
import com.algaworks.comercial.model.LocalEstoque;
import com.algaworks.comercial.model.Produto;
import com.algaworks.comercial.model.ProdutoEan;
import com.algaworks.comercial.service.ClassificacaoService;
import com.algaworks.comercial.service.GrupoService;
import com.algaworks.comercial.service.LocalEstoqueService;
import com.algaworks.comercial.service.ProdutoService;
import com.algaworks.comercial.util.FacesUtils;

@Named(value="controllerProduto")
@ViewScoped
public class ProdutoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ProdutoService ps;
	
	@Inject
	private Produto produto;
	
  	@Inject
	private ClassificacaoService cs;
  	
  	@Inject
  	private LocalEstoqueService ls;
	
	@Inject
	private GrupoService gs;
		
	@Inject
	private ProdutoEan produto_ean;
	
	@Inject
	private FacesUtils fc;
	
	private Classificacao secao_selecionada;
	
	private List<Classificacao> lista_secoes = new ArrayList<Classificacao>();
	
	private List<Grupo> lista_grupo = new ArrayList<Grupo>();
	
	private List<LocalEstoque> lista_loc_estoque = new ArrayList<LocalEstoque>();
	
	private List<ProdutoEan> lista_ean = new ArrayList<ProdutoEan>();
	
	
	@PostConstruct
	public void Init(){
		
        lista_secoes = cs.retornaLista();
        lista_loc_estoque  = ls.retornaLocaisEstoque();
		
	    if(lista_secoes.isEmpty()){
	    	
	    	fc.exibeErro("Não ha seçoes cadastradas!!");
	    	
	    }
		
	    
	}
	
	
	public void novoEan(){
		
		this.produto_ean = new ProdutoEan();
	}
	
	//Adiciona o codigo ean ao produto
	public void adicionaEan(){
		lista_ean.add(produto_ean);
		produto.setCodigos_ean(lista_ean);
		
	}
	
	
	public void salvar(){
		
		try {
			
			ps.salvar(produto);
			fc.exibeSucesso("Produto salvo com sucesso!!");
			
		} catch (Exception e) {
			
		    fc.exibeErro("Erro ao salvar Produto "+e.getMessage());
		
		}
		
	}

    public void adcionaEan(ProdutoEan pe){
    	
    	lista_ean.add(pe);
    	
    }

	public void novo(){
		
		produto = new Produto();
	}
	
	//retorna grupos baseado na secao
	public void retornaGrupos(AjaxBehaviorEvent event){
		
		this.lista_grupo =
	      gs.retornaGrupoporSecao(produto.getSecao().getId());
		  System.out.println(lista_grupo.size());
		  System.out.println(produto.getSecao().getId());
		
	}
	
	
	public List<Classificacao> getLista_secoes() {
		return lista_secoes;
	}


	public void setLista_secoes(List<Classificacao> lista_secoes) {
		this.lista_secoes = lista_secoes;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public List<Grupo> getLista_grupo() {
		return lista_grupo;
	}


	public void setLista_grupo(List<Grupo> lista_grupo) {
		this.lista_grupo = lista_grupo;
	}


	public Classificacao getSecao_seleconada() {
		return secao_selecionada;
	}


	public void setSecao_seleconada(Classificacao secao_seleconada) {
		this.secao_selecionada = secao_seleconada;
	}


	public List<LocalEstoque> getLista_loc_estoque() {
		return lista_loc_estoque;
	}


	public void setLista_loc_estoque(List<LocalEstoque> lista_loc_estoque) {
		this.lista_loc_estoque = lista_loc_estoque;
	}


	public List<ProdutoEan> getLista_ean() {
		return lista_ean;
	}


	public void setLista_ean(List<ProdutoEan> lista_ean) {
		this.lista_ean = lista_ean;
	}


	public ProdutoEan getProduto_ean() {
		return produto_ean;
	}


	public void setProduto_ean(ProdutoEan produto_ean) {
		this.produto_ean = produto_ean;
	}
  
	
	
	
 }
