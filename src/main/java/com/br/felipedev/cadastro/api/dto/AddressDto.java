package com.br.felipedev.cadastro.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
	private Long id;
	private String zipCode;
	private String raw;
	private String district;
	private String city;
	private String state;
    private PersonDto person;	
	
}
