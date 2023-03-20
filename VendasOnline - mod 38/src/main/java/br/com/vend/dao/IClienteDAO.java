/**
 * 
 */
package br.com.vend.dao;

import java.util.List;

import br.com.vend.dao.generic.IGenericDAO;
import br.com.vend.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
