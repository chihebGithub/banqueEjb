package metier.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity
@Table
public class Compte implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numero;
	
	@Column(name="Proprietaire", length=512)
	private String Proprietaire ;
	
	@Column(name="categorie")
	private char categorie ;
	@Column(length = 10, precision = 3)
	private double solde ;
	private static final long serialVersionUID = 1L;
	public Compte() {
		super();
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getProprietaire() {
		return Proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		Proprietaire = proprietaire;
	}
	public char getCategorie() {
		return categorie;
	}
	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Compte(String proprietaire, char categorie, double solde) {
		super();
		Proprietaire = proprietaire;
		this.categorie = categorie;
		this.solde = solde;
	}
	
	
   
}