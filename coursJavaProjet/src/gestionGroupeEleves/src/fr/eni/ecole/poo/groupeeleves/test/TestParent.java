package fr.eni.ecole.poo.groupeeleves.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.eni.ecole.poo.groupeeleves.entite.Instituteur;
import fr.eni.ecole.poo.groupeeleves.entite.Parent;
import fr.eni.ecole.poo.groupeeleves.entite.Personne;

class TestParent {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nom;
	private String prenom;
	private String adresse;
	private Date ddn;
	

	@BeforeEach
	void setUp() throws ParseException {
		nom = "MamanDeJulien";
		prenom = "Rosalie";
		adresse = "35 chemin des pluie torrentiel";
		ddn = sdf.parse("15/06/1982");
		
	}

	@Test
	void testConstructorUsingFields() {
		Parent parent = new Parent(nom, prenom, adresse, ddn);

		assertNotNull(parent);
		assertNotNull(nom);
		assertNotNull(prenom);
		assertNotNull(adresse);
		assertNotNull(ddn);
	
		
		assertEquals(nom, parent.getNom());
		assertEquals(prenom, parent.getPrenom());
		assertEquals(adresse, parent.getAdresse());
		assertEquals(ddn, parent.getDdn());

	}
	

}