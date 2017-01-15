package com.algaworks.comercial.controller;

import java.io.Serializable;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.algaworks.comercial.model.Certificado;
import com.algaworks.comercial.service.CertificadoService;
import com.algaworks.comercial.util.FacesUtils;
import com.algaworks.comercial.util.ValidaCertificadoDigital;


@Named
@ViewScoped
public class CertificadoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CertificadoService cs;
 	 
	@Inject
    private FacesUtils fc;
	
	private String caminho;
	
	private String senha;
	
	private Certificado certificado = new Certificado();
	
	private StringBuilder resultado = new StringBuilder();
	
/*	
	@PostConstruct
	public void init(){
		resultado = new StringBuilder();
		ValidaCertificadoDigital vcd = new ValidaCertificadoDigital();
		try {
			resultado = vcd.validaCertificado(certificado.getCaminho(), certificado.getSenha());
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CertificateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	*/
		
	
	
    
	
	public void salvar(){
		  certificado.setCaminho(caminho);
    	  certificado.setSenha(senha);
          cs.inserirCertificado(certificado);
          fc.exibeSucesso("Certificado salvo com sucesso");
    	
    }
	
	
	public void validar(){
		
		
		ValidaCertificadoDigital vcd = new ValidaCertificadoDigital();
		
		try {
			System.out.println(caminho+senha);
			resultado = vcd.validaCertificado(caminho,senha);
			certificado.setData_expiracao(vcd.retornaDataExpiracao());
		} catch (KeyStoreException e) {
			fc.exibeErro("Senha Inválida");
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			fc.exibeErro("Caminho não encontrado");
			e.printStackTrace();
		} catch (CertificateException e) {
			fc.exibeErro("Data Invalida");
			e.printStackTrace();
		}
		
		
	}


	public Certificado getCertificado() {
		return certificado;
	}



	public void setCertificado(Certificado certificado) {
		this.certificado = certificado;
	}


	public StringBuilder getResultado() {
		return resultado;
	}


	public void setResultado(StringBuilder resultado) {
		this.resultado = resultado;
	}


	public String getCaminho() {
		return caminho;
	}


	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
    
	
    
    
	
}
