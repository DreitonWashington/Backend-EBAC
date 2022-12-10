package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String name;
	private List<Nota> notas = new ArrayList<>();
	
	public Aluno() {
	}

	public Aluno(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	public void addNota(Nota nota) {
		notas.add(nota);
	}
	
	public float med() {
		float nota = (notas.get(0).getNota() + notas.get(1).getNota() + 
				notas.get(2).getNota() + notas.get(3).getNota() )/ 4;
		return nota;
	}

}
