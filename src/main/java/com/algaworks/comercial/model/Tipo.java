package com.algaworks.comercial.model;

public enum Tipo {
	
	
	FISICA("FISICA") 
   ,JURIDICA("JURIDICA");
		
		private String descricao;

		Tipo(String descricao) {
			this.descricao = descricao;
		}
		
		public String getDescricao() {
			return descricao;
		}
		

}
