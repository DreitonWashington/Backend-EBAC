package br.com.vendas.dao.jpa;

import br.com.vendas.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.vendas.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
