package Application;


import methodeGenerique_dansUneClasseStandard.ProduitLiquide;
import methodeGenerique_dansUneClasseStandard.Traitement;

public class App4 {

	public static void main(String[] args) {
		Traitement<ProduitLiquide> t 
		= new Traitement<ProduitLiquide>(new ProduitLiquide(), new ProduitLiquide());
		
		System.out.println(t.getA().getQuantite());
		System.out.println(t.getB().getQuantite());

	}

}
