package polimorphisme;

public abstract class Fruit {
	protected int poids;
	public Fruit() {
	System.out.println("creation d'un fruit");	
	}
	
	public void affiche() {
		System.out.println("c'est un fruit");
	}
}
