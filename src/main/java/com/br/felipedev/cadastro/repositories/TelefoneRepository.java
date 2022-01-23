package com.br.felipedev.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.felipedev.cadastro.model.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long>{
}
