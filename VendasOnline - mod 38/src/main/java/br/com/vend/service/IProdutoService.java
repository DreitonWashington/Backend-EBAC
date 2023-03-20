/**
 * 
 */
package br.com.vend.service;

import java.util.List;

import br.com.vend.domain.Produto;
import br.com.vend.services.generic.IGenericService;


public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
