package com.generation.loja.de.games.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categorias")
public class Categorias {
	
    @Id
	@GeneratedValue  (strategy= GenerationType.IDENTITY)
    public Long id;
    
    @NotNull
    public String nome;
    
    @NotNull
    public String plataforma;
    
    @OneToMany(mappedBy="categorias", cascade = javax.persistence.CascadeType.ALL)
    @JsonIgnoreProperties("categorias")
    private List<Produtos> produtos;

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

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public List<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}
    
}
