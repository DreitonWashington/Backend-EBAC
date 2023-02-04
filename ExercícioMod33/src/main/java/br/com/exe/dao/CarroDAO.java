package br.com.exe.dao;

import br.com.exe.domain.Carro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CarroDAO implements ICarroDAO{

	public Carro cadastrar(Carro carro) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(carro);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		return carro;
	}

}
