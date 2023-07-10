package a.b.c;

public interface ICompte { // une interface déclare directement des methodes.
	//L'interface est en général la première chose que l'on fait, il s'agit de referencer toutes les methodes qui pourront être appelé. Ensuite cette interface devra être implémenté par la class Compte. Il faut noter que si l'interface est implémenter par une class abstraite, les méthodes de l'interface n'ont pas besoin d'être redéfini dans la class abstraite mais si une claa non-abstraite tente d'implémenter l'interface, alors il faut que toutes les méthoses de l'interface soivent @Override soit elle doivent être redéfini !
	// il faut noter aussi que toutes les class filles de la class abstraite soit toutes les class dites dérivés, devront @Override les méthodes de l'interface !
	public void verser(float mt);
	public void retirer(float mt);
	public float getSolde();

}
