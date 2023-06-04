package com.br.felipedev.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.felipedev.cadastro.api.dto.ClientDto;
import com.br.felipedev.cadastro.entity.ClientEntity;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long>{
}
