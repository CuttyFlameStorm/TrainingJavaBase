/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre ?");
		int premierEntier2 = scan.nextInt();
		
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
