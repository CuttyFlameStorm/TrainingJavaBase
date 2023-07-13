package d_Scolarité_APP5;


import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import d_Scolarité.Etudiant;

public class APP7_SerialisationDansUnTableau_deBytesCode {

	public static void main(String[] args) throws Exception{
		Etudiant e1 = new Etudiant("E1", "math",12);
		Etudiant e2 = new Etudiant("E2", "math",14);
		//File f = new File ("eco.txt");    //ceci n'est plus necessaire
		//FileOutputStream fos = new FileOutputStream(f);  //ceci n'est plus necessaire.
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); //ceci permet de generer un tableau contenant du ByteCode.
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		// si on souhaite voir afficher dans le JDK le tableau d'octet
		byte[] t = bos.toByteArray(); // ce tableau peut a present etre conserver dans un fichier ou bien envoyé dans une autre application, on peut en faire ce qu'on souhaite.
		System.out.println("Taille du tableau : " + t.length); // toByteArray est la méthode qui permet d'afficher un tableau d'Array. //length affichera la taille des octets.
		// pour afficher l'ensemble des données, il faut faire une boucke.
		// Afficher les données du tableau
        for (byte b : t) {
            System.out.println(b + " ");
        }
     // Sauvegarder le tableau d'octets dans un fichier
        String fileName = "tableau_data.txt";
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(t);
        fos.close();

        System.out.println("Le tableau de données a été enregistré dans le fichier : " + fileName);


		oos.close();

	}

}
