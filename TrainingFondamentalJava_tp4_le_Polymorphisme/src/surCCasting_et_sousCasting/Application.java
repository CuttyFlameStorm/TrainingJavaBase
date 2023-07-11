package surCCasting_et_sousCasting;


import polimorphisme.Fruit;
import polimorphisme.Orange;
import polimorphisme.Pomme;

public class Application {

	public static void main(String[] args) {
		System.out.println("activation de Application 1");
		System.out.println("\n instace de Pomme et orange, \non peut acceder directement aux méthodes des différente instance filles \ncar il n'y a pas eu de SUR-CASTING");
		Pomme p = new Pomme(40);
		p.affichePoids();
		Orange o = new Orange(50);
		o.affichePoids();
		
		System.out.println("\n SUR-CASTING de class");
		Fruit f = new Pomme(50); // ceci est un "SUR-CASTING" implicite !  de class.
		Fruit f2 = (Fruit) new Orange(50); // ceci est appelé un SUR-CASTING explicite! de class.
		// les 2 mode d'ecriture sont identique.
		// ** mais après un SUR-CASTING, si on a besoin 
		// d'aller chercher une méthode de la class Pomme :
		// il faudra effectuer un " SOUS-CASTING" !
		// exemple il faut le faire comme ceci:
		System.out.println("\nSOUS-CASTING de class pour afficher une méthode \nqui se trouve uniquement dans la classe fille après avoir effectué un SUR-CASTING");
		((Pomme)f).affichePoids();  //la méthode affichePoids() ne se trouve pas dans la class abstraite Fruit. donc il faut aller chercher la méthode qui se trouve dans la claas Pomme de cette faocon.
		// ceci est appelé un SOUS-CASTING !
		((Orange)f2).affichePoids();
		f.affiche();
		f2.affiche(); // le phenomene du let binding à compris que nous souhaiton la méthode de Orange , cela fonctionne car la méthode existe dans Fruits, donc il y a un SOUS-CASTING qui s'effectue implictement. Le polymorphisme s'applique avec le LET BIDING lorsque la méthode existe aussi dans la classe abstraite.
		System.out.println("\n\n creation du tableau à 4 lignes !");
		
		//autre exemple avec un tableau :
		//declaration d'un tableau de Fruit :
		Fruit[]fruits = new Fruit[4];  // avec cette méthode on doit définir à l'avance le nombre de ligne du tableau.
		fruits[0] = new Pomme(50);  // ici rappel de SUR-CASTING implicite !
		fruits[1] = (Fruit) new Orange(60); //ici le SUR CASTING est explicite !
		fruits[2] = new Pomme(90);
		fruits[3] = new Orange(100);
		//utiiisons l'ancienne méthode d'itération
		System.out.println("\n\n itération avec l'ancienne méthode FOR et usage de instanceOF");
		for(int i=0;i<fruits.length;i++) {
			fruits[i].affiche();
			if(fruits[i] instanceof Pomme)
				((Pomme)fruits[i]).affichePoids();
			else if(fruits[i] instanceof Orange)
				((Orange)fruits[i]).affichePoids();
			//on observe que les vérifications effectuer avec "instanceof" seront FASTIDIEUSE
			//c'est pourquoi il est préférable de reconcevoir ses classes abstraite
			//afin de définir les méthodes dans la classe mère.
		}
		System.out.println("\n\n Utilisation de l'ancienne méthode FOR sans le instanceOf \naprès avoir défini la méthode abstraite nécessaire \ndans la class Abstraite Fruit");
		// après avoir redefini la méthode abstraite dans la class abstraite Fruit 
		//voici un nouvel exemple :
		for(int i=0;i<fruits.length;i++) {
			fruits[i].affiche();
			fruits[i].affichePoids();
		}
		
		
	
		

	}

}
