/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class Cuisson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Afficher le temps de cuisson d’une viande en 
		 * fonction du type de la viande,
		 * du mode de cuisson et du poids
		 * de la viande saisie par l’utilisateur :
		 * 
		 */
		
		////// BLOCK DES VARIABLES LOCALES ////////
		
		// -- boeuf --
		double timeCuissonBoeufBleu 		//variable : time of cook for 1g/minute.
				= (double)10/500;  
		double timeCuissonBoeufApoint 		//variable : time of cook for 1g/minute.
				= (double)17/500;
		double timeCuissonBoeufBiencuit 	//variable : time of cook for 1g/minute.
				= (double)25/500;
		
		// -- Porc --
		double timeCuissonPorcBleu 			//variable : time of cook for 1g/minute.
				= (double)15/400;
		double timeCuissonPorcApoint 		//variable : time of cook for 1g/minute.
				= (double)25/400;
		double timeCuissonPorcBiencuit 		//variable : time of cook for 1g/minute.
				= (double)40/400;
		
		
		// ------ l'affichage CONSOLE and data recording ------------//
		Scanner scan = new Scanner(System.in); //use tool scanner from Util.
		
		System.out.println("Indiquez votre choix de viande : \"BOEUF\" ou \"PORC\" ?");
		String typeViande = scan.nextLine().toUpperCase();  // Note : ceci permet de convertir en MAJ
		System.out.println("Indiquez votre mode de cuisson : \"BLEU\" ou \"A POINT\" ou \"BIEN CUIT\" ?");
		String modeCuisson = scan.nextLine().toUpperCase();
		System.out.println("Indiquez le poid de votre viande en grammes : ");
		double poidViande = scan.nextFloat();
		scan.close();  //important!	=> *close scanner* to avoid to use memory processor not necessary
		
		//---- Le CONDITIONNEL ------//
		if (typeViande.equals("BOEUF")) {
			if (modeCuisson.equals("BLEU")) {
				System.out.println(timeCuissonBoeufBleu * poidViande + " minutes est necessaire pour la cuission soit : " + timeCuissonBoeufBleu * poidViande * 60+ " secondes d'attentes" );				
			} else if (modeCuisson.equals("A POINT")) {
				System.out.println(timeCuissonBoeufApoint * poidViande + " minutes est necessaire pour la cuission soit : " + timeCuissonBoeufApoint * poidViande * 60 + " secondes d'attentes" );				
			} else if (modeCuisson.equals("BIEN CUIT")) {
				System.out.println(timeCuissonBoeufBiencuit * poidViande + " minutes est necessaire pour la cuission soit : " + timeCuissonBoeufBiencuit * poidViande * 60 + " secondes d'attentes" );				
			}
		} else if(typeViande.equals("PORC")){
			if (modeCuisson.equals("BLEU")) {
				System.out.println(timeCuissonPorcBleu * poidViande + " minutes est necessaire pour la cuission soit : " + timeCuissonPorcBleu * poidViande * 60 + " secondes d'attentes" );				
			}else if (modeCuisson.equals("A POINT")) {
				System.out.println(timeCuissonPorcApoint * poidViande + " minutes est necessaire pour la cuission soit : " + timeCuissonPorcApoint * poidViande * 60 + " secondes d'attentes" );				
			} else if (modeCuisson.equals("BIEN CUIT")) {
				System.out.println(timeCuissonPorcBiencuit * poidViande + " minutes est necessaire pour la cuission soit : " + timeCuissonPorcBiencuit * poidViande * 60 + " secondes d'attentes" );				
			}
		}	
		//---------fin de l'application-----------//
		
	} // ----- Fin de la Methode main --------- //

}  // -------- Fin de la class Cuisson--------- //
