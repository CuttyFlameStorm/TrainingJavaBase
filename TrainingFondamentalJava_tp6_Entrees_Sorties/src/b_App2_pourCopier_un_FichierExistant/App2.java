package b_App2_pourCopier_un_FichierExistant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class App2 {

	public static void main(String[] args) throws Exception {
		//la classe permettant de copier un fichier est la class "File"
		//Exemple creons un fichier nommé "notes.txt" à la racine du projet
		//exemple de copie de ce fichier grace à la class "File".
		//ici on copie caratere par caractere mais sans criptage
		File f1 = new File("notes.txt");
		FileReader fr = new FileReader(f1); //cela neccessite la création d'une Exception car s'il n'y a pas de fichier nommé "notes.txt" cela generera une erreur. 
		// nous serons obligé de faire sois try catch, ou soit throws. utilons par exemple un throws.
		File f2 = new File("copie.txt");
		FileWriter fw = new FileWriter(f2);
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		fw.close(); // il ne faut surtout pas oublier de fermer la lecture/ecriture.
		fr.close(); // pareil ici .
		System.out.println("copie effectuer, veuillez actualiser");

	}

}
