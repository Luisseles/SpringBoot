package com.generation.farmacia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.farmacia.model.Categoria;

@Entity
@Table (name="tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue  (strategy= GenerationType.IDENTITY)
    public Long id;
	
	@NotNull
	@Size(min = 5, max = 100, message="O campo deve ter no minimo 5 caracteres, e no maximo 100 caracteres")
	public String nome;
	
	@Size(min = 5, max = 100, message="O campo deve ter no minimo 5 caracteres, e no maximo 100 caracteres")
	public String descricao;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	public Date date = new java.sql.Date(System.currentTimeMillis()) ;

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
