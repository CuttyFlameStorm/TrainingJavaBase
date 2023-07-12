package DeclarationException1_app2;

import java.util.Scanner;

import metier_ExempleDeclarationException1.Compte;

public class App2 {


	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Code : "); int c = clavier.nextInt();
		System.out.print("Solde : "); float s = clavier.nextFloat();
		
		Compte cp = new Compte(c, s);
		System.out.print("Montant à verser : ");
		float mt1 = clavier.nextFloat();
		cp.verser(mt1);
		
		System.out.println("Montant à retirer : ");
		float mt2 = clavier.nextFloat();
		try {
			cp.retirer(mt2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Solde est : " +cp.getSolde());
	}

}
