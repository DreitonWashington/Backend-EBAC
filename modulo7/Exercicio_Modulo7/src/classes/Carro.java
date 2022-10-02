package classes;

public class Carro {
	private String marca;
	private String modelo;
	private int velocidadeMax;
	public String infoCar;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
	/**
	 * infoCar contem algumas informações do carro.
	 */
	public void infoCar() {
		System.out.println("==== Info Car ====\n"
			  //+"\n=                =\n"
			  +"=Marca: "+this.marca+"      =\n"
			  +"=Modelo: "+this.modelo+"    =\n"
			  +"=VelMax: "+this.velocidadeMax+"Km/h =\n"
			  +"==================");
	}
}
