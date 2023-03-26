package br.com.vendas.domain;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Produto {
	
	private String id;

	@NotNull
	@Size(min = 2, max = 10)
	private String codigo;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String nome;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String descricao;
	
	@NotNull
	private BigDecimal valor;

	public Produto(String id, @NotNull @Size(min = 2, max = 10) String codigo,
			@NotNull @Size(min = 1, max = 50) String nome, @NotNull @Size(min = 1, max = 50) String descricao,
			@NotNull BigDecimal valor) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
}
