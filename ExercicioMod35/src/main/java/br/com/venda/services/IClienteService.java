package br.com.venda.services;

import br.com.venda.domain.Cliente;
import br.com.venda.exceptions.DAOException;
import br.com.venda.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
