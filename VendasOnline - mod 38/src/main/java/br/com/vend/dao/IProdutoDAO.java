/**
 * 
 */
package br.com.vend.dao;

import java.util.List;

import br.com.vend.dao.generic.IGenericDAO;
import br.com.vend.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
