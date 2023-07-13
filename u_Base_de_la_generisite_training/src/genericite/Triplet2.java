package genericite;

public class Triplet2<T, T2> extends Couple<T> {
	private T2 c;
	
	//Constructor sans parametre
	public Triplet2() {
		super();
	}
	
	// Constructor avec parametre
	public Triplet2(T a, T b, T2 c) {  // on specifie tous les parametre de genericité ainsi que son parent.
		super(a, b);
		this.c = c;
	}

	//getters et setters
	public T2 getC() {
		return c;
	}

	public void setC(T2 c) {
		this.c = c;
	}

	// Voir exemple d'utlisation dans App2
	
	
	
	

}
