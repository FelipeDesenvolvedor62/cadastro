[1mdiff --git a/src/main/java/com/br/felipedev/cadastro/model/Cliente.java b/src/main/java/com/br/felipedev/cadastro/model/Cliente.java[m
[1mindex 537a26d..8c2d5b2 100644[m
[1m--- a/src/main/java/com/br/felipedev/cadastro/model/Cliente.java[m
[1m+++ b/src/main/java/com/br/felipedev/cadastro/model/Cliente.java[m
[36m@@ -6,6 +6,7 @@[m [mimport javax.persistence.GenerationType;[m
 import javax.persistence.Id;[m
 [m
 import com.br.felipedev.cadastro.model.abstracts.Pessoa;[m
[32m+[m[32mimport com.br.felipedev.cadastro.model.enums.Status;[m
 [m
 @Entity[m
 public class Cliente extends Pessoa {[m
[36m@@ -14,6 +15,8 @@[m [mpublic class Cliente extends Pessoa {[m
 	@GeneratedValue(strategy = GenerationType.IDENTITY)[m
 	private Long id;	[m
 	private Long matricula;[m
[32m+[m	[32mprivate Status status;[m
[32m+[m[41m	[m
 	public Long getId() {[m
 		return id;[m
 	}[m
[36m@@ -29,13 +32,22 @@[m [mpublic class Cliente extends Pessoa {[m
 	public void setMatricula(Long matricula) {[m
 		this.matricula = matricula;[m
 	}[m
[32m+[m[41m	[m
[32m+[m	[32mpublic Status getStatus() {[m
[32m+[m		[32mreturn status;[m
[32m+[m	[32m}[m
[32m+[m
[32m+[m	[32mpublic void setEstatus(Status status) {[m
[32m+[m		[32mthis.status = status;[m
[32m+[m	[32m}[m
 [m
 	public Cliente() {[m
 [m
 	}[m
 [m
[31m-	public Cliente(Long matricula) {[m
[32m+[m	[32mpublic Cliente(Long matricula, Status status) {[m
 		this.matricula = matricula;[m
[32m+[m		[32mthis.status = status;[m
 	}[m
 [m
 }[m
[1mdiff --git a/src/main/java/com/br/felipedev/cadastro/model/Endereco.java b/src/main/java/com/br/felipedev/cadastro/model/Endereco.java[m
[1mindex 072bdcd..93b544d 100644[m
[1m--- a/src/main/java/com/br/felipedev/cadastro/model/Endereco.java[m
[1m+++ b/src/main/java/com/br/felipedev/cadastro/model/Endereco.java[m
[36m@@ -4,6 +4,9 @@[m [mimport javax.persistence.Entity;[m
 import javax.persistence.GeneratedValue;[m
 import javax.persistence.GenerationType;[m
 import javax.persistence.Id;[m
[32m+[m[32mimport javax.persistence.ManyToOne;[m
[32m+[m
[32m+[m[32mimport com.br.felipedev.cadastro.model.abstracts.Pessoa;[m
 [m
 @Entity[m
 public class Endereco {[m
[36m@@ -17,6 +20,17 @@[m [mpublic class Endereco {[m
 	private String cidade;[m
 	private String estado;[m
 [m
[32m+[m	[32m@ManyToOne[m
[32m+[m[32m    private Pessoa pesssoa;[m[41m	[m
[32m+[m[41m	[m
[32m+[m	[32mpublic Pessoa getPesssoa() {[m
[32m+[m		[32mreturn pesssoa;[m
[32m+[m	[32m}[m
[32m+[m
[32m+[m	[32mpublic void setPesssoa(Pessoa pesssoa) {[m
[32m+[m		[32mthis.pesssoa = pesssoa;[m
[32m+[m	[32m}[m
[32m+[m[41m	[m
 	public String getCep() {[m
 		return cep;[m
 	}[m
[1mdiff --git a/src/main/java/com/br/felipedev/cadastro/model/Telefone.java b/src/main/java/com/br/felipedev/cadastro/model/Telefone.java[m
[1mindex d9bd0a4..099f23a 100644[m
[1m--- a/src/main/java/com/br/felipedev/cadastro/model/Telefone.java[m
[1m+++ b/src/main/java/com/br/felipedev/cadastro/model/Telefone.java[m
[36m@@ -1,14 +1,14 @@[m
 package com.br.felipedev.cadastro.model;[m
 [m
[31m-import javax.persistence.CascadeType;[m
 import javax.persistence.Entity;[m
 import javax.persistence.GeneratedValue;[m
 import javax.persistence.GenerationType;[m
 import javax.persistence.Id;[m
 import javax.persistence.ManyToOne;[m
[32m+[m[32mimport javax.persistence.OneToOne;[m
 [m
[31m-import com.br.felipedev.cadastro.model.ENUM.TipoTelefone;[m
 import com.br.felipedev.cadastro.model.abstracts.Pessoa;[m
[32m+[m[32mimport com.br.felipedev.cadastro.model.enums.TipoTelefone;[m
 [m
 @Entity[m
 public class Telefone {[m
[36m@@ -20,6 +20,17 @@[m [mpublic class Telefone {[m
 	private String telefone;[m
 	private TipoTelefone tipo;[m
 [m
[32m+[m	[32m@ManyToOne[m
[32m+[m[32m    private Pessoa pesssoa;[m[41m	[m
[32m+[m[41m	[m
[32m+[m	[32mpublic Pessoa getPesssoa() {[m
[32m+[m		[32mreturn pesssoa;[m
[32m+[m	[32m}[m
[32m+[m
[32m+[m	[32mpublic void setPesssoa(Pessoa pesssoa) {[m
[32m+[m		[32mthis.pesssoa = pesssoa;[m
[32m+[m	[32m}[m
[32m+[m
 	public Long getId() {[m
 		return id;[m
 	}[m
[1mdiff --git a/src/main/java/com/br/felipedev/cadastro/model/abstracts/Pessoa.java b/src/main/java/com/br/felipedev/cadastro/model/abstracts/Pessoa.java[m
[1mindex 9c5cce6..09927d8 100644[m
[1m--- a/src/main/java/com/br/felipedev/cadastro/model/abstracts/Pessoa.java[m
[1m+++ b/src/main/java/com/br/felipedev/cadastro/model/abstracts/Pessoa.java[m
[36m@@ -9,10 +9,15 @@[m [mimport javax.persistence.GenerationType;[m
 import javax.persistence.Id;[m
 import javax.persistence.Inheritance;[m
 import javax.persistence.InheritanceType;[m
[32m+[m[32mimport javax.persistence.JoinColumn;[m
 import javax.persistence.OneToMany;[m
[32m+[m[32mimport javax.validation.constraints.Max;[m
[32m+[m[32mimport javax.validation.constraints.NotBlank;[m
[32m+[m[32mimport javax.validation.constraints.NotNull;[m
 [m
 import com.br.felipedev.cadastro.model.Endereco;[m
 import com.br.felipedev.cadastro.model.Telefone;[m
[32m+[m[32mimport com.br.felipedev.cadastro.model.execpions.CampoVazioOuNulo;[m
 [m
 @Inheritance(strategy = InheritanceType.JOINED)[m
 @Entity[m
[36m@@ -21,19 +26,24 @@[m [mpublic abstract class Pessoa {[m
 	@Id[m
 	@GeneratedValue(strategy = GenerationType.IDENTITY)[m
 	private Long id;[m
[32m+[m
[32m+[m	[32m@NotNull(message = "O campo nome não pode ser nula")[m
[32m+[m	[32m@NotBlank(message = "O campo 'Nome' não pode ser vazio ou com espaços em branco")[m
 	private String nome;[m
 	private String cpf;[m
 [m
[31m-	@OneToMany(mappedBy = "id", cascade = { CascadeType.ALL })[m
[32m+[m	[32m@OneToMany(cascade = { CascadeType.ALL })[m
[32m+[m	[32m@JoinColumn(name = "telefone_id", referencedColumnName = "id")[m
 	private List<Telefone> telefones;[m
[31m-[m
[31m-	@OneToMany[m
[31m-	private List<Endereco> enderecos;[m
 	[m
[32m+[m	[32m@OneToMany(cascade = { CascadeType.ALL })[m
[32m+[m	[32m@JoinColumn(name = "endereco_id", referencedColumnName = "id")[m
[32m+[m	[32mprivate List<Endereco> enderecos;[m
[32m+[m
 	public String getNome() {[m
 		return nome;[m
 	}[m
[31m-	[m
[32m+[m
 	public void setNome(String nome) {[m
 		this.nome = nome;[m
 	}[m
[1mdiff --git a/src/main/java/com/br/felipedev/cadastro/model/enums/TipoTelefone.java b/src/main/java/com/br/felipedev/cadastro/model/enums/TipoTelefone.java[m
[1mindex 1f5f08e..0b09337 100644[m
[1m--- a/src/main/java/com/br/felipedev/cadastro/model/enums/TipoTelefone.java[m
[1m+++ b/src/main/java/com/br/felipedev/cadastro/model/enums/TipoTelefone.java[m
[36m@@ -1,4 +1,4 @@[m
[31m-package com.br.felipedev.cadastro.model.ENUM;[m
[32m+[m[32mpackage com.br.felipedev.cadastro.model.enums;[m
 [m
 public enum TipoTelefone {[m
 	CELULAR(0),[m
