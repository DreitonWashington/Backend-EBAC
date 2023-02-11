package br.com.tst.services;

import br.com.tst.dao.IProdutoDAO;
import br.com.tst.domain.Produto;
import br.com.tst.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
