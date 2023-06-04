package com.br.felipedev.cadastro.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.br.felipedev.cadastro.api.dto.AddressDto;

import lombok.Getter;
import lombok.Setter;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Getter
@Setter
public abstract class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O campo nome não pode ser nula")
	@NotBlank(message = "O campo 'Nome' não pode ser vazio ou com espaços em branco")
	private String name;
	private String documentNumber;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "phone_id", referencedColumnName = "id")
	private List<PhoneEntity> phones;
	
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private List<AddressEntity> address;

	
}
