package com.br.felipedev.cadastro.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.felipedev.cadastro.model.Cliente;
import com.br.felipedev.cadastro.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public void add(Cliente cliente) {
		repo.save(cliente);
	}
	
	public List<Cliente> findAll() {
		return repo.findAll();
	}
	
	public Optional<Cliente> findById(Long id) {
		return repo.findById(id);
	}
}
