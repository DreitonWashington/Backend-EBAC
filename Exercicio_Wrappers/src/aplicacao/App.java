package aplicacao;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		Integer numIntg;
		
		System.out.println("Digite um número");
		num = sc.nextInt();
		numIntg = num;
		System.out.println("Numero digitado: " + numIntg);
		
	}

}
