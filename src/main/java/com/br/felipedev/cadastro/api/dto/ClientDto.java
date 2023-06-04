package com.br.felipedev.cadastro.api.dto;

import com.br.felipedev.cadastro.enums.ERegistrationStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDto extends PersonDto {
	private Long id;
	private Long registration;
	private ERegistrationStatus status;	
	
}
