package com.hellojpa.jpa;

import com.hellojpa.jpa.entities.Book;
import com.hellojpa.jpa.entities.Member;
import com.hellojpa.jpa.entities.Movie;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class JpaApplication {
	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");
		EntityManager entityManager = emf.createEntityManager();

		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			Movie movie = new Movie();
			movie.setActor("kim");
			movie.setDirector("a");
			movie.setPrice(10000);

			entityManager.persist(movie);

			Book book = new Book();
			book.setAuthor("book");
			book.setIsbm("1234");
			book.setPrice(1000);

			entityManager.persist(book);
			tx.commit();


		}catch (Exception e){
			e.printStackTrace();
			tx.rollback();
		}finally {
			entityManager.close();
		}

		emf.close();

	}
}
