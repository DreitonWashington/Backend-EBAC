package br.com.venda.dao.jpa;

import br.com.venda.dao.generic.jpa.GenericJpaDAO;
import br.com.venda.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
