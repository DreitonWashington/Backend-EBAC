package application;

import java.math.BigDecimal;
import java.util.Scanner;

import classes.Aluno;
import classes.Nota;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = sc.next();
		Aluno aluno = new Aluno(nomeAluno);
		
		System.out.println();
		for(int i = 0 ; i < 4 ; i++) {
			Nota notaMateria = new Nota();
			
			System.out.print("Digite o nome da matéria: ");
			String nomeMateria = sc.next();
			System.out.print("Digite a nota: ");
			float nota = sc.nextFloat();
			System.out.println();
			
			notaMateria.setNome(nomeMateria);
			notaMateria.setNota(nota);
			
			aluno.addNota(notaMateria);			
		}
		
		System.out.println(aluno.med());
		
		if(aluno.med() >= 7) {
			System.out.printf("Aluno %s está aprovado", aluno.getName());
		}
		else if(aluno.med() >= 5) {
			System.out.printf("Aluno %s está de recuperação", aluno.getName());
		}
		else {
			System.out.printf("Aluno %s está reprovado", aluno.getName());
		}
	
	}

}
