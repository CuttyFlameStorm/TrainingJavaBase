package Application;


import genericite.Triplet2;

public class App2 {

	public static void main(String[] args) {
		// Quand on veut instancié un genrique il faut spécifier tout les types
		//Triplet2<T,T2>  -> attention son constructeur attend 3 paramètre !
		Triplet2<String, Double> o = new Triplet2<String, Double>("A","B", 7.3);
		System.out.println(o.getA());
		System.out.println(o.getB());
		System.out.println(o.getC()); // il c'est ici que c'est un double car on lui a infiqué le type .

	}

}
