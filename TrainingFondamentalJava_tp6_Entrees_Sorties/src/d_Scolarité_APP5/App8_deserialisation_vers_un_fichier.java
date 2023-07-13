package d_Scolarité_APP5;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;

import d_Scolarité.Etudiant;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class App8_deserialisation_vers_un_fichier {

    public static void main(String[] args) throws Exception {
        // Désérialiser le fichier "tableau_data.txt"
        FileInputStream fis = new FileInputStream("tableau_data.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Lire les objets désérialisés
        Etudiant e1 = (Etudiant) ois.readObject();
        Etudiant e2 = (Etudiant) ois.readObject();

        ois.close();

        // Sérialiser les objets au format JSON
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json1 = objectMapper.writeValueAsString(e1);
        String json2 = objectMapper.writeValueAsString(e2);

        // Enregistrer les données dans un fichier lisible
        String fileName = "donnees_lisibles.txt";
        FileWriter writer = new FileWriter(fileName);
        writer.write(json1);
        writer.write("\n"); // Ajouter une ligne vide entre les objets
        writer.write(json2);
        writer.close();

        System.out.println("Les données ont été désérialisées et enregistrées dans le fichier 'donnees_lisibles.txt'.");
    }
}
