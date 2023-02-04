package br.com.exe;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.exe.dao.IProdutoDAO;
import br.com.exe.dao.ProdutoDAO;
import br.com.exe.domain.Produto;

public class ProdutoTest {
	
	private IProdutoDAO produtoDAO;
	
	public ProdutoTest() {
		produtoDAO = new ProdutoDAO();
	}
	
	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setNome("Coca-Cola");
		prod.setQuantidade(10);
		produtoDAO.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}
}
