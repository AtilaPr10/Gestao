package com.algaworks.comercial.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.PersistenceException;
import org.primefaces.context.RequestContext;
import com.algaworks.comercial.model.Classificacao;
import com.algaworks.comercial.model.Grupo;
import com.algaworks.comercial.service.ClassificacaoService;
import com.algaworks.comercial.service.GrupoService;
import com.algaworks.comercial.util.FacesUtils;

@Named
@ViewScoped
public class GrupoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	@Inject
	private GrupoService gs;
	
	@Inject
	private FacesUtils fc;
	
	@Inject
	private ClassificacaoService cs;
	
	private Grupo grupo = new Grupo(); 
	
	private List<Classificacao> lista_secoes = new ArrayList<Classificacao>();
	
	@PostConstruct
	public void Init(){
		
        lista_secoes = cs.retornaLista();
		
	    if(lista_secoes.isEmpty()){
	    	
	    	fc.exibeErro("Não ha seçoes cadastradas!!");	
	    }
		    
	}
	
    public void salvar() {
		
		try {
			System.out.println(grupo.getNome());
			gs.salvar(grupo);
			
			fc.exibeSucesso("Grupo salvo com sucesso!");
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			fc.exibeErro("Cadastro Duplicado "+e.getMessage());
			e.printStackTrace();
		}
		
	}

    
    

    public void novo(){
	      grupo = new Grupo();
     }


     public void reset() {
         RequestContext.getCurrentInstance().reset("frm_grupo");
     }


     public Grupo getGrupo() {
	      return grupo;
     }


    public void setGrupo(Grupo grupo) {
	     this.grupo = grupo;
     }

    public List<Classificacao> getLista_secoes() {
	     return lista_secoes;
     }

    public void setLista_secoes(List<Classificacao> lista_secoes) {
	     this.lista_secoes = lista_secoes;
     }



	
}
