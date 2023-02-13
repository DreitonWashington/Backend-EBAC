package br.com.venda.dao;

import br.com.venda.dao.generic.IGenericDAO;
import br.com.venda.domain.Venda;
import br.com.venda.exceptions.DAOException;
import br.com.venda.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
