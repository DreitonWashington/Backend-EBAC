package domain;

public class passeioFabrica extends Fabrica{
	
	@Override
	Carro categoriaCar(char categoria) {
		switch(categoria) {
			case 'A':
				return new Fiat("Fiat",120,"Preto", "Gasolina");
				
			case 'B':
				return new Renault("Renault",115, "Cinza", "�lcool");
				
			default:
				System.out.println("Carro indispon�vel.");
				return null;
		}
	}
}
