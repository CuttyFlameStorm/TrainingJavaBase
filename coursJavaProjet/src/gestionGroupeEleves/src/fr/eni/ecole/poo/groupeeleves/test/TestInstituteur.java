package fr.eni.ecole.poo.groupeeleves.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.eni.ecole.poo.groupeeleves.entite.Eleve;
import fr.eni.ecole.poo.groupeeleves.entite.Instituteur;
import fr.eni.ecole.poo.groupeeleves.entite.Personne;

class TestInstituteur {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nom;
	private String prenom;
	private String adresse;
	private Date ddn;
	

	@BeforeEach
	void setUp() throws ParseException {
		nom = "Professeur Sebastien";
		prenom = "Remi";
		adresse = "31 impasse Bacot 35000 Rennes";
		ddn = sdf.parse("20/05/2010");
		
	}

	@Test
	void testConstructorUsingFields() {
		Instituteur instituteur = new Instituteur(nom, prenom, adresse, ddn);

		assertNotNull(instituteur);
		assertNotNull(nom);
		assertNotNull(prenom);
		assertNotNull(adresse);
		assertNotNull(ddn);
	
		
		assertEquals(nom, instituteur.getNom());
		assertEquals(prenom, instituteur.getPrenom());
		assertEquals(adresse, instituteur.getAdresse());
		assertEquals(ddn, instituteur.getDdn());

	
		

	}

}