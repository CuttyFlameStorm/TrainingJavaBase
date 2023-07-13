package d_Scolarité_APP5;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import d_Scolarité.Etudiant;

public class App6_deserialisation {

	public static void main(String[] args) throws Exception {
		// faisons la désérialisation dans le JDK poour tester.
		File f = new File("eco.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Etudiant e1 = (Etudiant) ois.readObject();
		Etudiant e2 = (Etudiant) ois.readObject();
		System.out.println(e1);
		System.out.println(e2);
		ois.close();
		fis.close();

		// Toutefois on fais la deserialisation vers un fichier en général.
		// Faisons la serialisation dans un tableau.
		// *** => VOIR APP7_serialisation dans un tableau  et APP8_deserialisation.



	}

}
