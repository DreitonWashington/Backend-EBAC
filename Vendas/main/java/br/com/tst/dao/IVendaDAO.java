package br.com.tst.dao;

import br.com.tst.dao.generic.IGenericDAO;
import br.com.tst.domain.Venda;
import br.com.tst.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
