package com.algaworks.comercial.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue("F")
@NamedQueries({
@NamedQuery(name="Fornecedor.buscaPorNome", 
query="select f from Fornecedor f where f.nome like :nome"),
@NamedQuery(name="Fornecedor.buscaPorDocumento", 
query="select f from Fornecedor f where f.cpf_cnpj = :cpf_cnpj")
})
public class Fornecedor extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    
	
	
    
	
	

}
