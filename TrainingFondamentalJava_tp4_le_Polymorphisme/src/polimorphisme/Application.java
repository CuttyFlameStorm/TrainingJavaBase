package polimorphisme;

public class Application {

	public static void main(String[] args) {
		Pomme p = new Pomme(40);
		Orange o = new Orange(50);
		
		Fruit f = new Pomme(50); // ceci est un "SUR-CASTING" implicite !  de class.
		Fruit f2 = (Fruit) new Orange(50); // ceci est appelé un SUR-CASTING explicite! de class.
		// les 2 mode d'ecriture sont identique.
		// ** mais après un SUR-CASTING, si on a besoin 
		// d'aller chercher une méthode de la class Pomme :
		// il faudra effectuer un " SOUS-CASTING" !
		// exemple il faut le faire comme ceci:
		((Pomme)f).affichePoids();  //la méthode affichePoids() ne se trouve pas dans la class abstraite Fruit. donc il faut aller chercher la méthode qui se trouve dans la claas Pomme de cette faocon.
		// ceci est appelé un SOUS-CASTING !
		((Orange)f2).affichePoids();
		

	}

}
