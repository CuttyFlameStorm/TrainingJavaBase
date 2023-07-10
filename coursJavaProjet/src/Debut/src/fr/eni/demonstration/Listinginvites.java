/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class Listinginvites {

	/*
	public static String infoBaseDeDonnee(String sNEC,String d1,String d2,String d3, String d4,String d5,String d6,String d7,String d8,String d9,String d10,String d11,String d12,String d13,String d14,String d15,String d16,String d17,String d18,String d19,String d20,String d21,String d22,String d23,String d24,String d25,String d26,String d27,String d28,String d29,String d30) {		
		if(sNEC=="1"){return d1;}if(sNEC=="2"){return d2;}if(sNEC=="3"){return d3;}if(sNEC=="4"){return d4;}if(sNEC=="5"){return d5;}if(sNEC=="6"){return d6;}if(sNEC=="7"){return d7;}if(sNEC=="8"){return d8;}if(sNEC=="9"){return d9;}if(sNEC=="10"){return d10;}if(sNEC=="11"){return d11;}if(sNEC=="12"){return d12;}if(sNEC=="13"){return d13;}if(sNEC=="14"){return d14;}if(sNEC=="15"){return d15;}if(sNEC=="16"){return d16;}if(sNEC=="17"){return d17;}if(sNEC=="18"){return d18;}if(sNEC=="19"){return d19;}if(sNEC=="20"){return d20;}if(sNEC=="21"){return d21;}if(sNEC=="22"){return d22;}if(sNEC=="23"){return d23;}if(sNEC=="24"){return d24;}if(sNEC=="25"){return d25;}if(sNEC=="26"){return d26;}if(sNEC=="27"){return d27;}if(sNEC=="28"){return d28;}if(sNEC=="29"){return d29;}if(sNEC=="30"){return d30;}
		return "0";
	} // fin de la fonction infoBaseDeDonnee
	
	*/
	
	

	 // fin de la fonction infoBaseDeDonnee
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*-------------------------------ENONCé-----------------------------------//
		 * obligation :
		 *
		 * Fournir la liste des inscrits (NOM)
		 * Permettre la recherche si une personne est inscrite ou non
		 * De fournir la liste des inscrits triée sur le Nom
		 */
		
		// saisie entrante des 500 premières inscriptions
		
		int[] monTableauVerif = new int[500];
		int v = 0; //pour verifier s'il y a bien 500 inscription possibles
		while(v<500) {
			monTableauVerif[v] = 1;
			v++;
		}
		System.out.println(v + " enregistrement validé !");
		
		
			
		// --------------------BLOCK DECLARATION DES VARIABLES--------------------//
		
	//	String d1="",d2="",d3="",d4="",d5="",d6="",d7="",d8="",d9="",d10="",d11="",d12="",d13="",d14="",d15="",d16="",d17="",d18="",d19="",d20="",d21="",d22="",d23="",d24="",d25="",d26="",d27="",d28="",d29="",d30="";
		String Quit = "\n- Tapez la touche [Q] pour Quitter le programme";
		String applicationTurningOff = "Application Closed -- A Bientot --";
		String infoManuel = "Enregistrer \"MANUELLEMENT\" les 500 premiers invités ?";
		String infoAuto = "Enregistrer \"AUTOMATIQUEMENT\" les inviter \n";
		String recModeManuel = "Tapez [1] pour le mode Manuel";
		String recModeAuto = "Tapez [2] pour le mode automatique";
		String infoPlusModeManuel = "info: si vous choisissez le mode automatique une liste intégrale des invités vous sera présenté";
		String infoPlusModeAuto = "info: si vous choisissez le mode manuel, vous pourrez à tout instant accéder à la liste des invités déja enregistré";
		String listeInscrit = "Tapez [L] pour accéder à la liste des inscrits actuels";
		String menuSearch = "Tapez [S] pour accéder au mode \"RECHERCHE\" des inscrits par leur nom";
		String[] monTableau;
		monTableau = new String[500];
		
		
		
		//-----------------------------Application--------------------------------//
		
		
		//Block MENU **
		Scanner scan = new Scanner(System.in);
		System.out.println("souhaitez-vous : \n");
		System.out.println(infoManuel);
		System.out.println("ou");
		System.out.println(infoAuto);
		System.out.println(recModeManuel);
		System.out.println(recModeAuto);
		System.out.println("/n/n");
		System.out.println(infoPlusModeManuel);
		System.out.println(infoPlusModeAuto);
		System.out.println("..........");
		System.out.println("");
		System.out.println(listeInscrit);
		System.out.println(menuSearch);
		int choixList = scan.nextInt();
		
		//Block CONDITIONNEL **
		if (choixList == 1) {
		System.out.println("vous êtes dans le mode enregistrement MANUEL");
		System.out.println(listeInscrit);
		System.out.println(menuSearch);
		
		//BOUCLAGE MANUEL 
	/*	int i = 0;
		while(i < 500) {	
		int memoryRest = (500 - i);
		String singulier = "enregistrement possible";
		String pluriel = "enregistrements possibles";
		String ortograph;
		String recorded = "\n\nenregistrement en base de donnée bien effectué \nsuivant\n\ncontinuer les inscriptions ?";
		
		if (memoryRest == 1){ortograph = singulier;}ortograph=pluriel;
		String message = "(info) memory : " + memoryRest+" "+ ortograph;
		System.out.println(message);
		String nom = scan.nextLine();
		i++;
		if (nom != "0" || nom != "3" || nom != "4") { 
		if(i==1){d1=(String)nom;}if(i==2){d2=(String)nom;}if(i==3){d3=(String)nom;}if(i==4){d4=(String)nom;}if(i==5){d5=(String)nom;}if(i==6){d6=(String)nom;}if(i==7){d7=(String)nom;}if(i==8){d8=(String)nom;}if(i==9){d9=(String)nom;}if(i==10){d10=(String)nom;}if(i==11){d11=(String)nom;}if(i==12){d12=(String)nom;}if(i==13){d13=(String)nom;}if(i==14){d14=(String)nom;}if(i==15){d15=(String)nom;}if(i==16){d16=(String)nom;}if(i==17){d17=(String)nom;}if(i==18){d18=(String)nom;}if(i==19){d19=(String)nom;}if(i==20){d20=(String)nom;}if(i==21){d21=(String)nom;}if(i==22){d22=(String)nom;}if(i==23){d23=(String)nom;}if(i==24){d24=(String)nom;}if(i==25){d25=(String)nom;}if(i==26){d26=(String)nom;}if(i==27){d27=(String)nom;}if(i==28){d28=(String)nom;}if(i==29){d29=(String)nom;}if(i==30){d30=(String)nom;}
		System.out.println(recorded); System.out.println(recorded); 
		}if (nom == "0") {i = i + 501;}
		} // fin du while
		
		//suite du procedural
		int s = 0;
		while(s <=0 ) {
		String infoDansBdd = "tapez le nom pour connaitre si la personne est enregisté ou pas";
		String quitProgramme = "\nTAPEZ zéro [0] pour Quitter le programme\nou";
		System.out.println(infoDansBdd);			
		String sNEC = scan.nextLine();
		if (sNEC != "0") {
		System.out.println("voici le montant du "+ sNEC +"ème cheque enregistré \n");
		String result = infoBaseDeDonnee(sNEC,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30);
		System.out.println(result);
		System.out.println(quitProgramme);
		} else {s+=1;}
		} // fin de la boucle while MANUEL
		*/
		//----------------------  verification enregistrement place ------------------------//
		

		
		
		int i = 0;
		while(i < 501) {	
		int memoryRest = (501 - i);
		String singulier = "enregistrement possible";
		String pluriel = "enregistrements possibles";
		String ortograph;
		String recorded = "\n\nenregistrement en base de donnée bien effectué \nsuivant\n\ncontinuer les inscriptions ?";
		
		if (memoryRest == 1){ortograph = singulier;}ortograph=pluriel;
			String message = "(info) memory : " + memoryRest+" "+ ortograph;
			System.out.println(message);
			String nom = scan.nextLine();
			System.out.println(nom);
			i++;
			if (nom.equalsIgnoreCase("L")){
				i = i + 600; ;
			} else {
			monTableau[i]=nom;
			System.out.println(recorded); System.out.println(recorded); 
			}
			
		} // fin du while
		
		System.out.println("tapez un nom pour savoir s'il est inscrit :");
		String nom2 = scan.nextLine();
		
		int d = 0;
		while(d < 500) {
			
			if (monTableau[d].equalsIgnoreCase(nom2)) {
				System.out.println("OUI! " + monTableau[d] + " est bien inscrit sur la liste !");
				d += 505;
				}
			if(d == 499){
				System.out.println("!!!! cette personne n'est pas encore inscrte !");
				}	
			d++;
		}
		
		System.out.println("\n\nListe de toutes les personnes inscrites");
		int s = 0;
		while(s<500) {
			s++;
			if (monTableau[s] == null) {
				return;
			}
			System.out.println("nom : " + monTableau[s]);
		}
		

		
		}
			
		scan.close();
	

	}

}
































