package com.br.felipedev.cadastro.api.dto;

import org.springframework.stereotype.Component;

import com.br.felipedev.cadastro.enums.EPhoneType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class PhoneDto {

	private Long id;
	private String ddd;
	private String phone;
	private EPhoneType type;

	private PersonDto person;

}
