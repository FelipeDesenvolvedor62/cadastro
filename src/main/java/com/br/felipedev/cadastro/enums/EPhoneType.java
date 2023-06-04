package com.br.felipedev.cadastro.enums;

public enum EPhoneType {
	CELULAR(0),
	FIXO(1),
	COMERCIAL(2);
	
	private final Integer value;

	EPhoneType(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
