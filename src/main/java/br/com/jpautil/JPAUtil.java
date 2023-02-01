package br.com.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	static {
		if(factory == null) {
			
			factory = Persistence.createEntityManagerFactory("CRUDJSF");
		}
	}

	
	
	public static EntityManager entityManager() {
		return factory.createEntityManager();
	}
}
