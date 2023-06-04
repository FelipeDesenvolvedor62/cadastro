package com.br.felipedev.cadastro.enums;

public enum ERegistrationStatus {
	INACTIVE(0),
	ACTIVE(1);
	
	private final Integer value;

	ERegistrationStatus(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
