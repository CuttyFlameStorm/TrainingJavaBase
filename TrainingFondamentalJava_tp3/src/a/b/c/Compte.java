package a.b.c;

public abstract class Compte { //il s'agit d'une class abstraite qui ne peut pas être instancié mais elle peut être herité par l'extends des class fille.
	private int code; 
	protected float solde;
	
	//Constructor avec parametres
	public Compte(int code, float solde) {
		this.code = code;
		this.solde = solde;
	}
	//Constructor sans parametre
	public Compte() {
	}
	
	//Création d'une méthode abstraite : afficher();
	public abstract void afficher(); //cette méthode devra obligatoirement être appelé par la classe fille qui herite de la classe Compte, cette méthode sera redéfini dans la classe fille ! notons que l'override de cette méthode abstraite sera obligatoire, soit la méthode abstraite doit etre appelé et c'est obligatoire. cette méthode devra obligatoirement être implémenté dans la classe fille héritant de la classe Compte !
	
	//Methode verser
	public final void verser(float mt) {  //une méthode final n'a pas le droit d'etre redefini, c'est à dire qu'elle ne peut pas être @Override !  la métode doit être utlisisé tel quelle !
		solde=solde+mt;
	}
	//Methode retirer
	public void retirer(float mt) {
		solde = solde-mt;
	}
	//Methode Get Solde
	public float getSolde() {
		return solde;
	}
	
	
	
	
	//Methode to String // ici on override soit on redefini la méthode heriter de la class OBJET implicitement
	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}
	
	
	
	
	
	

}
