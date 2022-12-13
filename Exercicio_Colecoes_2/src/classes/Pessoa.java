package classes;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private String sexo;
	
	public Pessoa() {
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, String sexo) {
		this(nome);
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	@Override
	public int compareTo(Pessoa pessoa) {
		return this.nome.compareTo(pessoa.getNome());	
	}
}
