package com.br.felipedev.cadastro.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.felipedev.cadastro.api.dto.ClientDto;
import com.br.felipedev.cadastro.entity.ClientEntity;

@Component
public class ClientMapper {

	@Autowired
	private AddressMapper addressMapper;

	@Autowired
	private PhoneMapper phoneMapper;

	public ClientEntity dtoToEntity(ClientDto dto) {
		ClientEntity entity = new ClientEntity();
		entity.setName(dto.getName());
		entity.setDocumentNumber(dto.getDocumentNumber());
		entity.setStatus(dto.getStatus());
		entity.setId(dto.getId());
		entity.setRegistration(dto.getRegistration());

		if (!Objects.isNull(dto.getPhones())) {
			entity.setPhones(phoneMapper.dtoToEntity(dto.getPhones()));
		}

		if (!Objects.isNull(dto.getAddress())) {
			entity.setAddress(addressMapper.dtoToEntity(dto.getAddress()));
		}
		
		return entity;
	}

	public List<ClientDto> dtoToEntity(List<ClientEntity> entitys) {
		List<ClientDto> clients = new ArrayList<>();

		for (ClientEntity entity : entitys) {
			clients.add(entityToDto(entity));
		}

		return clients;
	}

	public ClientDto entityToDto(ClientEntity entity) {
		ClientDto dto = new ClientDto();
		
		dto.setName(entity.getName());
		dto.setDocumentNumber(entity.getDocumentNumber());
		dto.setStatus(entity.getStatus());
		dto.setId(entity.getId());
		dto.setRegistration(entity.getRegistration());

		if (!Objects.isNull(entity.getPhones())) {
			dto.setPhones(phoneMapper.entityToDto(entity.getPhones()));
		}

		if (!Objects.isNull(entity.getAddress())) {
			dto.setAddress(addressMapper.entityToDto(entity.getAddress()));
		}
		
		return dto;
	}
}
