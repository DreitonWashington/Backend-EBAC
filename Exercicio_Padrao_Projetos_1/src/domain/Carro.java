package domain;

public abstract class Carro {
	
	private String nome;
	private int horsePower;
	private String cor;
	private String combustivel;
	
	public Carro(String nome ,int horsePower, String cor, String combustivel) {
		this.nome = nome;
		this.horsePower = horsePower;
		this.cor = cor;
		this.combustivel = combustivel;
	}
	
	public void ligar() {
		System.out.printf("O motor a %s com %dHP do %s, est� ligado.", combustivel, horsePower, nome);
	}
	
	public void limpar() {
		System.out.printf("O carro foi limpo, o %s est� brilhando.\n", cor);
	}
	
	public void mecanica() {
		System.out.print("O carro est� com a mec�nica em dia.\n");
	}
}
