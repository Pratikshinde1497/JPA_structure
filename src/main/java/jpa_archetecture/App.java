package jpa_archetecture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Student pushable = new Student();
		pushable.setRno(110);
		pushable.setSname("JPA PUSH DEMO");
		pushable.setMarks(100);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(pushable);
		
		Student s = em.find(Student.class, 110);             // 		fetch data
		
		em.getTransaction().commit();
		
		System.out.println(s);
	}
}
