package application;

import domain.Carro;
import domain.Cliente;
import domain.Fabrica;
import domain.passeioFabrica;
import domain.sportFabrica;

public class Program {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Sport", 'A');
		Fabrica fabrica = getCarro(cliente.getTipoCarro());
		Carro carro = fabrica.criar(cliente.getCategoria());
		carro.ligar();

	}
	private static Fabrica getCarro(String tipoCarro) {
		if(tipoCarro == "Sport") {
			return new sportFabrica();
		}else {
			return new passeioFabrica();
		}
	}
}
