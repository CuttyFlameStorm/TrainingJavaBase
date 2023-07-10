package fr.eni.demonstrationS2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demonstration2 {


	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2.3, 4.5);
		Carre c = new Carre(2.3);
		Rectangle r2 = new Rectangle(2.0, 3.0);
		Carre c2 = new Carre(5.0);
		Carre c3 = new Carre(7.2);
		
		
		List<Rectangle> lst = new ArrayList<Rectangle>();
		System.out.println(lst.size());
		
		lst.add(r);
		lst.add(c);
		lst.add(r2);
		lst.add(c2);
		lst.add(c3);
		
		System.out.println(lst.size());
		
		Rectangle trouve = lst.get(0);
		trouve.printInfo();
		//------------------------  exemple 1
		System.out.println("\nPARCOURS DE LA LISTE");
		for (Rectangle forme : lst) {
			forme.printInfo();
		};
		
		lst.remove(c2);  // il s'agit de la méthode remove.
		
		//------------------------  exemple 2
		System.out.println("\nPARCOURS DES CARRES");
		for (Rectangle forme :lst) {
			if (forme instanceof Carre) {
				forme.printInfo();
			}
		}
		//------------------------  exemple 3
	
		/*utilisation du triage avec la classe collection*/
		Collections.sort(lst);
		
		System.out.println("\nPARCOURS DE LA LISTE APRES LE TRI");
		for (Rectangle forme : lst) {
			forme.printInfo();
		}

	}

}
