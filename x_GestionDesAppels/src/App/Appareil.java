package App;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Appareil implements IAppareil {
	private List<Contact> contacts = new ArrayList<Contact>();
	private Map<Integer, Appel> appels = new HashMap<Integer, Appel>(); 
	// dans les Map on utilise des objets
	

	@Override
	public void enregistrer(Contact c) {
		contacts.add(c);
		
	}
	
	//un appel sera associé à un contact. on a pas de méthode donc on va utiliser un Foreach.
	@Override
	public void enregistrer(Appel a, String numTel) {
		Contact c1 = null;
		for(Contact c:contacts)
			if(c.getNumeroTel().equals(numTel)) {
				c1 = c;
				break;
			}
		a.setContact(c1);
		//avec Map on utilise "put" pour ajouter.
		// il faudra que le numéro de l'appel soit ajouté au contact
		appels.put(a.getNumero(), a);
		
	}

	@Override
	public Contact consulter(int numero) throws Exception {
		for(Contact c:contacts) {
			if(c.getNumero() == numero)
				return c;
		}
		throw new Exception("Contact " + numero+" Introuvable");
	}

	@Override
	public List<Contact> consulter(String mc) {
		List<Contact> cts = new ArrayList<Contact>();
		for(Contact c:contacts) {
			if(c.getNom().contains(mc))
				cts.add(c);
		}
		return cts;
	}

	//cette methode est un calcul.
	// les appels on les à stocké dans une collection de type Map
	// on va faire une boucle.
	// Map est une collection a 2 valeurs : les clefs et la valeur
	// nous on recherche la valeur associé.
	@Override
	public double coutTotalAppels() {
		double total = 0;
		for(Appel a:appels.values())
			total = total + a.cout(); // ici on a utilisé le polymorphisme
		// si c'est un appel recu, il fait appel à la méthode de cout des appels recus !
		// si c'est un appel émi, il fait appel à la méthode de cout des appels émis !
		return total;
	}

	//le cout d'appel entre 2 date est a peu près la même chose que le coutTotalAppels
	// mais on aura des conditions de Date.
	@Override
	public double coutAppels(Date d1, Date d2) {
		double total = 0;
		for(Appel a:appels.values()) {
			if((a.getDateAppel().getTime()>=d1.getTime())&&(a.getDateAppel().getTime()<=d2.getTime()))   //la methode getTime return un long. c'est un entier qui représente la date.
			total = total + a.cout();
		}
		return total;
	}

	// ici on va chercher le cout d'appels d'un numero de contact.
	@Override
	public double coutAppels(int numero) {
		double total = 0;
		for(Appel a:appels.values()) {
			if(a.getContact().getNumero() == numero)
				total = total + a.cout();
		}
		return total;
	}
	
	// on va a present tester en creant une application.
	
	

}
