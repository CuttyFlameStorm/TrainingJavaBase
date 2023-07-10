/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class TpPrix {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double Tva = 1.2;
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Prix unitaire HT ?");
		double prixHt = scan2.nextFloat();
		
		System.out.println("Quantité ?");
		int quantite = scan2.nextInt();
		
		System.out.printf("Montant HT : %.1f Euros", prixHt * quantite);
		System.out.println("");
		System.out.printf("Montant TTC : %.2f TTC", prixHt * Tva * quantite);
		
		scan2.close();
		
				

	}

}
