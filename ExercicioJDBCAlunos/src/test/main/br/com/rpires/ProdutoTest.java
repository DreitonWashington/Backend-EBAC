package br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.rpires.dao.IProdutoDAO;
import br.com.rpires.dao.ProdutoDAO;
import br.com.rpires.domain.Produto;

public class ProdutoTest {
	
	@Test
	public void cadastrarTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("Fanta Uva");
		
		Produto produto2 = new Produto();
		produto.setCodigo("02");
		produto.setNome("Coca-Cola");
		
		dao.cadastrar(produto2);
		Integer qtd = dao.cadastrar(produto);
		assertTrue(qtd == 1);
		
		//Exercício buscar todos os produtos
		List<Produto> rs= dao.buscarAll();
		assertNotNull(rs);
		
		Produto produtoBD = dao.consultar(produto.getCodigo());
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		//Exercício excluir todos os produtos
		Integer qtdDel = dao.excluir(produtoBD);
		assertNotNull(qtdDel);
		
	}
	
	//Exercício update produto
	@Test
	public void atualizar() throws Exception{
		IProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = new Produto();
		Produto produtodb = new Produto();
				
		produto.setId(2L);
		produto.setCodigo("005");
		produto.setNome("PEPSI");
		
		dao.atualizar(produto);
		
		produtodb = dao.consultar(produto.getCodigo());
		
		assertEquals(produto.getCodigo(), produtodb.getCodigo());
	}
}
