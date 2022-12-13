package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> masc = new ArrayList<>();
		List<Pessoa> femi = new ArrayList<>();
		
		System.out.printf("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.printf("Digite o sexo( Masculino / Feminino ): ");
		String sexo = sc.nextLine();
		
		Pessoa pessoa = new Pessoa(nome,sexo);
		
		switch(sexo) {
			case "Masculino":
				masc.add(pessoa);
				System.out.println("Adicionado ao grupo Masculino");
				break;
			
			case "Feminino":
				femi.add(pessoa);
				System.out.println("Adicionado ao grupo feminino");
				break;
		}


	}

}
