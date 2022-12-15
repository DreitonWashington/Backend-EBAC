package classes;

import anotacoes.PrimeiraAnnotation;

public class ClasseComAnnotation {
	
	@PrimeiraAnnotation(value = "TESTE", bairros = {"JD Guanabara"}, numCasa = 1)
	private String nome;
	private String bairro;
	private long numCasa;
	
	
}
