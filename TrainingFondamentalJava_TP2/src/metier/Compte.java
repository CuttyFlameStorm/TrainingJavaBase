package metier;

public class Compte {
	// attribut de la class
	private int code;
	private float solde;
	private static int nbComptes; 
	
	// constructor sans paramètre
	public Compte() {
		++nbComptes;
		code = nbComptes;
		
	}
	// constructor avec parametres
	public Compte(float s) {
		++nbComptes;
		code = nbComptes;
		solde = s;
	}
	
	//Methode verser de la class
	public void verser(float mt) {
		solde = solde+mt;
		System.out.println("vous venez de verser : " + mt + " dans votre compte : " + code);
	}
	//Methode retirer de la class
	public void retirer(float mt) {
		solde = solde-mt;
		System.out.println("vous venez de retirer : " + mt);
	}
	//Methode Get Solde
	public float getSolde() {
		return solde;
	}
	//Methode Get Code
	public int getCode() {
		return code;
	}
	//Methode Get Compte
	public static int getNbComptes() {
		return nbComptes;
	}
	
	//Methode to String + @Override réécriture de la Méthode to String Originel
	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}
	
	
	

}
