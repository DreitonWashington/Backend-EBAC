package domain;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, String email, String telefone, String cnpj) {
		super(nome,email,telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
