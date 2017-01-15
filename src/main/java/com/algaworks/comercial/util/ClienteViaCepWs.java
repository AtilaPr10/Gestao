package com.algaworks.comercial.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;

import com.algaworks.comercial.model.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClienteViaCepWs implements Serializable {
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public String buscarCep(String cep) {
	        String json;

	        try {
	            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
	            URLConnection urlConnection = url.openConnection();
	            InputStream is = urlConnection.getInputStream();
	            BufferedReader br = new BufferedReader(new InputStreamReader(is));

	            StringBuilder jsonSb = new StringBuilder();

	            br.lines().forEach(l -> jsonSb.append(l.trim()));

	            json = jsonSb.toString();

	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }

	        return json;
	    }

	
	
	public Endereco retornaEndereco(String json){
		
		GsonBuilder builder = new GsonBuilder();
		Gson g = builder.create();
		Endereco endereco = g.fromJson(json,Endereco.class);
		
		return endereco;
		
		
	}
	
	
	
	
}
