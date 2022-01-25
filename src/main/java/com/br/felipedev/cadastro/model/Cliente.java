package com.br.felipedev.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.felipedev.cadastro.model.abstracts.Pessoa;
import com.br.felipedev.cadastro.model.enums.Status;

@Entity
public class Cliente extends Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private Long matricula;
	private Status status;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setEstatus(Status status) {
		this.status = status;
	}

	public Cliente() {

	}

	public Cliente(Long matricula, Status status) {
		this.matricula = matricula;
		this.status = status;
	}

}
