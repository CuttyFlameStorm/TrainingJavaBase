package test;

import metier.Compte;

public class Application {


	public static void main(String[] args) {
		Compte c1, c2, c3;
		
		c1 = new Compte(7000);
		c2 = new Compte(6000);
		c3 = new Compte();
		
		System.out.println(c1);
		c1.verser(5000);
		System.out.println("Votre nouveau solde est de : " +c1.getSolde());
		c1.retirer(1000);
		System.out.println("votre nouveau solde est de : " +c1.getSolde());
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("nombre de compte :"+Compte.getNbComptes());
		System.out.println("nombre de compte :"+c1.getNbComptes());
		c3.verser(3000);
		System.out.println("votre nouveau solde : " +c3.getSolde());
		
		

	}

}
