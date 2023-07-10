package fr.eni.demonstration;

public class HelloWorld2 {

//	public HelloWorld2() {
		
//	}

	public static void main(String[] args) {
	//	System.out.println("Re-bonjour tout le monde");
		int nombre = 10;
		int nombreSaisie = 10;
		
		if(nombre == nombreSaisie) {
			char lettre = 'A';
			System.out.println("Les nombres sont identiques : -> " + nombre);
			System.out.println("La Valeur du caractère est : -> " + lettre);
		} else {
			System.out.println("Les nombres sont différents, soit : -> " +nombre+" est la valeur attendu et "+ nombreSaisie+" à été saisie");
		}

	}

}

