/**
 * 
 */
package fr.eni.demonstration;

import java.util.Arrays;

/**
 * @author ssoeun2023
 *
 */
public class LesTableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// construction generique d'un table
		// type[] monTableau = new type[TAILLE];
		// exemple : int[] monTablea = new int[10];
		
		
		
		int[] monTableau;
		monTableau = new int[10];
		Arrays.fill(monTableau,5); // il faut l'utiliser en l'insérant après la création du tableau.
		int[] tab2 = new int[10];
		
		System.out.println(monTableau);;
		System.err.println(Arrays.toString(monTableau));
		
		System.err.println(monTableau[0]);
		
		// on peut l'initié avec ces 2 facons differentes
		String ch1 = "une chaine";
		String ch2 = new String("encore une chaine de caractere");
		
		
		char a = 'A';
		char[] ch3 = new char[5];
		char[] ch4 = { 'M', 'a', 'r', 'd', 'i' };
		
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + Arrays.toString(ch3));
		System.out.println("ch4 = " + Arrays.toString(ch4));
		
		String ch5 = new String(ch4);
		System.out.println("ch5 = " + ch5);
		
		char[] ch6 = ch2.toCharArray();
		System.out.println("ch6 = " + Arrays.toString(ch6));
		
		String ch7 = "azerty";
		String ch8 = "AZERTY";
		
		System.out.println(ch7);
		System.out.println(ch8);
		System.out.println("ch7 et ch8 identiques ? " + (ch7 == ch8));
		System.out.println("ch7 et ch8 identiques ? " + (ch7.equals(ch8)));
		System.out.println("ch7 et ch8 identiques ? " + (ch7.equalsIgnoreCase(ch8))); // vérifi l'égalite en ignorant la casse
		
		System.out.println(ch7.toUpperCase());
		
		String[] sousChaines = ch2.split("n");
		System.out.println(Arrays.toString(sousChaines));
		
		StringBuffer sb;
		sb = new StringBuffer("une chaine à taille variable");  // avec cette méthode suivie de append, la modification ou concaténation de chaine de caractère ne prend pas beaucoup de place.
		sb.append("zzzzzzzz");
		System.out.println(sb);
		
		System.out.println(ch7.hashCode());
		
		ch7 = ch7 + " zzzzzzzzz";					// ici la modification ou concaténation de la chaine de caractère prend beaucoup de mémoire avec cette méthode de concaténation contrairement à Buffer.
		System.out.println(ch7);
		System.out.println(ch7.hashCode());
		
		System.out.println(sb.indexOf("taille"));
		
		ch7 = ch7.replace('e', 'u');
		System.out.println(ch7);
		
		String chFormate = String.format("chaine formatée: %d ; %0.2f ; %s ;", 23, 45.78, "coucou");
		System.out.println(chFormate);
		
		
		
		
		
		
		
		

	}

}
