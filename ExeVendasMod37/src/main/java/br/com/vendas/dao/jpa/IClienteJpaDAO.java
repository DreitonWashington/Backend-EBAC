package br.com.vendas.dao.jpa;

import br.com.vendas.dao.generic.jpa.IGenericJapDAO;
import br.com.vendas.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
