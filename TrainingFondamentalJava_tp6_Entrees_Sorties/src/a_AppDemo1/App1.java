package a_AppDemo1;

import java.io.File;

public class App1 {

	public static void main(String[] args) {
		File f = new File("c:/DRIVERS/");
		String[] contenu = f.list();
		for(String s:contenu) {
			File f2 = new File("c:/DRIVERS/" +s); //nous faisons cela afin de pouvoir utiliser la méthode "isDirectory" de File afin de savoir s'il s'agit d'un répertoire ou d'un fichier.
			if(f2.isDirectory())
				System.out.println("Rep : " +s);
			else
				System.out.println("File : " +s+ " L = " +f2.length()); // la méthode lenght nous onnera la taille du fichier en octet.
		}

	}

}
