package methodeGenerique_dansUneClasseStandard;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Produit implements Serializable{

	private Long idProduit;
	private String nomProduit;
	private double prix;
	
	public Produit() {
		
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	

}
