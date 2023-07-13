package methodeGenerique_dansUneClasseStandard;

@SuppressWarnings("serial")
public class ProduitLiquide extends Produit implements Cloneable{

	private int quantite;
	
	public ProduitLiquide() {
		
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	

}
