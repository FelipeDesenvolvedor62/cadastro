package com.br.felipedev.cadastro.model.ENUM;

public enum TipoTelefone {
	CELULAR(0),
	FIXO(1),
	COMERCIAL(2);
	
	private final Integer valor;

	TipoTelefone(Integer valor) {
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}
}
