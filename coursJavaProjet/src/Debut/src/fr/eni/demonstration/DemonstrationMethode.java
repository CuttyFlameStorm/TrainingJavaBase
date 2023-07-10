/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class DemonstrationMethode {
	
	public static void afficherInfos(String message) {
		System.out.println("#################################################################");
		System.out.println(message);
		System.out.println("#################################################################");
	}  // fin de la fonction afficherInfos
	
	public static void afficherBonjour(String message, String message2) {
		afficherInfos(message + " " + message2);
		for (int i = 0; i < 10; i++) {
			System.out.println(message2);
		}
	}   // fin de la fonction afficherBonjour
	
	public static void afficherNombrePair(int nbre) {
		System.out.printf("Affichage des %d premiers nombres pairs.\n", nbre);
		int compteur = 0;
		int i = 0;
		
		while(compteur != nbre) {
			if(i % 2 == 0) {
				System.out.println(i);
				compteur++;
			}
			i++;
		}
	}  // fin de la fonction afficherNombrePair
	
		
	public static void afficherCouleur(String couleur1, String couleur2, String couleur3, String couleur4) {
		afficherInfos("Affichage des couleurs choisies :");
		System.out.println(couleur1);
		System.out.println(couleur2);
		System.out.println(couleur3);
		System.out.println(couleur4);
		
	}  // fin de la fonction afficherCouleur
		
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		afficherInfos("Bienvenue dans cette demonstration sur les fonctions et paramètres");
		afficherInfos("Demande de saisie d'un entier à un utilisateur");
		
		System.out.println("Veuillez faire un choix ");
		System.out.println("1 -Afficher 10 fois bonjour.");
		System.out.println("2 -Afficher les 10 premiers nombres pairs.");
		System.out.println("3 -Afficher des couleurs");
		System.out.println("Veuillezfaire un choix : ");
		
		Scanner scan = new Scanner(System.in);
		int saisie = scan.nextInt();
		
		if(saisie == 1) {
			String message = "affichage de 10 fois";
			String message2 = "Bonjour";
			afficherBonjour(message,message2);
		}
		if(saisie == 2) {
			int nbre = 10;
			afficherNombrePair(nbre);
		}
		if(saisie == 3) {
			String couleur1 = "VERT";
			String couleur2 = "JAUNE";
			String couleur3 = "BLEU";
			String couleur4 = "ROUGE";
			afficherCouleur(couleur1,couleur2,couleur3,couleur4);
		}
		
		scan.close();
		
	}


}
