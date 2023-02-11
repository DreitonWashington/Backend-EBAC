package application;

import java.util.ArrayList;
import java.util.List;

import domain.Audi;
import domain.Carro;
import domain.Fiat;
import domain.Honda;

public class App {

	public static void main(String[] args) {
		
		Carro h1 = new Honda("Honda","Civic");
		Carro f1 = new Fiat("Fiat","Palio");
		Carro a1 = new Audi("Audi", "A1");
		
		List<Carro> carros = new ArrayList<>();
		
		carros.add(h1);
		carros.add(f1);
		carros.add(a1);
		
		for(Carro x : carros) {
			System.out.println(x.getMarca() + " " + x.getModelo());
		}

	}

}
