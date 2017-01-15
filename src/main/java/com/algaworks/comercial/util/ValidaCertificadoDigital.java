package com.algaworks.comercial.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;


public class ValidaCertificadoDigital implements Serializable {

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	
	Date data_expiracao;
	 
	public StringBuilder validaCertificado(String caminho,String senha) throws KeyStoreException, NoSuchAlgorithmException, CertificateException{
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
	
		
		 try {
			InputStream entrada = new FileInputStream(caminho);
			KeyStore ks = KeyStore.getInstance("pkcs12"); 
			
			
			try {
				ks.load(entrada, senha.toCharArray());
			} catch (Exception e) {
				e.getMessage();
			}
			 String alias = null;  
	         Enumeration <String> al = ks.aliases(); 
	         
	         alias = al.nextElement();  
	         
	        X509Certificate cert = (X509Certificate) ks.getCertificate(alias); 
	         sb.append("Emitido para :");
	         sb.append(alias);
	         sb.append(" ");
	         sb.append(dateFormat.format(cert.getNotBefore())); 
	         sb.append(" Até ");
	         sb.append(dateFormat.format(cert.getNotAfter())); 
	         data_expiracao = cert.getNotAfter();
			
			 
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb;
		
	}
	
	
	public Date retornaDataExpiracao(){
		
		
		return data_expiracao;
		
		
	}
	

}
