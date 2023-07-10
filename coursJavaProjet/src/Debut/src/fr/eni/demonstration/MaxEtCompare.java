/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class MaxEtCompare {
	
	public static double retourneMaxValue(double valeur1, double valeur2){
		
		if (valeur1 > valeur2) {
			return valeur1;
		} 
		return valeur2;
	
	}  // fin de la fonction retourneMaxValue
	
	public static int retourneReelles(double valeur1, double valeur2) {
		if (valeur1 == valeur2) {
			return 0;
		} else if (valeur1 > valeur2) {
			return 1;
		} 
		return -1;
		
	}  // fin de la fonction retourneReelles
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("ici apparaitra votre nombre le pus GRAND");
		
		double valeur1;
		double valeur2;
		
		System.out.println("tapez un premier nombre");
		Scanner scan = new Scanner(System.in);
		valeur1 = scan.nextDouble();
		System.out.println("tapez un second nombre");
		valeur2 = scan.nextDouble();
		
		
		
		System.out.println(retourneMaxValue(valeur1,valeur2));
		
		
		
		System.out.println("la valeur la plus grande de vos 2 nombres est " + retourneMaxValue(valeur1,valeur2));
	
		System.out.println("La seconde fonction retourne : " + retourneReelles(valeur1,valeur2));
		
		
		scan.close();
		// ----------------------------  //
		


		} // fin du main
	

} // fin de la class
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

