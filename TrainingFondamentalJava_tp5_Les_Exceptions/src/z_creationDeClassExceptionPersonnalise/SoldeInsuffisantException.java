package z_creationDeClassExceptionPersonnalise;

public class SoldeInsuffisantException extends Exception {
	final private String messageFinal = "retrait impossible veuillez choisir un montant inférieur \nou égal au solde";

// si on herite de "extends Exception", il s'agirat d'une Exception SURVEILLER !
// si on herite de "extends RuntimeException, il s'agirat d'une Exception NON-SURVEILLER !
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6508980806623081051L;
	public SoldeInsuffisantException(String message) {
		super(message); // il fait appel au constructeur de la class parent soit Exception.
		System.out.println(messageFinal);
	}
	
	
	

}
