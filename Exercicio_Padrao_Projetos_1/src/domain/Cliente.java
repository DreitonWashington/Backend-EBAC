package domain;

public class Cliente {
	
	private String tipoCarro;
	private char categoria;
	
	public Cliente(String tipo, char cat) {
		this.tipoCarro = tipo;
		this.categoria = cat;
	}

	public String getTipoCarro() {
		return tipoCarro;
	}
	
	public char getCategoria() {
		return categoria;
	}

}
