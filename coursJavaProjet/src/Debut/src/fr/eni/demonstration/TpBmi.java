/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class TpBmi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("veuillez indiquer votre poids en kilograme");
		float poids = scan3.nextFloat();
		System.out.println("Veuillez indiquer votre taille en mètre");
		float taille = scan3.nextFloat();
		float bmi = poids / (taille*taille); // indice de Quételet (body mass index).
		//poid/taille
		
		
		
		///*
		// * BMI < 18,5 kg/m2 : carence pondérale 
		// * 18,5 <= BMI < 25 kg/m2 : poids normal 
		// * 25 <= BMI < 30 kg/m2 : surpoids 
		// * 30 <= BMI : adiposité
		// */
	
		if (bmi < 18.5) {
			System.out.println("Carence pondérale");
		} else if ((18.5 <= bmi)&&(bmi<25)){
			System.out.println("Poids normal");
		}else if ((25<= bmi)&&(bmi < 30)){
			System.out.println("Surpoids");
		} else {
			System.out.println("Adiposité");
		}
		scan3.close();
	}
	
	
	

}
