package com.algaworks.comercial.model;

public enum Sexo {
	
	  FEMININO("FEMINIO"),
	  MASCULINO("MASCULINO"),
	  OUTRO("OUTRO");  
	
	
	private String descricao;

	Sexo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
}
