/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class TestDeclaration {
	static byte varByte;
	static short varShort;
	static int varInt;
	static long varLong;
	static float varFloat;
	static double varDouble;
	static boolean varBoulean;
	static char varChar;
	static String varString;

	/**
	 * 
	 */
//	public TestDeclaration() {
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(varByte);
		System.out.println(varShort);
		System.out.println(varInt);
		System.out.println(varLong);
		System.out.println(varFloat);
		System.out.println(varDouble);
		System.out.println(varBoulean);
		System.out.println(varChar);
		System.out.println(varString);
		
		// attention les variables locales doivent etre instancié
		int i = 0;
		int a,j,k;
		
		a=i;
		int n, o=25, p; 
		
		// les conversions 
		int entier = 10;
		long l = entier;
		System.out.println("l = " + 1);
		System.out.println("l = " + "entier : " + entier);
		
		// conversions explicites
		float f = 10.23f;
		float f1 = (float)10.23;
		System.out.println(f);
		System.out.println(f1);
		
		double d = 10.23;
		entier = (int)d;
		System.out.println("entier = " + entier);
		
		int petit = 2147483647;
		System.out.println("petit = " + petit);
		petit = petit + 1;
		System.out.println("petit = " + petit);
		
		final boolean TROUVE = true;
		
		// on peut ecrire 2 façons pour un même resultat
		entier = entier + 23;
		entier += 23;
		
		// attention ci dessous le resultat est 0 
		//car on est en train de diviser un entier avec un entier
		float result = 10/500;
		System.out.println("result = " + result);
		//pour que l'opération fonctionne il faut caster avec un float
		result = 10f / 500;
		//ou
		result = 10 / 500f;  // temps que un des 2 chiffres est de type floatant
		// alors le resultat sera un floattant
		System.out.println("result = " + result);
		
		
		final float TAUX = 0.2f;
		float maj = 100 * (1 + TAUX);
		System.out.println("maj = " + maj);
		// attention le resultat est de 120.00001 au lieu de 120! tout rond
		// le 120.00001 est dû au type float car le float engendre une perte de précision.
		
		final double TAUX2 = 0.2;
		double maj2 = 100 * (1 + TAUX2);
		System.out.println("maj2 = " + maj2);
		// avec le type double le résultat est plus précis mais nécessite 64 bit 
		// au lieu de 32 bit pour un float.
		
		
		// attention à bien importer la librairie lors de l'utilisation de l'outil scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un entier ?");
		int premierEntier = scan.nextInt();
		
		System.out.println("veuillez saisr un autre entier ?");
		int secondEntier = scan.nextInt();
		
		int somme = premierEntier + secondEntier;
		
		System.out.println("La somme des saisies est égal à : " + somme);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
