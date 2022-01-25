package com.br.felipedev.cadastro.model.abstracts;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.br.felipedev.cadastro.model.Endereco;
import com.br.felipedev.cadastro.model.Telefone;
import com.br.felipedev.cadastro.model.execpions.CampoVazioOuNulo;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O campo nome não pode ser nula")
	@NotBlank(message = "O campo 'Nome' não pode ser vazio ou com espaços em branco")
	private String nome;
	private String cpf;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "telefone_id", referencedColumnName = "id")
	private List<Telefone> telefones;
	
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private List<Endereco> enderecos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Pessoa() {
	}
}
