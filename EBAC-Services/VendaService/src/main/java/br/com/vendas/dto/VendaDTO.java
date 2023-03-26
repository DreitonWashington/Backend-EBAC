package br.com.vendas.dto;

import java.time.Instant;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class VendaDTO {
	
	@NotNull
	@Size(min = 2, max = 10)
	private String codigo;
	
	@NotNull
	private String clienteId;
	
	@NotNull
	private Instant dataVenda;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getClienteId() {
		return clienteId;
	}

	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}

	public Instant getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Instant dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	

}
