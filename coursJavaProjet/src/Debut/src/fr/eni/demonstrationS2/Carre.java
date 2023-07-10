package fr.eni.demonstrationS2;

public class Carre extends Rectangle{

	public Carre() {
		
	}
	
	public Carre(Double cote) {
		super(cote, cote);
	}
	
	public void setCote(Double cote) {
		super.setLargeur(cote);
		super.setLongueur(cote);
	}
	
	
	public void printInfo() {
		System.out.println("ceci est un carre de " + super.getLongueur());
		
	}
	
	
	

}
