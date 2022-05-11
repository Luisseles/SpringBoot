package com.generation.loja.de.games.model;

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



@Entity
@Table (name="tb_produtos")
public class Produtos {
	
	@Id
	@GeneratedValue  (strategy= GenerationType.IDENTITY)
    public Long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	public String nome;
	
	@NotNull 
	public String genero;
	
	@NotNull 
	public String edicao;
	
	@NotNull 
	public double preco =(50.2);
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categorias categorias;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Usuario usuario;
	
	public Date date = new java.sql.Date(System.currentTimeMillis()) ;

	public Long getId() {
		return id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
