package methodeGenerique_dansUneClasseStandard;

public class Calcul {
	
	// constructeur sans parametre.
	public Calcul() {
		
	}

	//une méthode génrique peut etre déclarer à l'interieur d'une classe qui n'est pas générique.
	public <T> boolean comparer(T a, T b) {  //comparer sera donc une methode generique de la classe Calcul
		// quand on compare des elements, 
		// on ne peut pas comparer des éléments qui ne sont pas de meme types.
		// il faut que ce soit du meme type
		// La methode generique ne peut recevoir qu'un seul type.
		
		return a.equals(b);
		
	}
	
	// sinon si la methode recoit des parametre different il faudra utliser dans une classe ce qu'on appelle la surchage !
	//exemple de surcharge :
	public <T> boolean comparer2(T a, T b) {
		
		if(a instanceof Integer) {	
			//ici la condition si
		}
		else if(a instanceof String) {
			//ici la condition sion
		}
		
		return a.equals(b);
	}

}
