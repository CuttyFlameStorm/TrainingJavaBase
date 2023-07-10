package fr.eni.ecole.poo.groupeeleves.entite;

import java.util.Date;
import java.util.List;



public class Eleve extends Personne implements Comparable<Eleve>{
	private Parent referent;
 
	public Eleve() {
		super();
	}

	public Eleve(String nom, String prenom, String adresse, Date ddn) {
		super(nom, prenom, adresse, ddn);
		
	}
 
	public Parent getReferent() {
		return referent;
	}

	public void setReferent(Parent referent) {
		this.referent = referent;
	}

	@Override
	public String toString() {
		return "Eleve [referent=" + referent + "]";
	}
	
	
	@Override
	public int compareTo(Eleve e) {
		
		return this.getNom().compareTo(e.getNom()); 
	}



}
