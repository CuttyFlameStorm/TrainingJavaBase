package Application;

import java.util.Date;

import genericite.Couple;

public class App {

	public static void main(String[] args) { // petit exemple de generisité !
		// au moment de l'instanciation de la class generique, on a besoin de savoir le type
		// exemple, on va creer un couple qui contient des objets Integer
		Couple<Integer> c1 = new Couple<Integer>(3,5);
		// si on souhaite creer un Couple de type date, à savoir que le constructor generique de Couple attend a recevoir des Interger, on va ecrire la formule suivante :
		Couple<Date> c2 = new Couple<Date>(new Date(), new Date());
		System.out.println(c1.getA());
		System.out.println(c2.getA());
		System.out.println(c1.getB());
		System.out.println(c2.getB());

	}

}
