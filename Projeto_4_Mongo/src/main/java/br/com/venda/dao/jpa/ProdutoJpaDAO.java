package br.com.venda.dao.jpa;

import br.com.venda.dao.generic.jpa.GenericJpaDAO;
import br.com.venda.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
