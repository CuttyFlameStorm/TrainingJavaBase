package d_Scolarité_APP5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import d_Scolarité.Etudiant;

public class App5_SERIALISATION_binaire {


	public static void main(String[] args) throws Exception {
		// cette application permet de créer des étudiants.
		// EN UTILISANT UNE CLASS SERIALISABLE.
		Etudiant e1 = new Etudiant("E1", "math",12);
		Etudiant e2 = new Etudiant("E2", "math",14);
		File f = new File ("eco.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.close(); // toujours fermer l'écrite pour que cela soit enregistré.
		// ceci est un exemple de serialisation, mais le fichier sera encrypté en BINAIRE
		// mais le fichiers créé contient bien 2 objets étudiant;
		// LE SEUL MOYEN DE LIRE LES INFORMATIONS DU FICHIER BINAIRE CREE, est de faire la déserialisation !  -> voir App6 ! pour la DESERIALISATION.




	}

}
