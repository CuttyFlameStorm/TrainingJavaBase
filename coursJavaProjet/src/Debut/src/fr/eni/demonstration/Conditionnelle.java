/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class Conditionnelle {

	/**
	 * 
	 */
//	public Conditionnelle() {
		
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre ?");
		int premierEntier = scan.nextInt();
		
		int uneValeur = 444;
		
		
		//  ----------Utilisation du IF -------------------
		if (uneValeur == premierEntier) {
			System.out.println("La variable est égale à 444.");	
		}
		
		// ------utilisation du IF / ESLSE --------------------
		
		if (uneValeur == premierEntier) {
			System.out.println("La variable est égale à 444.");	
		} else {
			System.out.println("La variable n'est pas égale à 444");
		}
		
		// -----------Utilisation du IF / ELSE IF ------------------
		
		if (uneValeur == premierEntier) {
			System.out.println("La variable est égale à 444.");	
			} else if(uneValeur == 333){
				System.out.println("La variable n'est pas égale à 444");
				} else if(uneValeur == 555){
						System.out.println("La variable n'est pas égale à 444");
					} else {
							System.out.println("La variable n'est pas égale à 222, ni 333, ni 444, ni 555.");
			
		} 
	
		
		
		/// Etape 4 :Présentation du switch case
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Veuillez saisir un nombre ?");
	int premierEntier2 = scan1.nextInt();
		switch(premierEntier2){
			case 222 : 
				System.out.println("La variable est égale à 222"); 
				break;
			case 444 : 
				System.out.println("La variable est égale à 444"); 
				break;
			default : 
				System.out.println("La variable est différente de 222 et de 444."); 
				break;
			
		}
		
	}

}
