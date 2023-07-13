package methodeGenerique_dansUneClasseStandard;

import java.io.Serializable;

//** ici il s'agit d'un type generiquque qui herite uniquement de la classe Produit**
public class Traitement<T extends Produit & Serializable & Cloneable> {
/*
 * note : on peut etendre plusieurs class !
 * Cloneable est un design Pattern qui utilise des prototypes! 
 * 
 * */
	
	private T a;
	private T b;
	
	public Traitement() {
		super();
		
	}

	public Traitement(T a, T b) {
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
	
	// voir APP4 pour l'utilisation de cette class !

}
