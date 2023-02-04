package br.com.exe;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.exe.dao.AcessorioDAO;
import br.com.exe.dao.CarroDAO;
import br.com.exe.dao.IAcessorioDAO;
import br.com.exe.dao.ICarroDAO;
import br.com.exe.dao.IMarcaDAO;
import br.com.exe.dao.MarcaDAO;
import br.com.exe.domain.Acessorio;
import br.com.exe.domain.Carro;
import br.com.exe.domain.Marca;

public class CarroTest {
	
	private ICarroDAO carroDAO;
	private IAcessorioDAO acessorioDAO;
	private IMarcaDAO marcaDAO;
	
	public CarroTest() {
		carroDAO = new CarroDAO();
		acessorioDAO = new AcessorioDAO();
		marcaDAO = new MarcaDAO();
	}
	
	@Test
	public void cadastrar() {
		Acessorio acessorio1 = criarAcessorio("Computador de bordo");
		Acessorio acessorio2 = criarAcessorio("Teto solar");
	
		Marca marca = criarMarca("Honda");

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		carro1.setModelo("Civic");
		carro1.setCor("Preta");
		carro1.setPlaca("ESJ-1234");
		carro1.add(acessorio1);
		carro1.add(acessorio2);
		
		carro2.setModelo("City");
		carro2.setCor("Prata");
		carro2.setPlaca("ABC-1434");
		
		marca.add(carro1);
		marca.add(carro2);
		carro1.setMarca(marca);
		carro2.setMarca(marca);
		
		carro1 = carroDAO.cadastrar(carro1);
		carro2 = carroDAO.cadastrar(carro2);
		
		assertNotNull(carro1);
		assertNotNull(carro2);
	}
	
	private Acessorio criarAcessorio(String name) {
		Acessorio acessorio = new Acessorio();
		acessorio.setNome(name);
		
		return acessorioDAO.cadastrar(acessorio);
	}
	
	private Marca criarMarca(String nome) {
		Marca marca = new Marca();
		marca.setNome(nome);
		
		return marcaDAO.cadastrar(marca);
	}
}
