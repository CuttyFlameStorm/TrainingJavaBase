package a.b.c;


//CompteSimple est une class qui herite la class Compte, on utilise extends
public final class CompteSimple extends Compte implements ICompte{ // une class final, peut être instancié mais ne peut pas être redéfini! c'est une classe final, il faut l'utiliser tel quelle !
	//le compte simple est défini par un découvert
	private float decouvert;
	public float getDecouvert() {
		return decouvert;
	}
	private float sommeAutoriser;

	private final float taux=2; // cela signifie que celle variable ne pourra plus être modifié !

	//on fait build le constructeur par l'ide
	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}

	
	
	//Quand on herite d'une class on peut redefinir ses methode Surtout que la méthode retirer de la class mère Compte ne prend pas en compte le decouvert . donc on peut redefeinir la méthode en apportant les conditions qu'on a besoin  //en prenant en compte le decouvert. 
	@Override  //leOveride signifie que cela est une nouvelle version de la méthode retirer
	public void retirer(float mt) {
		afficher();
		System.out.println("Vous souhaitez retirer : " + mt);
		System.out.println("votre Solde actuel est de : " + getSolde());
		if(mt<solde+decouvert) {
			solde=solde-mt; //Pour pouvoir utiliser l'attribut solde de la la Class Compte, il faut que l'attribut de la class Compte soit defini comme protected afin que les class fille peut l'utiliser via l'heritage. Sinon il faut passer par les getters et les setters de la class abstraite compte.
		}else {
			retraitImpossible();
		}
	}

	// Ovveride obligatoire issue de la class Compte qui sera redefini dans CompteSimple.
	@Override
	public void afficher() {
		// ici la méthode abstraite de la class Compte va être redéfini.
		System.out.println("C'est un compte simple avec découvert");
		
	}
	
	public final void retraitImpossible() {
		System.out.println("retrait impossible !");
		System.out.println("votre solde est de : " + getSolde());
		System.out.println("votre decouvert autorisé est de  : " + getDecouvert());
		System.out.println("vous pouvez retirer jusqu'à : "+ sommeAut());
	}



	private final float sommeAut() {
		this.sommeAutoriser = getSolde() + getDecouvert();
		return sommeAutoriser;
	}



	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", sommeAutoriser=" + sommeAutoriser + ", taux=" + taux + "]";
	}
	
	
	
	
	
}
