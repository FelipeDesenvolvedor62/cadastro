package com.br.felipedev.cadastro.exceptions;

public class CampoVazioOuNulo extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private String nome;

	public CampoVazioOuNulo(String nome) {
		this.nome = nome;
	}

	@Override
	public String getMessage() {
		return "O campo " + this.nome + " não pode estar vazio !!!";
	}
}
