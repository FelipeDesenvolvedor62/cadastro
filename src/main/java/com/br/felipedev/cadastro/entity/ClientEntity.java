package com.br.felipedev.cadastro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.felipedev.cadastro.enums.ERegistrationStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ClientEntity extends PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private Long registration;
	private ERegistrationStatus status;

}
