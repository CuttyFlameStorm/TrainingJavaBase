/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class LesBoucles {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variable utile pour la totalité des démonstrations
		int compteur = 1;
		
		
		
		/***********TYPE DE BOUCLE***************
		 * **************************************
		 **** - Etape 1 : boucle [ while ] - ****/
		compteur = 1;
		while (compteur <= 5)			 	  //note: dans la boucle while
		{									  //si la condition de départ n'est pas true
			System.out.println(compteur);	  //la Boucle n'est pas exécuté une seule fois.
			compteur++;
		}
		System.out.println("Terminé \n");	  //note le " \n " permet le saut de ligne après l'affichage.
		
		
		
		/***********TYPE DE BOUCLE***************
		 * **************************************
		 *** - Etape 2 : boucle [ do while ] - **/
		compteur = 1;
		do 									//note: Dans la Boucle [do while] 
		{									//on s'aperçoit que le code est exécuté au moins 1 fois
			System.out.println(compteur);	//avant d'atteindre la condition.
			compteur++;
			
		} 
		while (compteur <= 5);
		System.out.println("Terminé \n");
		
		
		
		/***********TYPE DE BOUCLE***************
		 * **************************************
		 ***** - Etape 3 : boucle [ for ] - *****/
		compteur = 1;
		for (int compteur2 = 1; compteur2 <= 5; compteur2++) 	//note: dans ce type de boucle
		{														//on cherche à exécuter la fonction
			System.out.println(compteur2);						//notemment lorsqu'on a besoin de faire
		}														//des itérations.
		System.out.println("Terminé \n");
		
		
		
		/*********** PETIT RAPPEL D'ECRITURE ***************
		 * *************************************************
		 ******** concernant l'incrémentation "[ ++ ]" *****
		 *soit avant ou soit après une variable de type int*/
		
		int score = 1;
		
		System.out.println(score++);		//ici l'affichage indiquera d'abord 
											//le contenue de la variable
											//avant d'incrémenter de 1 la variable score déja existente
											//qui ecrasera l'ancienne valeur par la nouvelle qui sera 2.
											//on parlera alors ici de "pré-incrémentation".
											//ici la valeur affiché sera donc de 1

		// ou
		
		System.out.println(++score);		//ici le contenue de la variable sera modifié avant son affichage
											//soit dans le sens inverse de l'ecritude du dessus
											//on parlera alors de "pré-incrémentation".
											//ici la valeur affiché de [score] sera égale à 2
											//car l'ancienne valeur aura déjà été modifié par la méthode du dessus.
		

	}
	
	

}
























