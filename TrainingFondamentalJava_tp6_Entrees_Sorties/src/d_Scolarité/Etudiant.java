package d_Scolarité;

import java.io.Serializable;

public class Etudiant implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 5607554130108335594L;
	//***************************************

	private String code;
	private String matiere;
	private transient float note; // transient permet de spécifié comme quoi cette attribut n'est pas sérialisable // cela signifie que la donnée n'est pas persistante, elle ne sera pas enregistré quand on va faire la sérialisation. car cette données est transitoire lorsqu'elle est déclaré transient !
	// transient est utilisé lorsqu'on a des class avec des attribut qui proviennent d'autres class et dont on a pas envie que les données soivent enregistré, donc lors de la sérialisation des attribut on leur affecte le tupage de transient !


	public Etudiant(String code, String matiere, float note) {
		this.code = code;
		this.matiere = matiere;
		this.note = note;

	}
	public Etudiant() {

	}

	//Méthode getters et setters.
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Etudiant [code=" + code + ", matiere=" + matiere + ", note=" + note + "]";
	}





}
