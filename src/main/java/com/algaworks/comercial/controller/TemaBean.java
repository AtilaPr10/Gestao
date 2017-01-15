package com.algaworks.comercial.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class TemaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String tema = "bootstrap";
	
	
	
	private List<String> temas;
	
	
	public List<String> getTemas() {
	           if(temas == null){
	          temas = new ArrayList<String>();
	          temas.add("casablanca");
	          temas.add("cupertino");
	          temas.add("dark-hive");
	          temas.add("bluesky");
	          temas.add("blitzer");
	          temas.add("bootstrap");
	      }
	     return temas;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public void setTemas(List<String> temas) {
		this.temas = temas;
	}


	@Override
	public String toString() {
		return tema;
	}
	
	

}
