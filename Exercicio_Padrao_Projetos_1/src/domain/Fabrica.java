package domain;

public abstract class Fabrica {
	
	public Carro criar(char categoria) {
		
		Carro carro = categoriaCar(categoria);
		carro = prepararCarro(carro);
		return carro;
	}
	
	private Carro prepararCarro(Carro carro) {
		carro.limpar();
		carro.mecanica();
		return carro;
	}
	abstract Carro categoriaCar(char categoria);
}
