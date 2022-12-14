package application;

import java.util.Scanner;

import domain.Pessoa;
import domain.PessoaFisica;
import domain.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha uma opção: 1 - Pessoa Física 2 - Pessoa Juridica");
		char opcao = sc.next().charAt(0);
		
		System.out.print("Digite o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Digite o email: ");
		String email = sc.nextLine();
		System.out.print("Digite o telefone: ");
		String tel = sc.nextLine();
		
		switch(opcao) {
			case '1':
				System.out.print("Digite o CPF: ");
				String cpf = sc.nextLine();
				
				Pessoa pessoa = new PessoaFisica(nome,email,tel,cpf);
				
				System.out.printf("Conta do(a) %s, criado(a).", nome);
				break;
			
			case '2':
				System.out.print("Digite o CNPJ: ");
				String cnpj = sc.nextLine();
				
				Pessoa pessoa2 = new PessoaJuridica(nome,email,tel,cnpj);
				
				System.out.printf("%s, criado(a).", nome);
		
		}
		
		sc.close();
	}

}
