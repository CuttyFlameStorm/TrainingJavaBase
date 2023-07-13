package b_App4_pourCopier_un_FichierExistant_divisierLigneEnPlusieursPartie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App4 {

	public static void main(String[] args) throws Exception {
		File f = new File("notes.txt");
		FileReader fr = new FileReader(f);
		FileReader fr2 = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br2 = new BufferedReader(fr2);
		//*****************************
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		fr.close();
		br.close();
		// exemple si on cherche a caluler une moyenne par exemple
		//**********Pour aller récuperer que les chiffres *******************
		String s2;
		float somme=0;
		int nb=0;
		while((s2 = br2.readLine()) != null) {
			++nb; // pour chaque ligne de lue on va incrémenter "nb". pour ensuite faire la moyenne par rapport au nombre de ligne parcouru.
			String[] t = s2.split(";");
			System.out.println(t[2]); //les chiffres se trouvent après la 2eme point virgule ;
//			somme = somme + t[2]; //ici on fait la somme au fur et a mesure.
			// cependant nous rencontrons un problème de type int/String
			// -> on va donc utiliser une methode "parseFloat" pour convertir.
			float note = Float.parseFloat(t[2]); //ceci permet la conversion.
			System.out.println("note = "+note);
			// a present la somme va fonctionner.
			somme = somme + note;
			System.out.println("somme incrémenté = "+somme);
		}
		fr2.close();
		br2.close();
		// a present on peut afficher la moyenne
		System.out.println("\nMoyenne de toutes les sommes: " + somme/nb);


	}

}
