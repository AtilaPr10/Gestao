package com.algaworks.comercial.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQueries({
@NamedQuery(name="Produto.findAll", query="SELECT p FROM Produto p"),
@NamedQuery(name="Porduto.findbyId",query="SELECT p from Produto p where p.id = :id")
})
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column
	private String descricao;
	
	@Column
	private String descricao_reduzida;
	
	@Column
	private BigDecimal preco_um;
	
	@Column
	private BigDecimal preco_dois;
	
	@Column
	private BigDecimal preco_tres;
	
	@Column
	private BigDecimal custo_reposicao_atual;
	
	@Column
	private BigDecimal custo_reposicao_anterior;
	
	@Column
	private BigDecimal custo_fiscal;
	
	
	@ManyToOne
	private Classificacao secao;
	
	@ManyToOne
	private Grupo grupo;
	
    
	@OneToMany
    private List<ProdutoEan> codigos_ean;
	
    
	@Column
	private String unidade_medida;
	
	
	@Column
	private String ncm;
	
	@Column
	private String cest;
	
	@Column
	private String tabelaa;
	
	@Column
	private String tabelabentrada;
	
	@Column
	private String tabelabsaida;
   
    @Column
	private boolean fora_de_linha = true;
    
    @Column(nullable=false)
   	private boolean balanca;
	
    @Lob 
	private byte[] imagem;
	
    @ManyToOne
    private LocalEstoque localestoque;
    
  
	

	public LocalEstoque getLocalestoque() {
		return localestoque;
	}

	public void setLocalestoque(LocalEstoque localestoque) {
		this.localestoque = localestoque;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public boolean isBalanca() {
		return balanca;
	}

	public void setBalanca(boolean balanca) {
		this.balanca = balanca;
	}

	public boolean isFora_de_linha() {
		return fora_de_linha;
	}

	public void setFora_de_linha(boolean fora_de_linha) {
		this.fora_de_linha = fora_de_linha;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getTabelabentrada() {
		return tabelabentrada;
	}

	public void setTabelabentrada(String tabelabentrada) {
		this.tabelabentrada = tabelabentrada;
	}

	public String getTabelabsaida() {
		return tabelabsaida;
	}

	public void setTabelabsaida(String tabelabsaida) {
		this.tabelabsaida = tabelabsaida;
	}

	public String getTabelaa() {
		return tabelaa;
	}

	public void setTabelaa(String tabelaa) {
		this.tabelaa = tabelaa;
	}

	

	public List<ProdutoEan> getCodigos_ean() {
		return codigos_ean;
	}

	public void setCodigos_ean(List<ProdutoEan> codigos_ean) {
		this.codigos_ean = codigos_ean;
	}

	public Classificacao getSecao() {
		return secao;
	}

	public void setSecao(Classificacao secao) {
		this.secao = secao;
	}

	public String getUnidade_medida() {
		return unidade_medida;
	}

	public void setUnidade_medida(String unidade_medida) {
		this.unidade_medida = unidade_medida;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getCest() {
		return cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}

	public void setDescricao_reduzida(String descricao_reduzida) {
		this.descricao_reduzida = descricao_reduzida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao_reduzida() {
		return descricao_reduzida;
	}

	public void setDescricao_resuzida(String descricao_resuzida) {
		this.descricao_reduzida = descricao_resuzida;
	}

	public BigDecimal getPreco_um() {
		return preco_um;
	}

	public void setPreco_um(BigDecimal preco_um) {
		this.preco_um = preco_um;
	}

	public BigDecimal getPreco_dois() {
		return preco_dois;
	}

	public void setPreco_dois(BigDecimal preco_dois) {
		this.preco_dois = preco_dois;
	}

	public BigDecimal getPreco_tres() {
		return preco_tres;
	}

	public void setPreco_tres(BigDecimal preco_tres) {
		this.preco_tres = preco_tres;
	}

	public BigDecimal getCusto_reposicao_atual() {
		return custo_reposicao_atual;
	}

	public void setCusto_reposicao_atual(BigDecimal custo_reposicao_atual) {
		this.custo_reposicao_atual = custo_reposicao_atual;
	}

	public BigDecimal getCusto_reposicao_anterior() {
		return custo_reposicao_anterior;
	}

	public void setCusto_reposicao_anterior(BigDecimal custo_reposicao_anterior) {
		this.custo_reposicao_anterior = custo_reposicao_anterior;
	}

	public BigDecimal getCusto_fiscal() {
		return custo_fiscal;
	}

	public void setCusto_fiscal(BigDecimal custo_fiscal) {
		this.custo_fiscal = custo_fiscal;
	}
    
    
    
    
	
	
	
	
	
	
	
	
	
	

}
