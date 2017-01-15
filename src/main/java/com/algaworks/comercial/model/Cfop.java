package com.algaworks.comercial.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

public class Cfop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @Id
	private Integer id;
	
    @Column
	private String descricao;

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
	
	
    
    
    

}
