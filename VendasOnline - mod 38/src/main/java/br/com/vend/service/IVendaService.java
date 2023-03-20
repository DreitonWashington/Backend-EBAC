/**
 * 
 */
package br.com.vend.service;

import br.com.vend.dao.generic.IGenericDAO;
import br.com.vend.domain.Venda;
import br.com.vend.exceptions.DAOException;
import br.com.vend.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaService extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	
	public Venda consultarComCollection(Long id);

}
