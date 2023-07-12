package metier_ExempleDeclarationException2;

import z_creationDeClassExceptionPersonnalise.NegativeException;
import z_creationDeClassExceptionPersonnalise.SoldeInsuffisantException;

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
	public void verser(float mt) throws NegativeException {
		if(mt<0) throw new NegativeException("");
		solde = solde+mt;
	}
	
	//Méthode retirer
	public void retirer(float mt) throws SoldeInsuffisantException, NegativeException { // il s'agit d'une Exception surveiller.
		if(mt>solde) throw new SoldeInsuffisantException(""); //dans la méthode tout ce qui vient après throw ne sera pas executé ! 
		if(mt<0) throw new NegativeException(""); // il faut faire une exception si le montant retirer est négatif car cela aurait pour conséquence d'augmenter le Solde mathématiquement. hors ceci serai une erreur de fonctionnalité de l'appli.
		solde = solde-mt;
	}

	public float getSolde() {
		return solde;
	}
	
	
	
	

}
