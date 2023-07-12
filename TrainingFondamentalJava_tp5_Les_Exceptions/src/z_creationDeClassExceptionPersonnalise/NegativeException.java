package z_creationDeClassExceptionPersonnalise;

public class NegativeException extends Exception{
	final private String messageFinal= "Vous avez saisi un montant négatif \n action impossible";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6091992985133249866L;

	public NegativeException(String message) {
		super(message);
		System.out.println(messageFinal);
		
	}

	
	
}
