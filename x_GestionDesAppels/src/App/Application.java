package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Application {

	public static void main(String[] args) throws ParseException {
		IAppareil appareil = new Appareil();
		appareil.enregistrer(new Contact(1,"c1","06612345"));
		appareil.enregistrer(new Contact(2,"c2","06612449"));
		appareil.enregistrer(new AppelEmi(1,new Date(), 66), "06612345");
		appareil.enregistrer(new AppelEmi(2,new Date(), 125), "06612345");
		appareil.enregistrer(new AppelEmi(3,new Date(), 122), "06612449");
		appareil.enregistrer(new AppelRecu(4,new Date(), 98), "06612345");
		System.out.println("----------------------------");
		System.out.println("Consulter un appel sachant son numéro");
		
		
		try {
			Contact c = appareil.consulter(1);
			System.out.println("Num = " +c.getNumero());
			System.out.println("Nom = " +c.getNom());
			System.out.println("Tel = " +c.getNumeroTel());
		} catch (Exception e) {
			System.out.println(e.getMessage()); // retournera le message de l'exception.
		}
		System.out.println("---------------------------");
		System.out.println("Consulter les contacts par mot clé : ");
		List<Contact> contacts = appareil.consulter("C");
		for(Contact c:contacts) {
			System.out.println("****************************");
			System.out.println("Nom : " + c.getNom());
			System.out.println("Tel : " +c.getNumeroTel());
		}
		
		System.out.println("--------------------------");
		System.out.println("Consulter le coût total des appels");
		System.out.println("Coût total : " +appareil.coutTotalAppels());
		
		System.out.println("-----------------------");
		System.out.println("Consulter le coût appels d'un contact :");
		System.out.println("Coût total : " +appareil.coutAppels(1));
		
		System.out.println("-----------------------");
		System.out.println("Consulter le coût appels entre deux dates :");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("11/12/2014");  // creer une date a partir d'une chaine de caratere en utilisant SimpleDateFormat. // mais cela genere une Exception, alors il faudra faire soit un try Catch soit un Throws
		Date d2 = sdf.parse("12/12/2015");
		System.out.println("Coût : " +appareil.coutAppels(d1,d2));
		
	}

}







