package polimorphisme;

public abstract class Fruit {
	protected int poids;
	public Fruit() {
	System.out.println("creation d'un fruit");	
	}
	
	public abstract void affiche();
	public abstract void affichePoids(); // cette méthode abstraite sera redéfini dans les classe dérivées soit les class dites filles.
}
