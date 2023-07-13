package methodeGenerique_dansUneClasseStandard;

public class App3 {

	public static void main(String[] args) {
		Calcul2<String> c = new Calcul2<String>();
		double a = 8.9;
		double b = 9.5;
		System.out.println(c.comparer(a, b)); // resultat attendu est "false"
		
		String x = "azerty";
		String y = "azerty";
		
		System.out.println(c.comparer(x, y)); // resultat attendu est "true"
		
		// il n'y a que la genericité qui permet d'utliser une classe pour comparer plusieurs
		// type différents !
		// on peut egalement effectuer des surcharge de methode.
		
		Produit p1 = new Produit();
		Produit p2 = new Produit();
		
		System.out.println(c.comparer(p1, p2));
		
		
		
		
		
		
		
	}

}
