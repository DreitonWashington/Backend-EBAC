/**
 * 
 */
package br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.rpires.dao.ClienteDAO;
import br.com.rpires.dao.IClienteDAO;
import br.com.rpires.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteTest {

	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Rodrigo Pires");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}
	
	@Test
	public void buscarAll() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		List<Cliente> rs = new ArrayList<>();
		rs = dao.buscarAll();
		
		assertNotNull(rs);
	}
	
	@Test
	public void atualizar() throws Exception{
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		Cliente clientedb = new Cliente();
				
		cliente.setId(3L);
		cliente.setCodigo("005");
		cliente.setNome("Lucas TESTE");
		
		dao.atualizar(cliente);
		
		clientedb = dao.consultar(cliente.getCodigo());
		
		assertEquals(cliente.getCodigo(), clientedb.getCodigo());
	}
}
