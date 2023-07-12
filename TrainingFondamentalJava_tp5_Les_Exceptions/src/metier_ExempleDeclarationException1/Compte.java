package metier_ExempleDeclarationException1;

public class Compte {

	private int code;
	private float solde;
	
	//Constructeur avec parametre
	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	
	//Méthode verser
	public void verser(float mt) {
		solde = solde+mt;
	}
	
	//Méthode retirer
	public void retirer(float mt) throws Exception { // il s'agit d'une Exception surveiller.
		if(mt>solde) throw new Exception("Solde insuffisant"); //dans la méthode tout ce qui vient après throw ne sera pas executé ! 
		solde = solde-mt;
	}

	public float getSolde() {
		return solde;
	}
	
	
	
	

}
