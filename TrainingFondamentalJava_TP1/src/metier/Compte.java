package metier;

public class Compte {
	private int code;
	private float solde;
	
	//Constructor
	public Compte(int c, float s) {
		code = c;
		solde = s;
	}
	
	// Méthode de la class Compte
	public void verser(float mt) {
		solde=solde+mt;
	}
	public void retirer(float mt) {
		solde=solde-mt;
	}
	

	public float getSolde() {
		return solde;
	}

	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}


	
	

}
