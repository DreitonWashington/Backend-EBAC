package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import classes.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os nomes(máximo 10) separando por vírgula (',')");
		String pessoas = sc.nextLine();
		List<Pessoa> pessoasLista = new ArrayList<>();
		String[]pessoaC = new String[10];
		
		 pessoaC = pessoas.split(",");
		 
		 for(int i = 0 ; i < pessoaC.length ; i++) {	
			 Pessoa fulano = new Pessoa(pessoaC[i]);
			 pessoasLista.add(fulano);
		 }
		 
		 Collections.sort(pessoasLista);
		 
		 System.out.println("---Lista de Pessoas em ordem Alfábetica---");
		 System.out.println("");
		 for(Pessoa x : pessoasLista) {
			 System.out.println(x.getNome());
		 }
		 System.out.println("------------------------------------------");
		
		System.out.println("Digite no máximo 10 nomes e sexo (fulano-m), separando por vírgula (',')");
		String pessoasC = sc.nextLine();
		Map<Integer, Pessoa> pessoaListaMasc = new HashMap<>();
		Map<Integer, Pessoa> pessoaListaFemi = new HashMap<>();
		
		String[]pessoaB = new String[10];
		String[]pessoaS = new String[2];
		
		 pessoaB = pessoasC.split(",");
		
		 for(int i = 0 ; i < pessoaB.length ; i++) {
			 int c = 0;
			 pessoaS = pessoaB[i].split("-");
			 Pessoa fulano = new Pessoa(pessoaS[c],pessoaS[c+1]);
			 
			 switch(pessoaS[c+1]) {
			 	case "m":
			 		fulano.setSexo("Masculino");
			 		pessoaListaMasc.put(i+1, fulano);
			 		break;
			 	
			 	case "f":
			 		fulano.setSexo("Feminino");
			 		pessoaListaFemi.put(i+1, fulano);
			 		break;
			 }
		 }
		 
		 System.out.println("--Lista Masculina--");
		 pessoaListaMasc.entrySet().forEach(pessoa -> {
			 System.out.println("Id: " + pessoa.getKey());
			 System.out.println("Nome: " + pessoa.getValue().getNome());
			 System.out.println("Sexo: " + pessoa.getValue().getSexo());
		 });
		 
		 System.out.println("--Lista Feminina--");
		 pessoaListaFemi.entrySet().forEach(pessoa -> {
			 System.out.println("Id: " + pessoa.getKey());
			 System.out.println("Nome: " + pessoa.getValue().getNome());
			 System.out.println("Sexo: " + pessoa.getValue().getSexo());
		 });
		 
		 sc.close();
	}
	

}
