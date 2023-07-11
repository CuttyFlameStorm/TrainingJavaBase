package polimorphisme;

public class Orange extends Fruit{

	public Orange(int p) {
		poids = p;
		System.out.println("Création d'une Orange de "+poids+" grammes");
	
	}
			
	@Override
	public void affiche() {
		System.out.println("c'est une Orange");
		
	}
	
	public void affichePoids() {
		System.out.println("le poids de l'Orange est : "+ poids);
	}
		
}
