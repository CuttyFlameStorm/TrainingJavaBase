package c_App4_pourCopier_un_FichierExistant_compression_du_fichier;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class App5 {

	public static void main(String[] args) throws Exception {
		File f1 = new File("notes.txt");
		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream bis = new BufferedInputStream(fis);

		File f2 = new File("f.zip");
		FileOutputStream fos = new FileOutputStream(f2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// si on s'arrete au niveau du dessus, on peut lire et ecrire, mais il n'ya pas de compression, cela reviens a la meme chose que démontré avec les differentes App précedente.
		// c'est la class ZipOutputStream qui va nous permettres de faire la compression.
		ZipOutputStream zos = new ZipOutputStream(bos); // cette class permet la compression.

		zos.setMethod(ZipOutputStream.DEFLATED);// avant de faire la compression, il faut générer la méthode qu'on va appliquer !
		zos.putNextEntry(new ZipEntry(f1.getName())); // Permet d'enregistrer un fichier entrant// cela genere une nouvelle entrée dans le fichiers.

		//ensuite on retrouve le meme algorithme que dans les precedente app avec une boucle.
		int c;
		while((c = bis.read()) != -1) {
			zos.write(c);
		}
		zos.close(); // pour l'ecriture il faut fermer sinon les données ne seront pas enregistré
		bis.close(); // close du buffer de lecture
		System.out.println("taille du fichier standard " +f1.length());
		System.out.println("taille du fichier Zip : " +f2.length());


	}

}
