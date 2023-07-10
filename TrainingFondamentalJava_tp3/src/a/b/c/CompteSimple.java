package a.b.c;


//CompteSimple est une class qui herite la class Compte, on utilise extends
public final class CompteSimple extends Compte{ // une class final, peut être instancié mais ne peut pas être redéfini! c'est une classe final, il faut l'utiliser tel quelle !
	//le compte simple est défini par un découvert
	private float decouvert;

	//on fait build le constructeur par l'ide
	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}

	
	
	//Quand on herite d'une class on peut redefinir ses methode Surtout que la méthode retirer de la class mère Compte ne prend pas en compte le decouvert . donc on peut redefeinir la méthode en apportant les conditions qu'on a besoin  //en prenant en compte le decouvert. 
	@Override  //leOveride signifie que cela est une nouvelle version de la méthode retirer
	public void retirer(float mt) {
		if(mt<solde+decouvert) {
			solde=solde-mt; //Pour pouvoir utiliser l'attribut solde de la la Class Compte, il faut que l'attribut de la class Compte soit defini comme protected afin que les class fille peut l'utiliser via l'heritage. Sinon il faut passer par les getters et les setters de la class abstraite compte.
		}	
	}

	// Ovveride obligatoire issue de la class Compte qui sera redefini dans CompteSimple.
	@Override
	public void afficher() {
		// ici la méthode abstraite de la class Compte va être redéfini.
		System.out.println("C'est un compte simple avec découvert");
		
	}
	
	
	
	
	
}
