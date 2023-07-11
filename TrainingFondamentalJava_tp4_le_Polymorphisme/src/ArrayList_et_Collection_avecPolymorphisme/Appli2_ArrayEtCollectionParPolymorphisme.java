package ArrayList_et_Collection_avecPolymorphisme;

import java.util.ArrayList;

import polimorphisme.Fruit;
import polimorphisme.Orange;
import polimorphisme.Pomme;

public class Appli2_ArrayEtCollectionParPolymorphisme {

	public static void main(String[] args) {
		System.out.println("activation de Appli2\n");
		// ** utilisation d'une Arrays liste qui ne nécessite pas d'être défini en nombre de ligne au depart
		//Exemple :
		System.out.println("méthode de création de la collection ArrayList");
		System.out.println("ArrayList<Fruit> fruits = new ArrayList<Fruit>();");
		//On utilise les ArrayList différemment d'un tableau standard.
		ArrayList<Fruit> fruits = new ArrayList<Fruit>();
//		on utilise aujourd'hui les collections generiques
		fruits.add(new Pomme(60));
		fruits.add(new Orange(90));
		fruits.add(new Pomme(80));
		fruits.add(new Pomme(70));
		fruits.remove(0);  // voici un exemple de suppression. -> cela supprimera la ligne 0.
		fruits.add(new Orange(95));
		//voila la ArrayList est créé et peut avoir autant d'aujout de ligne que souhaité.
		
		System.out.println("\n Voici les méthodes d'itération classique avec ArrayList");
		System.out.println("for(int i=0;i<fruits.size();i++){}");
//		voila la méthode classique d'itération avec les ArrayList
		for(int i=0;i<fruits.size();i++) { // ici "fruits.size()" remplace "fruits.length" comme pour les tableaux standardx.
			fruits.get(i).affiche(); // affichera c'est une pomme ou une orange.
			// pour acceder à un élément on utilise la méthode "fruits.get(i)"
			
		}
		System.out.println("\n Voila la méthode moderne d'itération d'une collection");
		System.out.println("for(Fruit f:fruits){}");
//		voila le nouceau modèle de boucle d'iteration avec les ArraysList
		for(Fruit f:fruits) { // cela ressemble au foreach
			f.affiche();
			f.affichePoids();
		}
		                         
		

	}

}
