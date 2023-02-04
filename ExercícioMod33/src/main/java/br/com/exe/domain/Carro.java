package br.com.exe.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_CARRO")
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String modelo;
	private String cor;
	private String placa;
	
	@ManyToMany
	@JoinTable(name="TB_CARRO_ACESSORIO", joinColumns = { @JoinColumn(name="id_carro_fk")},
			inverseJoinColumns = { @JoinColumn(name="id_acessorios_fk")})
	private List<Acessorio> acessorios = new ArrayList<Acessorio>();
	
	@ManyToOne
	@JoinColumn(name="id_marca_fk", foreignKey = @ForeignKey(name="fk_marca_carro"), 
		referencedColumnName = "id", nullable = false)
	private Marca marca;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void add(Acessorio acessorio) {
		this.acessorios.add(acessorio);
	}
}
