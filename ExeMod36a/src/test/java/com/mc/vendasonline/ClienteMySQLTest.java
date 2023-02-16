package com.mc.vendasonline;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mc.vendasonline.domain.Cliente;

import com.mc.vendasonline.services.ClienteService;

import jakarta.persistence.EntityNotFoundException;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
@SpringBootTest
public class ClienteMySQLTest {
	
	@Autowired
	private ClienteService clienteService;
	
	@Test
	public void salvarCliente() {
		Cliente cliente = new Cliente();
		
		cliente.setNome("Julio Test");
		cliente.setCidade("Jundiaí");
		cliente.setCpf(1L);
		cliente.setEnd("Rua x t");
		cliente.setEstado("São Paulo");
		cliente.setNumero(24);
		cliente.setTel(3L);
		
		clienteService.salvar(cliente);
		Cliente clientedb = clienteService.buscar(1L);
		
		Assert.assertEquals(cliente.getNome(), clientedb.getNome());
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(1L);
		assertThrows(EntityNotFoundException.class, ()->{
			clienteService.buscar(1L);
		});
	}
}
