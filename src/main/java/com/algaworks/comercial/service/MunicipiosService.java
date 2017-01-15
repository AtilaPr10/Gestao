package com.algaworks.comercial.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import com.algaworks.comercial.model.Municipio;
import com.algaworks.comercial.model.Pessoa;

/*
 * Retorna os munipios do banco para 
 * a pagina web
 */

public class MunicipiosService implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private EntityManager em;

	
	private HashMap<String, String> municipio_uf; 
	
	
	
	//Retorna as cidades de acordo com o estado
	public List<Municipio> buscarMunicipiosporUF(String uf){
		
		populaMunicipios();
		return em.createNamedQuery("Municipio.buscaPorUF", Municipio.class)
	            .setParameter("iduf",uf)
	            .getResultList();
		
		
	}
	

	
	public void populaMunicipios(){
		
		municipio_uf = new HashMap<String,String>();
		
		municipio_uf.put("12","AC"); 
		municipio_uf.put("27","AL");
		municipio_uf.put("16","AP");
		municipio_uf.put("13","AM");
		municipio_uf.put("29","BA");
		municipio_uf.put("23","CE");
		municipio_uf.put("53","DF");
		municipio_uf.put("32","ES");
		municipio_uf.put("52","GO");
		municipio_uf.put("21","MA");
		municipio_uf.put("51","MT");
		municipio_uf.put("50","MS");
		municipio_uf.put("31","MG");
		municipio_uf.put("15","PA");
		municipio_uf.put("25","PB");
		municipio_uf.put("41","PR");
		municipio_uf.put("26","PE");
		municipio_uf.put("22","PI");
		municipio_uf.put("33","RJ");
		municipio_uf.put("24","RN"); 
		municipio_uf.put("43","RS");
		municipio_uf.put("11","RO");
		municipio_uf.put("14","RR");
	    municipio_uf.put("42","SC");
	    municipio_uf.put("35","SP");
	    municipio_uf.put("28","SE"); 
	    municipio_uf.put("17","TO"); 
			
		
	}
	
	
	public String retornaUf(String codigo){
		
	     return municipio_uf.get(codigo);
	
	}
	
}
