package com.br.felipedev.cadastro.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.felipedev.cadastro.api.dto.ClientDto;
import com.br.felipedev.cadastro.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService service;

	@GetMapping("/{id}")
	public ClientDto findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping
	public List<ClientDto> findAll() {
		return service.findAll();
	}

	@PostMapping
	public void add(@RequestBody ClientDto cliente) {
		service.add(cliente);
	}
	
	@PutMapping
	public void update(@RequestBody ClientDto cliente) {
		service.update(cliente);
	}
	
	@DeleteMapping
	public void delete(@RequestBody ClientDto cliente) {
		service.delete(cliente);
	}
}