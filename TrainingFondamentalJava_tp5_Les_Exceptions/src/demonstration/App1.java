package demonstration;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("A : "); int a = clavier.nextInt();
		System.out.print("B : "); int b = clavier.nextInt();
		int c = 0;
		try {
			c = a/b;
		}
		catch (ArithmeticException e) {
			//System.out.println("Division par zéro"); //pour ecrire le message souhaité.
			//System.out.println(e.getMessage()); // pour capturer le message de l'exception.
			//System.out.println(e.toString()); // la méthode "to string" de l'Exception afiche le type d'erreur + le message.
			e.printStackTrace(); // va faire une tracabilité et nous affiché la ligne qui a généré l'exception.
			
		}
		System.out.println("C = "+c);
		

	}

}
