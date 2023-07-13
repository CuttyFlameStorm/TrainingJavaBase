package genericite;


//il ya 2 scenarion !
	// 1er scénario est que la class Triplet reste elle même générique :
//1er scénario est que la class Triplet reste elle même générique :
// dans ce cas on va spécifier le <t> devant Triplet
public class Triplet<T> extends Couple<T>{ // on garde onc le meme type au niveau de la class generique!
	
	

}

//2eme scenario est que Triplet ne sois plus une class générique dans ce cas on remplace
// le <t> de extends Couple en précisant le tupe , exemple comme ci dessous :
//  " public class Triplet extends Couple<Date>{ ... } "  


// VOIR LES EXEMPLE DANS LES CLASS SUIVANTE	