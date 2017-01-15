package com.algaworks.comercial.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoFornecedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String unidade_embalagem;
	
	private Integer itens_embalagem;
	
	private String tipo_fornecedor;
	
	private Integer codigo_produto;
	
	private Integer codigo_fornecedor;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnidade_embalagem() {
		return unidade_embalagem;
	}

	public void setUnidade_embalagem(String unidade_embalagem) {
		this.unidade_embalagem = unidade_embalagem;
	}

	public Integer getItens_embalagem() {
		return itens_embalagem;
	}

	public void setItens_embalagem(Integer itens_embalagem) {
		this.itens_embalagem = itens_embalagem;
	}

	public String getTipo_fornecedor() {
		return tipo_fornecedor;
	}

	public void setTipo_fornecedor(String tipo_fornecedor) {
		this.tipo_fornecedor = tipo_fornecedor;
	}

	public Integer getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(Integer codigo_produto) {
		this.codigo_produto = codigo_produto;
	}

	public Integer getCodigo_fornecedor() {
		return codigo_fornecedor;
	}

	public void setCodigo_fornecedor(Integer codigo_fornecedor) {
		this.codigo_fornecedor = codigo_fornecedor;
	}
	
	
	
	
	
	

}
