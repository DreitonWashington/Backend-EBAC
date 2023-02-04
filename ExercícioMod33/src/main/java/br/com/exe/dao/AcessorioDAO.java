package br.com.exe.dao;

import br.com.exe.domain.Acessorio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AcessorioDAO implements IAcessorioDAO{

	public Acessorio cadastrar(Acessorio acessorio) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(acessorio);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		return acessorio;
	}

}
