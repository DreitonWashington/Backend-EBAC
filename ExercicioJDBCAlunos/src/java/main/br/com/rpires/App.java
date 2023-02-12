package br.com.rpires;

import br.com.rpires.dao.ClienteDAO;
import br.com.rpires.domain.Cliente;

public class App {

	public static void main(String[] args) throws Exception {
		ClienteDAO dao = new ClienteDAO();
		Cliente c = new Cliente();
		
		c.setId(3L);
		c.setCodigo("06");
		c.setNome("Update TESTE1");
		
		dao.atualizar(c);
		
		//dao.cadastrar(c);

		
		//for(Cliente x : dao.buscarAll()) {
			//System.out.println("Nome: " + x.getNome());
		//}

	}

}
