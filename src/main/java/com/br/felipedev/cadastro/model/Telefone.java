package com.br.felipedev.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.br.felipedev.cadastro.model.abstracts.Pessoa;
import com.br.felipedev.cadastro.model.enums.TipoTelefone;

@Entity
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ddd;
	private String telefone;
	private TipoTelefone tipo;

	@ManyToOne
    private Pessoa pesssoa;	
	
	public Pessoa getPesssoa() {
		return pesssoa;
	}

	public void setPesssoa(Pessoa pesssoa) {
		this.pesssoa = pesssoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	public Telefone(String ddd, String telefone, TipoTelefone tipo) {
		super();
		this.ddd = ddd;
		this.telefone = telefone;
		this.tipo = tipo;
	}

	public Telefone() {
	}
}
