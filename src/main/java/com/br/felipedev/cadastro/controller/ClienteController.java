package com.br.felipedev.cadastro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.felipedev.cadastro.Service.ClienteService;
import com.br.felipedev.cadastro.model.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping("/{id}")
	public Optional<Cliente> findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping
	public List<Cliente> findAll() {
		return service.findAll();
	}

	@PostMapping
	public void add(@RequestBody Cliente cliente) {
		service.add(cliente);
	}
	
	@PutMapping
	public void update(@RequestBody Cliente cliente) {
		service.update(cliente);
	}
	
}