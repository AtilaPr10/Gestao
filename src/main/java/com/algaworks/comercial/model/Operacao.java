package com.algaworks.comercial.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	
	private String descricao;
	
	//private List<Cfop> cfop;
	
	private Boolean atualiza_estoque;
	
	private Boolean atualiza_custo;
	
	private String tipo_operacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/*
	public List<Cfop> getCfop() {
		return cfop;
	}

	public void setCfop(List<Cfop> cfop) {
		this.cfop = cfop;
	}

   */
	public Boolean getAtualiza_estoque() {
		return atualiza_estoque;
	}

	public void setAtualiza_estoque(Boolean atualiza_estoque) {
		this.atualiza_estoque = atualiza_estoque;
	}

	public Boolean getAtualiza_custo() {
		return atualiza_custo;
	}

	public void setAtualiza_custo(Boolean atualiza_custo) {
		this.atualiza_custo = atualiza_custo;
	}

	public String getTipo_operacao() {
		return tipo_operacao;
	}

	public void setTipo_operacao(String tipo_operacao) {
		this.tipo_operacao = tipo_operacao;
	}
	
	
	
	
	

}
