package br.com.vendas.dao.jpa;

import br.com.vendas.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.vendas.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
