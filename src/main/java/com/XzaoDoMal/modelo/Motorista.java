package com.XzaoDoMal.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_motorista")
public class Motorista implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="carro")
	private String carro;
	
	@OneToMany(mappedBy = "motorista")
	private List<ControleGeral> controle = new ArrayList<>();
	
	@OneToMany(mappedBy = "motorista")
	private List<Despesa> despesa = new ArrayList<>();
	
	public Motorista() {
		super();
	}

	public Motorista(Long id, String nome, String carro, List<ControleGeral> controle, List<Despesa> despesa) {
		super();
		this.id = id;
		this.nome = nome;
		this.carro = carro;
		this.controle = controle;
		this.despesa = despesa;
	}

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

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public List<ControleGeral> getControle() {
		return controle;
	}

	public void setControle(List<ControleGeral> controle) {
		this.controle = controle;
	}

	public List<Despesa> getDespesa() {
		return despesa;
	}

	public void setDespesa(List<Despesa> despesa) {
		this.despesa = despesa;
	}
}
