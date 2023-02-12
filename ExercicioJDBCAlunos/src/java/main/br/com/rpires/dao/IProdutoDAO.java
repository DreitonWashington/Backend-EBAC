package br.com.rpires.dao;

import java.util.List;

import br.com.rpires.domain.Produto;

public interface IProdutoDAO {
	
	public Integer cadastrar(Produto produto) throws Exception;

	public Produto consultar(String codigo) throws Exception;

	public Integer excluir(Produto produtoBD) throws Exception;
	
	public List<Produto> buscarAll() throws Exception;
	
	public Produto atualizar(Produto produto) throws Exception;
}
