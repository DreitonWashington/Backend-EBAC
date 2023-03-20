/**
 * 
 */
package br.com.vend.service;

import java.util.List;

import br.com.vend.domain.Cliente;
import br.com.vend.exceptions.DAOException;
import br.com.vend.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
