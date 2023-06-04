package com.br.felipedev.cadastro.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.br.felipedev.cadastro.api.dto.AddressDto;
import com.br.felipedev.cadastro.entity.AddressEntity;

@Component
public class AddressMapper {

	public AddressDto entityToDto(AddressEntity entity) {
		AddressDto dto = new AddressDto();
		dto.setId(entity.getId());
		dto.setCity(entity.getCity());
		dto.setDistrict(entity.getDistrict());
//		dto.setPerson(personMapper.entityToDto(entity.getPerson()));
		dto.setRaw(entity.getRaw());
		dto.setState(entity.getState());
		dto.setZipCode(entity.getZipCode());
		return dto;
	}
	public List<AddressDto> entityToDto(List<AddressEntity> entitys) {
		List<AddressDto> listAddress = new ArrayList<>();

		for (AddressEntity entity : entitys) {
			listAddress.add(entityToDto(entity));
		}
		
		return listAddress;
	}
	public List<AddressEntity> dtoToEntity(List<AddressDto> address) {
		List<AddressEntity> listAddress = new ArrayList<>();

		for (AddressDto dto : address) {
			listAddress.add(dtoToEntity(dto));
		}
		
		return listAddress;
	}
	private AddressEntity dtoToEntity(AddressDto dto) {
		AddressEntity entity = new AddressEntity();
		entity.setId(dto.getId());
		entity.setCity(dto.getCity());
		entity.setDistrict(dto.getDistrict());
//		entity.setPerson(personMapper.dtoToEntity(dto.getPerson()));
		entity.setRaw(dto.getRaw());
		entity.setState(dto.getState());
		entity.setZipCode(dto.getZipCode());
		return entity;		
	}
}
