package br.gov.sp.fatec.projetotopicos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.Set;

import javax.persistence.Column;

@Entity
@Table(name = "usr_usuario")

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usr_id")
	private Long id;

	@Column(name = "usr_nome")
	private String nome;

	@Column(name = "usr_senha")
	private String senha;
	
	@ManyToMany(mappedBy = "autozizacoes")
	@JoinTable(name = "uau_usuario_autorizacao",
	joinColumns = { @JoinColumn(name = "usr_id")},
	inverseJoinColumns = { @JoinColumn(name = "aut_id")} )
	private Set<Autorizacao> autorizacoes;

	public Long getId() {
		return id;		
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
