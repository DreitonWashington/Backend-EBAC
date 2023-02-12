/**
 * 
 */
package br.com.rpires.dao;

import java.util.List;

import br.com.rpires.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO {

	
	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;
	
	public List<Cliente> buscarAll() throws Exception;
	
	public Cliente atualizar(Cliente cliente) throws Exception;
}
