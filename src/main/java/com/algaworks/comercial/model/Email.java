package com.algaworks.comercial.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Email implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String host;
	
	@Column
	private String port;
	
	@Column
	@org.hibernate.validator.constraints.Email
	private String conta_email;
	
	@Column
	private String senha_email;
	
	@Column
	private Boolean autorizacao;

	public String getHost() {
		return host;
	}
	
	

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Boolean getAutorizacao() {
		return autorizacao;
	}
	public void setAutorizacao(Boolean autorizacao) {
		this.autorizacao = true;	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConta_email() {
		return conta_email;
	}

	public void setConta_email(String conta_email) {
		this.conta_email = conta_email;
	}

	public String getSenha_email() {
		return senha_email;
	}

	public void setSenha_email(String senha_email) {
		this.senha_email = senha_email;
	}
	
	
	
	
	
	

}
