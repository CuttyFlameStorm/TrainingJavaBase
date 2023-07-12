package DeclarationException1_app2_bis;

import java.util.Scanner;

import metier_ExempleDeclarationException1.Compte;

public class App2 {


	public static void main(String[] args) throws Exception { //ici throw est déclaré au niveau de la méthode main directement. mais dans ce cas il sera plus difficle de personnaliser l'erreur detecté.
		Scanner clavier = new Scanner(System.in);
		System.out.print("Code : "); int c = clavier.nextInt();
		System.out.print("Solde : "); float s = clavier.nextFloat();
		
		Compte cp = new Compte(c, s);
		System.out.print("Montant à verser : ");
		float mt1 = clavier.nextFloat();
		cp.verser(mt1);
		
		System.out.println("Montant à retirer : ");
		float mt2 = clavier.nextFloat();
		cp.retirer(mt2);

	}

}
