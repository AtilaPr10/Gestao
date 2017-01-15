package com.algaworks.comercial.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class ProdutoEan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@Column
	@NotNull
	private Integer fator;

	@Column
	@NotNull
	private String tipo;
	
	@Column
	@NotNull
	private String codigo_ean;
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "produto_id")
	private Produto produto;
	
	
	
	
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getCodigo_ean() {
		return codigo_ean;
	}

	public void setCodigo_ean(String codigo_ean) {
		this.codigo_ean = codigo_ean;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getFator() {
		return fator;
	}

	public void setFator(Integer fator) {
		this.fator = fator;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo_ean == null) ? 0 : codigo_ean.hashCode());
		result = prime * result + ((fator == null) ? 0 : fator.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ProdutoEan))
			return false;
		ProdutoEan other = (ProdutoEan) obj;
		if (codigo_ean == null) {
			if (other.codigo_ean != null)
				return false;
		} else if (!codigo_ean.equals(other.codigo_ean))
			return false;
		if (fator == null) {
			if (other.fator != null)
				return false;
		} else if (!fator.equals(other.fator))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return id +fator + tipo + codigo_ean
				+  produto ;
	}

    
	
	
	
	
	
	
	

}
