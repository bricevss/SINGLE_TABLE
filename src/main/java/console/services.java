package console;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Payment;

public class services {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			List<Payment> payments = em.createQuery("from Payment", Payment.class).getResultList();
			
			for (Payment p : payments) {
				System.out.println( p.getClass().getName() );
				System.out.println( "\t" + p);
			}
			
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
			
		}				
	}
}