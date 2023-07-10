package fr.eni.demonstrationS2;

public class Rectangle implements Dessinable, Comparable<Rectangle>{

	//ici on utilise le mode public
	/*
	public Double longueur;
	public Double largeur;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Double longueur, Double la) {
		this.longueur = longueur;  // ici on utilise le "this." car il y a 2 mots longueur qui ne corresponde pas à la meme vaiable.
		this.largeur = la;
	}

	public Double getPerim() {
		return (this.longueur + this.largeur)* 2; 
	}
	
	public Double getAire() {
		return (this.longueur * this.largeur);
	}
	*/
	
	// ici on utilise l'encapsulation avec le mode private
	// on va donc creer des getter et des setter
	private Double longueur;
	private Double largeur;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Double longueur, Double la) {
		this.longueur = longueur;  // ici on utilise le "this." car il y a 2 mots longueur qui ne corresponde pas à la meme vaiable.
		this.largeur = la;
	}

	public Double getPerim() {
		return (this.longueur + this.largeur)* 2; 
	}
	
	public Double getAire() {
		return (this.longueur * this.largeur);
	}
	
	//-------------  insertion des getters et setters ci dessous
	// ------------ on peut l'ecrire ou le générer directement
	// ------------ via l'IDE.
	// si on modifie les variables privées, les getters
	// et les setters ne changent pas
	// de la sorte, il n'y a pas besoin de changer les noms
	// les getters et setters dans la partie Driver main.

	public Double getLongueur() {
		return longueur;
	}

	public void setLongueur(Double longueur) {
		this.longueur = longueur;
	}

	public Double getLargeur() {
		return largeur;
	}

	public void setLargeur(Double largeur) {
		this.largeur = largeur;
	}
	
	
	
	//-----------------------------------
	public void printInfo() {
		System.out.println("ceci est un rectangle de " + longueur + " sur " + largeur );
	}

	@Override
	public void dessiner() {
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	@Override
	public int compareTo(Rectangle rec) {
		
		return this.getPerim().compareTo(rec.getPerim());
	}
	
	
}
















