package classes;

public class App {

	public static void main(String[] args) {
		
		Carro car = new Carro();
		car.setMarca("BMW");
		car.setModelo("320i");
		car.setVelocidadeMax(250);
		
		car.infoCar();;

	}

}
