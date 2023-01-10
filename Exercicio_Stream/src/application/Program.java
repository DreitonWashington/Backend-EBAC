package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome e o sexo(masculino/feminino) separados por virgula");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		for(int i = 0 ; i<5 ;i++) {
			System.out.printf("Digite o nome e o sexo: ");
			String info = sc.nextLine();
			
			String[] infoSplit = info.split(",");
			Pessoa p = new Pessoa(infoSplit[0], infoSplit[1]);
			
			pessoas.add(p);
		}
		
		System.out.println("");
		
		List<Pessoa> listaFeminio =pessoas.stream().map(pessoa -> new Pessoa(pessoa.getNome(), pessoa.getSexo().toUpperCase()))
			.filter(p -> p.getSexo().equals("FEMININO")).collect(Collectors.toList());
		
		for(Pessoa p : listaFeminio) {
			System.out.println("Nome: " + p.getNome() + " , Sexo: " + p.getSexo());
		}
		
		sc.close();

	}

}
