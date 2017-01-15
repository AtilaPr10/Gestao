package com.algaworks.comercial.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class Estoque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Produto produto;
	
	private GregorianCalendar data_entrada;
	
	private GregorianCalendar data_saida;
	
	private BigDecimal quantidade;
	
	
	
	

}
