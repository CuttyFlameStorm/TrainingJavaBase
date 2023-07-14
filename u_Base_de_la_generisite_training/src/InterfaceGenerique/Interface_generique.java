package InterfaceGenerique;

public interface Interface_generique {
	/*
	 * Concernant les interfaces generiques :
	 * 
	 * 	Dans un projet informatique, souvent on manipule plusieurs interfaces
	 * qui ont la même structure mais manipulant des types différents.
	 * 
	 * 	Par exemple on peut être contraint à créer
	 * - une interface pour gérer les catégories
	 * - une interface pour gérer les produits
	 * - une autre interface pour gérer les fournisseurs
	 * 
	 * 	Pour éviter de créer plusieurs interfaces , il est plus pratique de créer une interface
	 * générique qui prend en parametre les types manipulés.
	 * 
	 * 
	 *  Exemple d'interface générique
	 *  
	 *  package metier;
	 *  import java.util.List;
	 *  public interface IMetier<T,U> {
	 *  	public T save(T o);
	 *  	public List<T> getAll();
	 *  	public T findOne(U id);
	 *  public void delete(U id);
	 *  }
	 *  
	 *  note :
	 *  - le type T représente l'entité manipulée
	 *  - le type U représente le type de l'attribut Identifiant de l'entité.
	 *
	 * 
	 */

	// dans une interface, il n'y a pas de constructor mais 
	// il y a que des méthodfes à redefinir et qui doivent être invoqué par les class les implementants.
	

}
