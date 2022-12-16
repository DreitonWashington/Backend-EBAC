package annotations;

@Tabela(value = "tabela_teste")
public class teste {
	
	private String name;
	
	public teste() {}
	
	public teste(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
