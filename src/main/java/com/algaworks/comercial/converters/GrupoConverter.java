package com.algaworks.comercial.converters;

import java.io.Serializable;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import com.algaworks.comercial.model.Grupo;
import com.algaworks.comercial.service.GrupoService;


@FacesConverter (forClass = Grupo.class, value="GrupoConverter")
public class GrupoConverter implements Serializable, Converter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	public GrupoService gs;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		
		
		 Grupo retorno = null;
			
		  if(value == null || value.isEmpty()){
	            return null;
	
		  }else{
	            Long id = Long.parseLong(value);
	            retorno = gs.retornaSecao(id) ;
	            System.out.println(retorno.getNome());
	            return retorno;
	        }

		  
		
		
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		
		 Grupo  g = (Grupo)value;
	        if(g != null){
	            return String.valueOf(g.getId());
	        }else{
	            return null;
	      
	        
	        }

	}
		
	

}
