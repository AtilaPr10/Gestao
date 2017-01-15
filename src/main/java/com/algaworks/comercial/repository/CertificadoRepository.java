package com.algaworks.comercial.repository;

import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import com.algaworks.comercial.model.Certificado;

public class CertificadoRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	
	public void guardar(Certificado certificado){
		
	    	em.persist(certificado);
		
	}
	
	
}
