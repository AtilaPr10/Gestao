package com.algaworks.comercial.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@SuppressWarnings("unused")
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
@NamedQueries({
@NamedQuery(name="Pessoa.buscaPorNome", 
query="select p from Pessoa p where p.nome like :nome"),
@NamedQuery(name="Pessoa.buscaPorDocumento", 
query="select p from Pessoa p where p.cpf_cnpj = :cpf_cnpj")
})
public abstract class Pessoa {


	
	private Long id;
	
	@Column
	private String nome;
	
	@Column(unique=true)
	private String cpf_cnpj;
	
	@Column
	private String ie_identidade_passaporte;
	
	@Column
	private String telefone1;
	
	@Column
	private String telefone2;
	
	@Column
	private String email;
	
	@Column
	private String logradouro;
	
	@Column
	private String numero;
	
	@Column
	private String estado;
	
	@Column
	private String cidade;
	
	@Column
	private String codigo_ibge;
	
	@Column
	private String tipo_pessoa;
	
	@Column
	private String cep;
    
    @Column
	private String bairro;
    
    @Column
    private String obs;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTipo_pessoa() {
		return tipo_pessoa;
	}

	public void setTipo_pessoa(String tipo_pessoa) {
		this.tipo_pessoa = tipo_pessoa;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getIe_identidade_passaporte() {
		return ie_identidade_passaporte;
	}

	public void setIe_identidade_passaporte(String ie_identidade_passaporte) {
		this.ie_identidade_passaporte = ie_identidade_passaporte;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCodigo_ibge() {
		return codigo_ibge;
	}

	public void setCodigo_ibge(String codigo_ibge) {
		this.codigo_ibge = codigo_ibge;
	}

	@Override
	public String toString() {
		return  nome ;
	}
	
	
   
	
	
	
	

	
	
	
	
	
	

}
