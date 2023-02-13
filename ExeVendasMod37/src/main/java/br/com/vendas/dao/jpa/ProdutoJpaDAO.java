package br.com.vendas.dao.jpa;

import br.com.vendas.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.vendas.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
