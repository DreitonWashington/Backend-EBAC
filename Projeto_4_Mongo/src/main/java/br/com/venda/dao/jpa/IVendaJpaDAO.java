package br.com.venda.dao.jpa;

import br.com.venda.dao.generic.jpa.IGenericJapDAO;
import br.com.venda.domain.jpa.VendaJpa;
import br.com.venda.exceptions.DAOException;
import br.com.venda.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	
	public VendaJpa consultarComCollection(Long id);
}
