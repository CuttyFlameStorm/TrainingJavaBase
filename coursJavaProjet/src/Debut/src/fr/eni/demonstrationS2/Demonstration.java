package fr.eni.demonstrationS2;

public class Demonstration {

	public static void main(String[] args) {
		
		
		// ici on utilise le constructeur 
		// avec paramètre
		Rectangle r = new Rectangle(2.3, 4.5);
		
		System.out.println(r.getAire());
		
		// ici avec le mode public
		// ici on utilise le constructeur 
		//sans paramètre
		// sois le constructeur dit "par Default" 
	/*	Rectangle r2 = new Rectangle();
		r2.largeur = 2.3;
		r2.longueur = 4.5;
		System.out.println(r2.getPerim());
		*/
		
		//ici avec le mode encapsulation.
		// on ecrit de cette manière ci.
		Rectangle r2 = new Rectangle();
		r2.setLargeur(2.4);
		r2.setLongueur(3.9);
		System.out.println(r2.getPerim());
		
		
		Carre c = new Carre(2.3);
		System.out.println("L'aire du carré est " + c.getAire());
		System.out.println("le périmètre du carré est " + c.getPerim());
		
		
		r.printInfo();
		c.printInfo();
		
		System.out.println("dessinable d'un Rectangle : ");
		r.dessiner();
		System.out.println("\nDessinable d'un Carré : ");
		c.dessiner();
		
		
		
		
		
	}

}
