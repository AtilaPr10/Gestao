package com.algaworks.comercial.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.comercial.model.Certificado;
import com.algaworks.comercial.repository.CertificadoRepository;
import com.algaworks.comercial.util.Transacional;

public class CertificadoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CertificadoRepository cp;
	
	
	@Transacional
	public void inserirCertificado(Certificado certificado){
		
		cp.guardar(certificado);
		
		
	}
	

}
