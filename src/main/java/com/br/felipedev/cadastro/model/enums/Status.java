package com.br.felipedev.cadastro.model.enums;

public enum Status {
	INATIVO(0),
	ATIVO(1);
	
	private final Integer valor;

	Status(Integer valor) {
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}
}
