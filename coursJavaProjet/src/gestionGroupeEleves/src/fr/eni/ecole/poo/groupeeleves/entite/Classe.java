package fr.eni.ecole.poo.groupeeleves.entite;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Classe extends Personne implements Comparable<Personne>{

	public List<Personne>lst = new ArrayList<Personne>();
	public List<Eleve>lstE = new ArrayList<Eleve>();
	public List<Personne>lstparent = new ArrayList<Personne>();
	
	String[] tableauEleve = new String [500];
	String[]tableauParent = new String [500];
	String nom; 
	Instituteur instituteur;
	
	//--------------CONSTRUCTEUR---------------------------------
	public Classe(String nom) {    //Class Classe avec paramètre
		super();
		this.nom = nom;
	}
	
	//-----------------------------------------------------------
	
	/****METHODE***/// Type void + Type Class Eleve 
	void addEleve(Eleve e) {
		lstE.add(e);
	}
	//--------------------
	void removeEleve(Eleve e) {
		lstE.remove(e);
	}
	//--------------------
	Eleve getEleve(int i) {
		return lstE.get(i);
	}
	//--------------------
	void sortListEleve() {
	List<Eleve>listeEleve = new ArrayList<Eleve>();
	Collections.sort(listeEleve);
	}
	//--------------------
	List<Eleve>getLstEleves(){
		List<Eleve>listeEleve = new ArrayList<Eleve>();
		return listeEleve;
	}
	//--------------------
	void setLstEleves(List<Eleve>lstEleves) {
		
	}
	//--------------------
	void sortListEleveHier(){              // Méthode sortListEleve de la Class Classe.                                   
		// injection dans tableau
		int n = 0;
		for (Personne eleve:lst) {
			lst.add(eleve);
			// récupération dans 
			//le tableau le prenom de la personne. 
			tableauEleve[n] = eleve.prenom;  
			System.out.print(lst.get(0) + "\n");
			n++;
		} //-- end Foreach

		 Arrays.sort(tableauEleve);  // <--transformation par ordre croissant Arrays.sort();
	    // print the array
	    for (int i = 0; i < tableauEleve.length; i++) {
	       System.out.print(tableauEleve[i] + "\n ");
    	}	
	} // fin de la méthode sortListEleve();  utilisable par appel de la méthode
	
	
	/* ------------------------------------------------------------------------
	 * 	( [Récupération] des parents des élèves (méthode getListParent()). Cette méthode 
	 *	crée dynamiquement l’ensemble des parents d’élèves. Attention il n’y a pas 
	 *	d’obligation dans les élèves d’avoir un parent référent et plusieurs élèves peuvent 
	 *	avoir le même parent
	 */
	//-------------------------------------------------------------------------
	
	public void getListParentHier() {
		
		 
		for (Personne eleve:lst) {
			
			String pivo = eleve.toString();  // pour ne pas enregistrer tout de suite et s'assurer que la donnée n'est pas null
			//afficher Parent//eleve
			System.out.println("\nAffichage du tableau des élèves et de leur Parent associé\n");
			if (pivo != null) {
				System.out.println(" NOM/Prénom de l'élève : " + eleve.getNom() + " " + eleve.getPrenom() + "    accompagné de son parent : " + "Prenom : " + eleve.toString() );
			} else {
				System.out.println(" NOM/Prénom de l'élève : " + eleve.getNom() + " " + eleve.getPrenom() + "    il n'est pas accompagné de son parent "  );
			}
			if (pivo != null) {
				for (int i = 0; i < lst.size(); i++) {
					String pivo2 = tableauParent[i];
					if (pivo2 != pivo) {
						tableauParent[i] = pivo;
						i = lst.size();
					} // fin de IF
				} // ------------------Fin de Boucle FOR -- //
			} // --- Fin de IF de la condition d'enregistrement dans le tableau Parent.
		
		} //-- end Foreach
		
		System.out.println("\n------------------- AFFICHAGE LISTE PARENT -------------------------\n");
		for (int i = 0; i < tableauParent.length; i++) {
			System.out.println("Nom : " + tableauParent[i]);
		}
		//---Fin d'affichage de la liste des Parents
	}
	

	@Override
	public String toString() {
		return "Classe [tableau0=" + Arrays.toString(tableauEleve) + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", ddn=" + ddn + ", toString()=" + super.toString() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getAdresse()=" + getAdresse() + ", getDdn()=" + getDdn()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	@Override
	public int compareTo(Personne o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

