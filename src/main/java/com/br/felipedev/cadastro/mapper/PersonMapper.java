package com.br.felipedev.cadastro.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.felipedev.cadastro.api.dto.PersonDto;
import com.br.felipedev.cadastro.entity.PersonEntity;

@Component
public class PersonMapper {

	@Autowired
	private AddressMapper addressMapper;
	
	@Autowired
	private PhoneMapper phoneMapper;
	
	public PersonDto entityToDto(PersonEntity entity) {
		PersonDto dto = new PersonDto();
		dto.setName(entity.getName());
		dto.setDocumentNumber(entity.getDocumentNumber());
		dto.setPhones(phoneMapper.entityToDto(entity.getPhones()));
		dto.setAddress(addressMapper.entityToDto(entity.getAddress()));
		return dto;
	}
	
//	public PersonEntity dtoToEntity(PersonDto dto) {
//		PersonEntity entity = new PersonEntity();
//		entity.setName(dto.getName());
//		entity.setDocumentNumber(dto.getDocumentNumber());
//		entity.setPhones(phoneMapper.dtoToEntity(dto.getPhones()));
//		entity.setAddress(addressMapper.dtoToEntity(dto.getAddress()));
//		return entity;
//	}
	
}
