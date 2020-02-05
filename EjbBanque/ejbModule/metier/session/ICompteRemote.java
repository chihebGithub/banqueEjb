package metier.session;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Compte;

@Remote
public interface ICompteRemote  {
	
	public void addCompte(Compte compte);
	public List<Compte> ConsulterComptes();
	public Compte ConsulterCompte(Long codeCompte);
	public void updateCompte(Compte compte);
	public void supprimerCompte(Long codeCompte);
	

}
