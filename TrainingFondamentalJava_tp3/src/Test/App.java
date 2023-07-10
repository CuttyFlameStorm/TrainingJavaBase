package Test;

import a.b.c.Compte;
import a.b.c.CompteSimple;

public class App {

	public static void main(String[] args) {
		//Compte c = new Compte(1,5000); //on peut pas instancier la class abstraite Compte mais on peut instancer la class Compte simple qui herite de la class Compte et qui peut utiliser directement les attribut protected de sa claas mère.
		Compte c = new CompteSimple(1, 4000, 500);
		System.out.println(c);
		c.verser(5000); // cette ecriture appel la méthode verser de la class Compte
		c.retirer(30000); // cette ecriture fait appel à l'Override de la méthode retirer qui a été redéfini dans la classe CompteSimple.
		

	}

}
