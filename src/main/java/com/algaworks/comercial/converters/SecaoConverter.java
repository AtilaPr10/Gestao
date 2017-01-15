package com.algaworks.comercial.converters;

import java.io.Serializable;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import com.algaworks.comercial.model.Classificacao;
import com.algaworks.comercial.service.ClassificacaoService;


@FacesConverter (forClass = Classificacao.class, value="SecaoConverter")
public class SecaoConverter implements Serializable, Converter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	public ClassificacaoService cs;
	
	

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		
		
		  Classificacao retorno = null;
		
		  if(value == null || value.isEmpty()){
	            return null;
	
		  }else{
	            Long id = Long.parseLong(value);
	            retorno = cs.retornaSecao(id) ;
	            System.out.println(retorno.getDescricao());
	            return retorno;
	        }

		  
	    
		
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		
	    
		 Classificacao c = (Classificacao)value;
	        if(c != null){
	            return String.valueOf(c.getId());
	        }else{
	            return null;
	      
	        
	        }

	}
}
		
		
		


