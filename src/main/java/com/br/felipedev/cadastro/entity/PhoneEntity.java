package com.br.felipedev.cadastro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.br.felipedev.cadastro.enums.EPhoneType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PhoneEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ddd;
	private String phone;
	private EPhoneType type;

	@ManyToOne
	private PersonEntity person;
}
