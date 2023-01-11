package testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

import application.Pessoa;



public class Teste {
	
	@Test
	public void apenasFeminino() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome e o sexo(masculino/feminino) separados por virgula");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		for(int i = 0 ; i<2 ;i++) {
			System.out.printf("Digite o nome e o sexo: ");
			String info = sc.nextLine();
			
			String[] infoSplit = info.split(",");
			Pessoa p = new Pessoa(infoSplit[0], infoSplit[1].toUpperCase());
			
			pessoas.add(p);
		}	
		
		System.out.println("");
		
		List<Pessoa> listaFeminino = pessoas.stream().map(pessoa -> new Pessoa(pessoa.getNome(), pessoa.getSexo()))
			.filter(p -> p.getSexo().equals("FEMININO")).collect(Collectors.toList());
		
		boolean soMulher = false;

		
		for(Pessoa p : listaFeminino) {
			if(p.getSexo().equals("FEMININO")) {
				soMulher = true;
				break;
			}else {
				soMulher = false;
				break;
			}
		}
		
		sc.close();
		
		Assert.assertEquals(soMulher, true);
	}
}
