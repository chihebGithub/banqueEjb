package main;

import java.util.Properties;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import metier.entities.Compte;
import metier.session.ICompteLocal;
import metier.session.ICompteRemote;
import metier.session.impl.CompteEjbImpl;

public class Main {
	  
		public static void main(String[] args) {
			Compte C = new Compte();
			EntityManagerFactory emf =
					 Persistence.createEntityManagerFactory("EjbBanque");
					 EntityManager em = emf.createEntityManager(); 
					 em.persist(C);
}
}