package methodeGenerique_dansUneClasseStandard;

public class Calcul2<U> {
	private U varGenerique;

	public Calcul2() {
		
	}

	public <T> boolean comparer(T a, T b) { 
		
		return a.equals(b);
	}
	
}
