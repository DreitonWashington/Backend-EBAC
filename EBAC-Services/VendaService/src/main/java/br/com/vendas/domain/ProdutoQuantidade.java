package br.com.vendas.domain;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;


public class ProdutoQuantidade {
	
	@NotNull
	private Produto produto;
	
	@NotNull
	private Integer quantidade;
	
	private BigDecimal valorTotal;
	
	
	
	public ProdutoQuantidade(@NotNull Produto produto, @NotNull Integer quantidade, BigDecimal valorTotal) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
	}

	public ProdutoQuantidade() {
		this.quantidade = 0;
		this.valorTotal = BigDecimal.ZERO;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}



	public BigDecimal getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}



	public void adicionar(Integer quantidade) {
		this.quantidade += quantidade;
		BigDecimal novoValor = this.getValorTotal().multiply(BigDecimal.valueOf(quantidade));
		BigDecimal novoTotal = this.valorTotal.add(novoValor);
		this.valorTotal = novoTotal;
	}
	
	public void remover(Integer quantidade) {
		this.quantidade -= quantidade;
		BigDecimal novoValor = this.getValorTotal().multiply(BigDecimal.valueOf(quantidade));
		this.valorTotal = this.valorTotal.subtract(novoValor);
	}
	
	
}
