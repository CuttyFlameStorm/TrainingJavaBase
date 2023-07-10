/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class BulletinSimple {

	/**
	 * @param <Function>
	 * @param args
	 */
	public static void main(String[] args) {

	/* 			-------- Demande client --------- 
		 * Rédiger le programme 
		 * qui permet de calculer et d'afficher 
		 * le bulletin de salaire simplifié
		 * d'un EMPLOYEE
		 * 		
				------- INFORMATION OBLIGATOIRE ----------- 	
		 * 	
		 * nom, 
		 * prénom, 
		 * statut (cadre, agent de maîtrise, employé de bureau)
		 * il le mentionner sur le bulletin de salaire	
		 * 
		 		------- Mode emploi de l'application ---- 
		 * 
		 * L'utilisateur doit saisir : le nom, le prénom, le statut
		 * + le nombre d'heures effectuées par l'employé.
		 *
		
		
 					*** DECLARATION DES VARIABLES LOCALES ****  */  

//       		  ----------------- info employé -> sera renseigner par scanner -------------------------
		String nomEmployee;
		String prenomEmployee;
		String statutEmployee;
		double nbreHeureTrav;
		int nombreEnfant;
       
//	 		  -------- BLOCK DES TAUX HORAIRES APPLICATIFS [en 2023] ------------		
		final double TAUXHB1 = 28.3; // taux horaire de base CADRE 
		final double TAUXHB2 = 16.39; // taux horaire de base agent maitrise
		final double TAUXHB3 = 10.25; // taux horaire de base employé bureau
		double tHB; // variable contain the good affectation of "taux horaire" from conditionnelle
		


		//----------------------------------------WELCOME PAGE APPLICATION--------------------------------//
		System.out.println("");
		System.out.println("                            Bienvue dans l'application ");
		System.out.println("                              \"SIMPLE BULLETIN APP\" ");
		System.out.println("    		   qui va vous générer une fiche de paie simplifié \n \n");
		System.out.println("                --> Appuyer sur la touche [Entrer]  pour commencer");
		Scanner scan = new Scanner(System.in);
		String waitForStart = scan.nextLine();  // touche activation pour démarrage application
		
		//----------------------------------- demarrage ---------------------------------------------------//
		if (waitForStart.equals("") == false) {
			scan.close();
			System.out.println("-- Fiche de paie en création ANNULEE -- VOUS N'AVEZ PAS SUIVI LES INSTRUCTION ");
			System.out.println("--> ..merci de redémarrer l'application.. <--");
			return;
		} else {
			System.out.println("Création de bulletin en cours .. \n \n \n");
			// ------FIRSTNAME--------------------------   //
			System.out.println("en attente de saise.. ");
			System.out.println("[NOM de l'employé] : \n \n");			
			nomEmployee = scan.nextLine().toUpperCase();
			// ------last Name---------- //
			System.out.println("en attente de saise.. ");
			System.out.println("[Prénom de l'employé] : \n \n");
			prenomEmployee = scan.nextLine().toUpperCase();
			// -------STATUT-------- //
			System.out.println("en attente de saise.. ");
			System.out.println("[Statut de l'employé] : ");
			System.out.println(".. ");
			System.out.println("Tapez [1] si \"cadre\" ");
			System.out.println("Tapez [2] si \"agent de maîtrise\" ");
			System.out.println("Tapez [3] si \"employé de bureau\" ");
			int tempory = scan.nextInt();
			if (tempory == 1 ) {
				statutEmployee = "CADRE";
				tHB = TAUXHB1;
			} else if (tempory == 2) {
				statutEmployee = "AGENT DE MAITRISE";
				tHB = TAUXHB2;
			} else if (tempory == 3) {
				statutEmployee = "EMPLOYEE DE BUREAU";
				tHB = TAUXHB3;
			} else {	
				System.out.println("-- ATTENTION LE CHOIX DU STATUT EST OBLIGATOIRE --");
				System.out.println("Derniere tentative avant ANNULATION de création \n \n");
				System.out.println("en attente de saise.. ");
				System.out.println("[Statut de l'employé] : ");
				System.out.println(".. ");
				System.out.println("Tapez [1] si \"cadre\" ");
				System.out.println("Tapez [2] si \"agent de maîtrise\" ");
				System.out.println("Tapez [3] si \"employé de bureau\" ");
				int tempory2 = scan.nextInt();
				if (tempory2 == 1) {
					statutEmployee = "CADRE";
					tHB = TAUXHB1;
				} else if (tempory2 == 2) {
					statutEmployee = "AGENT DE MAITRISE";
					tHB = TAUXHB2;
				} else if (tempory2 == 3) {
					statutEmployee = "EMPLOYEE DE BUREAU";
					tHB = TAUXHB3;
				} else {
					System.out.println("ANNULATION de la fiche de paie pour erreur de saisie");
					scan.close();
					return;
				}	
			}
			
			// ------ CALCUL DU SALAIRE DE BASE ------ //
			System.out.println("");
			System.out.println("en attente de saise.. \n \n");
			System.out.println("[Nombre d'heure travaillé] dans le mois \n \n");
			nbreHeureTrav = scan.nextDouble();
			double salaireMensuelBrut;
			if ((nbreHeureTrav > 0) && (nbreHeureTrav <169)) {
				salaireMensuelBrut = nbreHeureTrav * tHB;
			} else if ((nbreHeureTrav >= 169) && (nbreHeureTrav <=180)) {
				salaireMensuelBrut = nbreHeureTrav * (tHB*1.5);
			} else if (nbreHeureTrav > 180 ) {
				salaireMensuelBrut = nbreHeureTrav * (tHB*1.6);
			} else {
				salaireMensuelBrut = 0.00;
			}
			
			// --------------------- prime --------------------//
			System.out.println("\n \n");
			System.out.println("Combien l'employée a-t-il d'enfant ? \n");
			nombreEnfant = scan.nextInt();
			double prime;
			if (nombreEnfant == 1){
				prime = 20;
			} else if (nombreEnfant == 2) {
				prime = 50;
			} else if (nombreEnfant == 0) {
				System.out.println("pas de prime enfant");
				prime = 0;
			} else {
				prime = 70 + 20*(nombreEnfant-2);
			}
						
		//			 --------  BLOCK cotisation en fonction de leur pourcentage---------//
		double salaireMensuelBrutHorsCharge = salaireMensuelBrut - (23/100)* salaireMensuelBrut;
		double cotisationCRDSCSGI = salaireMensuelBrutHorsCharge * 0.0349;
		double cotisationCSGNI = salaireMensuelBrutHorsCharge * 0.0615;
		double cotisationAssuranceMaladie = salaireMensuelBrutHorsCharge * 0.0095;
		double cotisationAssuranceVieillesse = salaireMensuelBrutHorsCharge * 0.0844;
		double cotisationAssuranceChomage = salaireMensuelBrutHorsCharge * 0.0305;
		double cotisationIRCEM = salaireMensuelBrutHorsCharge * 0.0381;
		double cotisationAGFF = salaireMensuelBrutHorsCharge * 0.0102;    
		double totalDesCotisations = cotisationCRDSCSGI + cotisationCSGNI + cotisationAssuranceMaladie + cotisationAssuranceVieillesse + cotisationAssuranceChomage + cotisationIRCEM + cotisationAGFF;
				
			//	  		  -------- BLOCK REMUNERATION NET ------------		
		double RemunerationNetHorsCotisation = salaireMensuelBrut - totalDesCotisations + prime;
			
			
			//------------------ TEMPLATE of BULLETIN DE PAIE automatisé ------------- //
			String waitForStart9;
			Scanner scan2 = new Scanner(System.in);
			System.out.println("");
			System.out.printf(" pour Imprimer le bulletin de %s %s : appuyer de nouveau sur \"ENTRER\" \n ", nomEmployee,prenomEmployee);
			waitForStart9 = scan2.nextLine();
			scan2.close();
			if (waitForStart9.equals("") == true) {
				System.out.println(waitForStart9 + "\n");
				System.out.println("                  [[[ Voici la fiche de paie ]]]");
				System.out.println(" _______________________________________________\n|                                               |");
				System.out.printf("|  %s %s \n", nomEmployee,prenomEmployee);
				System.out.printf("|  Salaire de base  :             € %.2f \n|  %s \n",salaireMensuelBrut, statutEmployee);
				System.out.println("|                                               |");
				System.out.println("|  Détails des cotisations : ");
				System.out.printf("|  [CRDS&CSGI] :                  € %.2f \n|", cotisationCRDSCSGI);
				System.out.printf("  [CSGnI] :                      € %.2f \n|", cotisationCSGNI);
				System.out.printf("  [Assurance maladie] :          € %.2f \n|", cotisationAssuranceMaladie);
				System.out.printf("  [Assurance vieillesse] :       € %.2f \n|", cotisationAssuranceVieillesse);
				System.out.printf("  [Assurance chômage] :          € %.2f \n|", cotisationAssuranceChomage);
				System.out.printf("  [IRCEM] :                      € %.2f \n|", cotisationIRCEM);
				System.out.printf("  [Cotisation AGFF] :            € %.2f \n|", cotisationAGFF);
				System.out.printf("  Total Cotisation :             € %.2f \n|", totalDesCotisations);
				System.out.printf("  prime enfant :                 € %.2f \n| \n|", prime);
				System.out.printf("  Rémunération Net hors charge:  € %.2f \n|", RemunerationNetHorsCotisation);
				System.out.println("  effectué par virement automatique");
				System.out.println("|_______________________________________________|");
				scan.close();
			}
			else {
				System.out.println("ANNULATION");
				return;
				// -------  FIN DE L'APPLICATION -----------  //
			}
		}
	}
}
			

















