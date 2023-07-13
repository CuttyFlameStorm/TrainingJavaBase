package Application;


import java.util.Date;

import genericite.Triplet2;

public class App2 {

	public static void main(String[] args) {
		// Quand on veut instancié un genrique il faut spécifier tout les types
		//Triplet2<T,T2>  -> attention son constructeur attend 3 paramètre !
		Triplet2<String, Double> o = new Triplet2<String, Double>("A","B", 7.3);
		System.out.println(o.getA());
		System.out.println(o.getB());
		System.out.println(o.getC()); // il c'est ici que c'est un double car on lui a infiqué le type .
		//on utilise les class generique lorsqu'on sait qu'on va pas toujours utiliser les meme types de données.
		// autre exemple:
		Triplet2<Date, Float> o2 = new Triplet2<Date, Float>(new Date(), new Date(), (float)7);
		// il faut penser a faire aussi des SOUS-CASTING car sinon il prendrai le 7 pour un int
		// c'est le problème de l'auto-Boxing.
		/* Explication :
		 * 
		 * En Java, l'autoboxing est un mécanisme qui permet 
		 * la conversion automatique entre les types primitifs et les types wrappers
		 * (ou classes enveloppantes) correspondantes.
		 * Les tupes primitifs en Java inciuent des tupes tels que "int" , "float", "double", etc..
		 * tandis que les types "wrappers" sont des classes qui encapsulent ces types primitifs,
		 * tels que Integer, Float, Double, etc...
		 * 
		 * L'autoBoxing se produit lorsque vous affectez une valeur d'un type primitif
		 * à une variable de type wrapper correspondant, ou lorsque vous utilisez 
		 * un type primitif comme argument dans un contexte qui attend un type wrapper.
		 * De même, un mécanisme similaire appelé "unboxing" se produit lorsque vous assignez
		 * une valeur d'un type wrapper à une variable de type primitif correspondant, 
		 * ou lorsque vous utilisez un type wrapper comme argument dans un contexte
		 * qui attend un type primitif.
		 * 
		 * voivi un exemple pour illustrer l'autoboxing en Java :
		 * 
		 * 
		 * 	int primitiveInt = 10;  // déclaration d'une variable de type primitif int
			Integer wrapperInt;    // déclaration d'une variable de type wrapper Integer
			wrapperInt = primitiveInt; // autoboxing, la valeur int est automatiquement convertie en Integer
			System.out.println(wrapperInt); // affiche "10"
 			wrapperInt = new Integer(20); // création d'un objet Integer à partir d'une valeur littérale
			int unboxedInt = wrapperInt; // unboxing, la valeur Integer est automatiquement convertie en int
			System.out.println(unboxedInt); // affiche "20"

		 * 
		 * -> L'autoboxing facilite la manipulation des types primitifs dans des contextes
		 * où les types wrappers sont requis, tels que les collections génériques,
		 * les algorythmes d'auto-optimisation et certaines API Java.
		 * Cela permet également de réduire la complexité du code en évitant les conversions
		 * manuelles entre types primitifs et types wrappers.
		 * 
		 * 
		 * */
		
		//reprenons
		System.out.println(o2.getA());
		System.out.println(o2.getB());
		System.out.println(o2.getC());
		
		
	}

}
