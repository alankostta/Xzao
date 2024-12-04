package com.XzaoDoMal.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_despesa")
public class Despesa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="descricao")
	private String descricao;
	@Column(name="valor_despesa", precision = 18, scale = 2)
	private BigDecimal valorDespesa;
	@Column(name="data")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "motorista_fk")
	private Motorista motorista;
	
	public Despesa() {
		super();
	}

	public Despesa(Long id, String descricao, BigDecimal valorDespesa, Date data, Motorista motorista) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorDespesa = valorDespesa;
		this.data = data;
		this.motorista = motorista;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(BigDecimal valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
}
