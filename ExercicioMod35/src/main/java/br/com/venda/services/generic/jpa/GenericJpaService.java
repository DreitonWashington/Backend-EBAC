package br.com.venda.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.venda.dao.Persistente;
import br.com.venda.dao.generic.IGenericDAO;
import br.com.venda.dao.generic.jpa.IGenericJapDAO;
import br.com.venda.exceptions.DAOException;
import br.com.venda.exceptions.MaisDeUmRegistroException;
import br.com.venda.exceptions.TableException;
import br.com.venda.exceptions.TipoChaveNaoEncontradaException;


public abstract class GenericJpaService<T extends Persistente, E extends Serializable> 
	implements IGenericJpaService<T, E> {
	
	protected IGenericJapDAO<T, E> dao;
	
	public GenericJpaService(IGenericJapDAO<T, E> dao) {
		this.dao = dao;
	}
	

	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}
	

}
