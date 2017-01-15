package com.algaworks.comercial.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;


@Entity
@NamedQueries({
@NamedQuery(name = "LocalEstoque.listarTodos" , 
query="select l from LocalEstoque l "),
@NamedQuery(name="LocalEstoque.findbyId",query="SELECT l from LocalEstoque l where l.id = :id")
})
public class LocalEstoque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id ;
	
    @Column
    @NotNull
	private String descricao;
	
    
	@Column
	private Boolean ativo;
	
	@Column
	private Boolean permite_venda_direta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Boolean getPermite_venda_direta() {
		return permite_venda_direta;
	}

	public void setPermite_venda_direta(Boolean permite_venda_direta) {
		this.permite_venda_direta = permite_venda_direta;
	}

	@Override
	public String toString() {
		return  descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((permite_venda_direta == null) ? 0 : permite_venda_direta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof LocalEstoque))
			return false;
		LocalEstoque other = (LocalEstoque) obj;
		if (ativo == null) {
			if (other.ativo != null)
				return false;
		} else if (!ativo.equals(other.ativo))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (permite_venda_direta == null) {
			if (other.permite_venda_direta != null)
				return false;
		} else if (!permite_venda_direta.equals(other.permite_venda_direta))
			return false;
		return true;
	}
	
	
	
	
	
	

}
