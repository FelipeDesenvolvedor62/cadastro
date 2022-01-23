package com.br.felipedev.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.br.felipedev.cadastro.model.ENUM.TipoTelefone;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@Length(min=2, max=100, message="O campo deve conter entre 5 a 80 caracteres")
	@NotBlank(message = "Não é permidito cadastrar somente espaços em branco")
	private String nome;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente() {

	}

	public Cliente(String nome) {
		this.nome = nome;
	}

}
