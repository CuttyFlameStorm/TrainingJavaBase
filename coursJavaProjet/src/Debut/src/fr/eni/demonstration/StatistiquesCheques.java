/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class StatistiquesCheques {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* -------- Enoncé
		 * 
		 * Application doit demander pour chaque chèque :
		 * le numéro du chèque
		 * son montant
		 * 
		 * si l'utilisateur saisie la valeur 0
		 * cela signifie
		 * qu'il n'y a plus aucun chèque à saisir
		 * et l'appli affiche un extracte des données
		 * selon les spécificités demandées
		 * 
		 */
		
		/* --------- Spécificité demandé à l'affichage 
		 * LE PROGRAMME DOIT AFFICHER :
		 * 
		 * [le nombre de chèques introduits]
		 * [le montant total des chèques]
		 * [la moyenne des montants]
		 * [le nombre de chèques dont le montant est < à 200 €]
		 * [le montant total de ces chèques]
		 * [le nombre de chèques dont le montant est > ou égal à 200 €]
		 * [le montant total de ces chèques]
		 * [le numéro du chèque dont le montant est le plus petit]
		 * [le montant de ce chèque]
		 * [le numéro du chèque dont le montant est le plus grand]
		 * [le montant de ce chèque]
		 * 
		 */
		
		
		// ---------------------------   Welcome page -------------------------------- //
		System.out.println("\n\n Bonjour, Bienvenue dans l'application \"STATISTIQUE CHEQUE\" ");
		System.out.println("\n\n     => Avez-vous des chèques actuellement à enregistrer ? \n     tapez : [1] pour valider \n     sinon l'application se fermera  ");
		// ---------------------------   Variable instruction text ------------------- //
		String indicToDO = "Veuillez [saisir le numéro du chèque] à introduire : \n";
		String indicFinisHenterCheque = "\n sinon Tapez la touche ZERO [0] pour terminer l'application";
		String applicationTurningOff = "Application Closed";
		// ---------------------------  Demarrage Application if on ----------  //
		Scanner scan = new Scanner(System.in);
		String tapeForStart = scan.nextLine();
		if (tapeForStart.equals("1") == false) {
			scan.close();
			System.out.println(applicationTurningOff);
			return; // fin de l'application
		}
		// ------------------- Continue with Application ------------------- //
		// ---- Initialisation des variables ---  //
		double pivotSerialCheque;
		double ChequeMinNew = 200;
		double ChequeMontantBigNew = 199;
		int chequeRecord;
		int i = 0;
		
		int nbci_NombreChequeIntroduits = 0;
		double nbci_ValeurTotal = 0;
		double nbci_Moyenne = 0;
		int ncmi200_NombreChequeMontantInf200 = 0;
		double ncmi200_ValeurTotal = 0;
		int ncmsoe200_NombreChequeMontantSupOuEgale200 = 0;
		double ncmsoe200_ValeurTotal = 0;
		double tmlcs_TheMostLittleCheckSerial = 0;
		double tmlcs_Montant = 0;
		double nobcs_NumOfBigerCheckSerial = 0;
		double nobcs_Montant = 0;
		double d = 1;
		
		//---Bouclage 
		do {
			System.out.println(indicToDO + indicFinisHenterCheque);
			chequeRecord = scan.nextInt();
			if(chequeRecord == 0) {
				if (nbci_NombreChequeIntroduits == 0)
				{
					scan.close();
					System.out.println(applicationTurningOff);
					return; // fin de l'application
				}
				
				// --------------------------- Template affichage final ------------------------ //
				System.out.println("----------------------STATISTIQUES------------------------------------------------");
				System.out.println("\nle nombre de chèques introduits est de : " + nbci_NombreChequeIntroduits);
				System.out.println("le montant total des chèques : " + nbci_ValeurTotal + " €");
				System.out.println("la moyenne des montants : " + (float)nbci_Moyenne + " €");
				System.out.println("le nombre de chèques dont le montant est < à 200 € : " + ncmi200_NombreChequeMontantInf200 + " et le montant total de ces chèques est de : " + ncmi200_ValeurTotal + " €");
				System.out.println("le nombre de chèques dont le montant est > ou égal à 200 € : " + ncmsoe200_NombreChequeMontantSupOuEgale200 + " et le montant total de ces chèques est : " + ncmsoe200_ValeurTotal + " €");
				System.out.println("le numéro du chèque dont le montant est le plus petit : " + tmlcs_TheMostLittleCheckSerial + " et son montant est de : " + tmlcs_Montant + " €");
				System.out.println("le numéro du chèque dont le montant est le plus grand : " + nobcs_NumOfBigerCheckSerial + " et son montant est de : " + nobcs_Montant + " €");
				System.out.println("----------------------------------------------------------------------------------");

				// ------------------------------------------------------------------------------//
				
				scan.close();
				System.out.println(applicationTurningOff);
				return; // fin de l'application
			}
			System.out.println("Veuillez indiquer le montant de ce chèque : ");
			double MontantNewsRecord = scan.nextDouble();
			i--;
			nbci_NombreChequeIntroduits++;
			pivotSerialCheque = (double)chequeRecord;
			nbci_ValeurTotal =  (double)MontantNewsRecord + nbci_ValeurTotal;
			nbci_Moyenne = nbci_ValeurTotal / (double)nbci_NombreChequeIntroduits;
			if (MontantNewsRecord < 200)
			{
				ncmi200_NombreChequeMontantInf200++;
				ncmi200_ValeurTotal = ncmi200_ValeurTotal + MontantNewsRecord;
				if (MontantNewsRecord < ChequeMinNew)
				{
					ChequeMinNew = MontantNewsRecord;
					tmlcs_TheMostLittleCheckSerial = pivotSerialCheque;
					tmlcs_Montant = MontantNewsRecord;
				}
			} 
			else if (MontantNewsRecord >= 200)
			{
				ncmsoe200_NombreChequeMontantSupOuEgale200++;
				ncmsoe200_ValeurTotal = ncmsoe200_ValeurTotal + MontantNewsRecord;
				if (MontantNewsRecord > ChequeMontantBigNew)
				{
					ChequeMontantBigNew = MontantNewsRecord;
					nobcs_NumOfBigerCheckSerial = pivotSerialCheque;
					nobcs_Montant = MontantNewsRecord;
				}
			}
			
		} while(i < 10);
		// fin de bouclage
	}
}
