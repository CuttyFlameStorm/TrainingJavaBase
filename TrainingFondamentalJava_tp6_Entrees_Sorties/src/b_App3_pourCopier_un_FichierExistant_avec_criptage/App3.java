package b_App3_pourCopier_un_FichierExistant_avec_criptage;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App3 {

	public static void main(String[] args) throws Exception {
		//la classe permettant de copier un fichier est la class "File"
		//Exemple creons un fichier nommé "notes.txt" à la racine du projet
		//exemple de copie de ce fichier grace à la class "File".
		//ici on copie caratere par caractere avec un criptage des caracteres !
		File f1 = new File("notes.txt");
		FileReader fr = new FileReader(f1); //cela neccessite la création d'une Exception car s'il n'y a pas de fichier nommé "notes.txt" cela generera une erreur. 
		// nous serons obligé de faire sois try catch, ou soit throws. utilons par exemple un throws.
		File f2 = new File("copieEncrypt.txt");
		FileWriter fw = new FileWriter(f2);
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c+1); // c'est ici qu'on encrypte en copiant un caractere en le remplacant par le suivant grace au +1
		}
		fw.close(); // il ne faut surtout pas oublier de fermer la lecture/ecriture.
		fr.close(); // pareil ici .
		System.out.println("copie effectuer avec encryptage, veuillez actualiser");

	}

}
