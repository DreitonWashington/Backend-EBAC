package com.mc.vendasonline;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mc.vendasonline.domain.ClienteM;
import com.mc.vendasonline.repository.mongoRepo.IClienteRepositoryM;

@SpringBootTest
public class ClienteMongoTest {
	
	@Autowired
	private IClienteRepositoryM clienteService;
	
	@Test
	public void cadastrarCliente() {
		ClienteM cliente = new ClienteM();
		cliente.setNome("Marcos");
		cliente.setCpf(2L);
		cliente.setTel(3L);
		cliente.setCidade("Jundiaí");
		cliente.setEstado("São Paulo");
		cliente.setEnd("Av y");
		cliente.setNumero(25);
		
		clienteService.save(cliente);
		List<ClienteM> t = new ArrayList<>();
		t = clienteService.findAll();
		
		Assert.assertNotNull(t);
	}
}
