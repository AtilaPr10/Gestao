package com.algaworks.comercial.converters;

import java.io.Serializable;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import com.algaworks.comercial.model.LocalEstoque;
import com.algaworks.comercial.service.LocalEstoqueService;

@FacesConverter (forClass = LocalEstoque.class, value="LocalEstoqueConverter")
public class LocalEstoqueConverter implements Serializable, Converter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Inject
	public LocalEstoqueService ls;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		
		
		  LocalEstoque retorno = null;
			
		  if(value == null || value.isEmpty()){
	            return null;
	
		  }else{
	            Long id = Long.parseLong(value);
	            retorno = ls.retornaLocEstoque(id) ;
	            System.out.println(id);
	            System.out.println(retorno);
	            System.out.println(retorno.getDescricao());
	            return retorno;
	        }

		  
		
		
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		
		 LocalEstoque  l = (LocalEstoque)value;
	        if(l != null){
	            return String.valueOf(l.getId());
	        }else{
	            return null;
	      
	        
	        }

	}
		
	


}
