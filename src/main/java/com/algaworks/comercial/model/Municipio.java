package com.algaworks.comercial.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@NamedQuery(name="Municipio.buscaPorUF", 
query="select m from Municipio m where m.iduf = :iduf")

@Entity
public class Municipio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@Column
	private String iduf;
	
	@Column
	private String nome;



	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getiduf() {
		return iduf;
	}


	public void setiduf(String iduf) {
		this.iduf = iduf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((iduf == null) ? 0 : iduf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Municipio))
			return false;
		Municipio other = (Municipio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (iduf == null) {
			if (other.iduf != null)
				return false;
		} else if (!iduf.equals(other.iduf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return nome;
	}

  


	


   
	
	
	
	
	

}
