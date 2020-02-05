package metier.session;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Compte;
@Local
public interface ICompteLocal {
	public void addCompte(Compte compte);
	public List<Compte> ConsulterComptes();
	public Compte ConsulterCompte(Long codeCompte);
	public void updateCompte(Compte compte);
	public void supprimerCompte(Long codeCompte);
	
	void hello();
	

}
