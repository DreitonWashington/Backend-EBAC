package com.mc.vendasonline.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mc.vendasonline.domain.Cliente;
import com.mc.vendasonline.repository.IClienteRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private IClienteRepository clienteRepository;
	
	public Cliente buscar(Long id) {
		return clienteRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(
				String.format("Cliente de ID: %s não encontrado", id)));
	}
	
	public List<Cliente> todosClientes(){
		return clienteRepository.findAll();
	}
	
	@Transactional
	public void excluir(Long id) {
		Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(
				String.format("Cliente de ID: %s não encontrado", id)));
		
		clienteRepository.deleteById(cliente.getId());
	}
	
	@Transactional
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Transactional
	public Cliente atualizar(Cliente cliente) {
		Cliente clienteAtual = clienteRepository.findById(cliente.getId()).orElseThrow(() -> new EntityNotFoundException(
				String.format("Cliente de ID: %s não encontrado", cliente.getId())));
		
		BeanUtils.copyProperties(cliente, clienteAtual, "id");
		return clienteRepository.save(clienteAtual);
	}
	
}
