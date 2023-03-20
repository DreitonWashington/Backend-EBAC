/**
 * 
 */
package br.com.vend.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.vend.domain.Persistente;
import br.com.vend.exceptions.DAOException;
import br.com.vend.exceptions.MaisDeUmRegistroException;
import br.com.vend.exceptions.TableException;
import br.com.vend.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericService <T extends Persistente, E extends Serializable> {
	
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

   
    public void excluir(T entity) throws DAOException;

    
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    
    public Collection<T> buscarTodos() throws DAOException;

}
