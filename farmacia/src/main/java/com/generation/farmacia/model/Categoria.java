package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.farmacia.model.Produto;

@Entity
@Table(name="tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue  (strategy= GenerationType.IDENTITY)
    public Long id;
	
	@NotNull
    public String nome;
	
	@OneToMany(mappedBy="categoria", cascade = javax.persistence.CascadeType.ALL)
    @JsonIgnoreProperties("categoria")
    private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
}
