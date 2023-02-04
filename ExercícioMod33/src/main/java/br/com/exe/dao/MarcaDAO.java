package br.com.exe.dao;

import br.com.exe.domain.Marca;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MarcaDAO implements IMarcaDAO{

	public Marca cadastrar(Marca marca) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(marca);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		return marca;
	}

}
