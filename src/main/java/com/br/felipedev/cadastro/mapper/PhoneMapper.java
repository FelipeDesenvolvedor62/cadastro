package com.br.felipedev.cadastro.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.br.felipedev.cadastro.api.dto.PhoneDto;
import com.br.felipedev.cadastro.entity.PhoneEntity;

@Component
public class PhoneMapper {
 
	public List<PhoneDto> entityToDto(List<PhoneEntity> entitys) {
		List<PhoneDto> phones = new ArrayList<>();

		for (PhoneEntity entity : entitys) {
			phones.add(entityToDto(entity));
		}
		
		return phones;
	}

	private PhoneDto entityToDto(PhoneEntity entity) {
		PhoneDto dto =  new PhoneDto();
		dto.setDdd(entity.getDdd());
		dto.setPhone(entity.getPhone());
		dto.setType(entity.getType());
		return dto;
	}

	public List<PhoneEntity> dtoToEntity(List<PhoneDto> dtos) {
		List<PhoneEntity> phones = new ArrayList<>();

		for (PhoneDto dto : dtos) {
			phones.add(dtoToEntity(dto));
		}
		return phones;
	}

	private PhoneEntity dtoToEntity(PhoneDto dto) {
		PhoneEntity entity =  new PhoneEntity();
		entity.setDdd(dto.getDdd());
		entity.setPhone(dto.getPhone());
		entity.setType(dto.getType());
		return entity;
	}
}
