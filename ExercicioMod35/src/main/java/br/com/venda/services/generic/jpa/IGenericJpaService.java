package br.com.venda.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.venda.dao.Persistente;
import br.com.venda.exceptions.DAOException;
import br.com.venda.exceptions.MaisDeUmRegistroException;
import br.com.venda.exceptions.TableException;
import br.com.venda.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericJpaService <T extends Persistente, E extends Serializable> {
	
	
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;

}
