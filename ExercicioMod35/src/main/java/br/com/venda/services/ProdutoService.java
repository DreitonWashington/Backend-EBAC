package br.com.venda.services;

import br.com.venda.dao.IProdutoDAO;
import br.com.venda.domain.Produto;
import br.com.venda.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
