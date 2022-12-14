package domain;

public class sportFabrica extends Fabrica{

	@Override
	Carro categoriaCar(char categoria) {
		switch(categoria) {
			case 'A':
				return new Porsche("Porsche",1000,"Azul", "Gasolina");
				
			case 'B':
				return new Ferrari("Ferrari",950, "Vermelha", "Gasolina");
				
			default:
				System.out.println("Carro indisponível.");
				return null;
		}
	}

}
