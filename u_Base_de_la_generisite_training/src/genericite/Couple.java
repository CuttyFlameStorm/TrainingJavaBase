package genericite;

public class Couple<T> {
	// si on veut utiliser cette class généreique, on va utiliser une Application qui contient la méthode main()
	private T a;
	private T b;
	
	// constructor sans parametre
	public Couple() {
		super();
	}

	// constructor avec parametre
	public Couple(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}
	
	
}
