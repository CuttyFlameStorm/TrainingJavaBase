package fr.eni.ecole.poo.groupeeleves.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.eni.ecole.poo.groupeeleves.entite.Eleve;
import fr.eni.ecole.poo.groupeeleves.entite.Parent;

class TestEleve {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nom;
	private String prenom;
	private String adresse;
	private Date ddn;
	private Parent referent;

	@BeforeEach
	void setUp() throws ParseException {
		nom = "Duchemin";
		prenom = "Louis";
		adresse = "31 impasse Bacot 35000 Rennes";
		ddn = sdf.parse("24/02/1992");
		referent = new Parent("Duchemin", "Remi", "31 impasse Bacot 35000 Rennes", sdf.parse("24/02/1992"));
	}

	@Test
	void testConstructorUsingFields() {
		Eleve e = new Eleve(nom, prenom, adresse, ddn);

		assertNotNull(e);
		assertNotNull(nom);
		assertNotNull(prenom);
		assertNotNull(adresse);
		assertNotNull(ddn);
		
		assertEquals(nom, e.getNom());
		assertEquals(prenom, e.getPrenom());
		assertEquals(adresse, e.getAdresse());
		assertEquals(ddn, e.getDdn());
	}

	@Test
	void testReferent() {
		Eleve e = new Eleve(nom, prenom, adresse, ddn);
		e.setReferent(referent);

		Parent p_e = e.getReferent();
		assertNotNull(p_e);
		assertNotNull(p_e.getNom());
		assertNotNull(p_e.getPrenom());
		assertNotNull(p_e.getAdresse());
		assertNotNull(p_e.getDdn());

		assertEquals(referent.getNom(), p_e.getNom());
		assertEquals(referent.getPrenom(), p_e.getPrenom());
		assertEquals(referent.getAdresse(), p_e.getAdresse());
		assertEquals(referent.getDdn(), p_e.getDdn());
	}
	
	@Test
	void testComparaisonSiokEgal0() { 
		Eleve e = new Eleve(nom, prenom, adresse, ddn);
		assertEquals(0, e.getNom().compareTo(e.getNom()));
	}
	 
   
}
