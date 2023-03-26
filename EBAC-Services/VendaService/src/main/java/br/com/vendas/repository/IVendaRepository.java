package br.com.vendas.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.vendas.domain.Venda;

@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

	Optional<Venda> findByCodigo(String codigo);
}
