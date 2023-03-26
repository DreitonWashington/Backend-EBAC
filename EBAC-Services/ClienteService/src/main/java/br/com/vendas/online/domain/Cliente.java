package br.com.vendas.online.domain;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(collection = "cliente")
@Schema(name="Cliente", description="Cliente") 
public class Cliente {
	
	@Id
	@Schema(description="Identificador único") 
	private String id;
	
	@NotNull
	@Size(min = 1, max = 50)
	@Schema(description="Nome", minLength = 1, maxLength=50, nullable = false) 
	private String nome;
	
	@NotNull
	@Indexed(unique = true, background = true)
	@Schema(description="CPF", nullable = false) 
    private Long cpf;
    
	@NotNull
	@Schema(description="Telefone", nullable = false) 
    private Long tel;
	
	@NotNull
	@Size(min = 1, max = 50)
	@Indexed(unique = true, background = true)
	@Schema(description="Email", minLength = 1, maxLength=50, nullable = false)
	@Pattern(regexp = ".+@.+\\..+", message = "Email inválido")
	private String email;
    
	@NotNull
	@Size(min = 1, max = 50)
	@Schema(description="Endereço", minLength = 1, maxLength=50, nullable = false)
    private String end;
    
	@NotNull
	@Schema(description="Numero residencial", nullable = false) 
    private Integer numero;
    
	@NotNull
	@Size(min = 1, max = 50)
	@Schema(description="Cidade", minLength = 1, maxLength=50, nullable = false)
    private String cidade;
    
	@NotNull
	@Size(min = 1, max = 50)
	@Schema(description="Estado", minLength = 1, maxLength=50, nullable = false)
    private String estado;

	public Cliente(String id, @NotNull @Size(min = 1, max = 50) String nome, @NotNull Long cpf, @NotNull Long tel,
			@NotNull @Size(min = 1, max = 50) @Pattern(regexp = ".+@.+\\..+", message = "Email inválido") String email,
			@NotNull @Size(min = 1, max = 50) String end, @NotNull Integer numero,
			@NotNull @Size(min = 1, max = 50) String cidade, @NotNull @Size(min = 1, max = 50) String estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
		this.email = email;
		this.end = end;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getTel() {
		return tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
	

}
