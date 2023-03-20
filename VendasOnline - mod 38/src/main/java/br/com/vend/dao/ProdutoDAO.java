/**
 * 
 */
package br.com.vend.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.vend.dao.generic.GenericDAO;
import br.com.vend.domain.Produto;


public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		TypedQuery<Produto> tpQuery = 
				this.entityManager.createNamedQuery("Produto.findByNome", this.persistenteClass);
		tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
	}

}
