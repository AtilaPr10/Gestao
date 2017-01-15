/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;

/**
 *
 * @author atila
 */


@Entity
@DiscriminatorValue("C")
@NamedQuery(name="Cliente.buscaPorNome", 
query="select c from Cliente c where c.nome like :nome")
public class Cliente extends Pessoa implements Serializable  {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


      @Enumerated(EnumType.STRING)
       private Sexo sexo;
    
      @Column 
      private BigDecimal limiteCredito;
     
      @Column
      private boolean bloqueado;
      
      
      

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public BigDecimal getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
    
  
    
      
      
    
}
