package metier.session.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;


import metier.entities.Compte;
import metier.session.ICompteLocal;
import metier.session.ICompteRemote;

@Stateless(name = "CompteEjb")
public class CompteEjbImpl implements ICompteLocal , ICompteRemote {

	@PersistenceContext(unitName = "EjbBanque")
	private EntityManager em ;
	//=Persistence.createEntityManagerFactory( "EjbBanque" ).createEntityManager();;
	@Override
	public void addCompte(Compte compte) {
		em.persist(compte);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Compte> ConsulterComptes() {
		return em.createQuery("select c from Compte c ").getResultList();
	}

	@Override
	public Compte ConsulterCompte(Long codeCompte) {
		Compte cpt = em.find(Compte.class,codeCompte);
		if(cpt==null)throw new RuntimeException("Compte Introuvble");
		return cpt;
	}

	@Override
	public void updateCompte(Compte compte) {
		em.merge(compte);
		
	}

	@Override
	public void supprimerCompte(Long codeCompte) {
	 Compte cpt = ConsulterCompte(codeCompte);
	 em.remove(cpt);
		
	}
	public void hello() {
		System.out.println("hello ejb");
		
	}

}
