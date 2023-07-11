package polimorphisme;

public class Pomme extends Fruit{

	public Pomme() {
		
	}
	public Pomme(int p) {
		int poids = p;
		System.out.println("Création d'une pomme de "+poids+" grammes");
	
	}
			
	@Override
	public void affiche() {
		System.out.println("c'est une pomme");
		
	}
	
	public void affichePoids() {
		System.out.println("le poids de la pomme est : "+ poids);
	}
		
}
