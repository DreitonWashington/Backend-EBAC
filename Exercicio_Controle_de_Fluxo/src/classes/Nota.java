package classes;

public class Nota {
	
	private String nome;
	private float nota;
	
	public Nota() {
	}

	public Nota(String nome, float nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public String toString() {
		return "Nome: " + this.nome + " nota: " + this.nota;
	}
}
