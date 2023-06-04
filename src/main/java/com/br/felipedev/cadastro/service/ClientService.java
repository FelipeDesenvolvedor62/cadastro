package com.br.felipedev.cadastro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.felipedev.cadastro.api.dto.ClientDto;
import com.br.felipedev.cadastro.entity.ClientEntity;
import com.br.felipedev.cadastro.mapper.ClientMapper;
import com.br.felipedev.cadastro.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repo;

	@Autowired
	private ClientMapper mapper;

	public void add(ClientDto client) {
		ClientEntity entity = mapper.dtoToEntity(client);
		repo.save(entity);
	}

	public List<ClientDto> findAll() {
		List<ClientEntity> clients = repo.findAll();
		return mapper.dtoToEntity(clients);
	}

	public ClientDto findById(Long id) {
		Optional<ClientEntity> client = repo.findById(id);
		return mapper.entityToDto(client.get());
	}

	public void update(ClientDto dto) {
		ClientEntity client = mapper.dtoToEntity(dto);
		repo.save(client);
	}

	public void delete(ClientDto dto) {
		ClientEntity client = mapper.dtoToEntity(dto);
		repo.delete(client);
	}
}
