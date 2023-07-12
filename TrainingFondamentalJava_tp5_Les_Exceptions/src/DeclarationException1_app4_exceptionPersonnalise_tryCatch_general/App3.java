package DeclarationException1_app4_exceptionPersonnalise_tryCatch_general;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier_ExempleDeclarationException2.Compte;
import z_creationDeClassExceptionPersonnalise.NegativeException;
import z_creationDeClassExceptionPersonnalise.SoldeInsuffisantException;

public class App3 {


	public static void main(String[] args) { //ici throw est déclaré au niveau de la méthode main directement. mais dans ce cas il sera plus difficle de personnaliser l'erreur detecté.
		try {
			 
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
			
			System.out.println("Solde est : "+cp.getSolde());
			
			clavier.close();
		}
		catch (InputMismatchException e) {
			System.out.println("Problème de saisi");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally { // se block finally est rarement utilisé. mais l'insertion de ce block permet une exécution du block malgré les erreurs detecté ! ceci peut avoir son importance.
			System.out.println("Bloc fianlly : Merci de votre visite !");
		}

	}

}
