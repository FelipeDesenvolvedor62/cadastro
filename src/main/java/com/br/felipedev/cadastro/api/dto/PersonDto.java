package com.br.felipedev.cadastro.api.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDto {
	private Long id;
	private String name;
	private String documentNumber;
	private List<PhoneDto> phones;
	private List<AddressDto> address;
}
