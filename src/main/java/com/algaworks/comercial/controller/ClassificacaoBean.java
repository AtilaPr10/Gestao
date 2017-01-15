package com.algaworks.comercial.controller;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.PersistenceException;
import org.primefaces.context.RequestContext;
import com.algaworks.comercial.model.Classificacao;
import com.algaworks.comercial.service.ClassificacaoService;
import com.algaworks.comercial.util.FacesUtils;


@Named(value="controllerClassificacao")
@ViewScoped
public class ClassificacaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ClassificacaoService cs;
	
	@Inject
	private FacesUtils fc;
	
	private Classificacao classificacao = new Classificacao(); 
	
	
	
	
	
    public void salvar() {
		
		try {
			cs.salvar(classificacao);
			fc.exibeSucesso("Seção salva com sucesso!");
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			fc.exibeErro("Cadastro Duplicado "+e.getMessage());
			e.printStackTrace();
		}
		
	}


    public void novo(){
	  classificacao = new Classificacao();
}


   public void reset() {
      RequestContext.getCurrentInstance().reset("rm_classificacao");
}


   public Classificacao getClassificacao() {
	   return classificacao;
}


   public void setClassificacao(Classificacao classificacao) {
	  this.classificacao = classificacao;
}
	
	




}
