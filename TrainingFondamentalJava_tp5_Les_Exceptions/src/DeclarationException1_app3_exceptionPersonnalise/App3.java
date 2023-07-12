package DeclarationException1_app3_exceptionPersonnalise;

import java.util.Scanner;

import metier_ExempleDeclarationException2.Compte;
import z_creationDeClassExceptionPersonnalise.NegativeException;
import z_creationDeClassExceptionPersonnalise.SoldeInsuffisantException;

public class App3 {


	public static void main(String[] args) { //ici throw est déclaré au niveau de la méthode main directement. mais dans ce cas il sera plus difficle de personnaliser l'erreur detecté.
		Scanner clavier = new Scanner(System.in);
		System.out.print("Code : "); int c = clavier.nextInt();
		System.out.print("Solde : "); float s = clavier.nextFloat();
		
		Compte cp = new Compte(c, s);
		System.out.print("Montant à verser : ");
		float mt1 = clavier.nextFloat();
		try {
			cp.verser(mt1);
		} catch (NegativeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Montant à retirer : ");
		float mt2 = clavier.nextFloat();
		try {
			cp.retirer(mt2);
		} catch (SoldeInsuffisantException e) { //on aurait pu laisser Exception cela fonctionnerai aussi car Exception capture toutes les exception. Mais préciser la classe exception permet de savoir quel classe Personnalisé on utilise !
			System.out.println(e.getMessage());
			
		} catch (NegativeException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("Solde est : "+cp.getSolde());

	}

}
