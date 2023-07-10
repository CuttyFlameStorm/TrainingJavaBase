/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author ssoeun2023
 *
 */
public class ChequesVbaseDonnees {
	
	public static double infoBaseDeDonnee(double sNEC,double d1,double d2,double d3, double d4,double d5,double d6,double d7,double d8,double d9,double d10,double d11,double d12,double d13,double d14,double d15,double d16,double d17,double d18,double d19,double d20,double d21,double d22,double d23,double d24,double d25,double d26,double d27,double d28,double d29,double d30) {		
		if(sNEC==1){return d1;}if(sNEC==2){return d2;}if(sNEC==3){return d3;}if(sNEC==4){return d4;}if(sNEC==5){return d5;}if(sNEC==6){return d6;}if(sNEC==7){return d7;}if(sNEC==8){return d8;}if(sNEC==9){return d9;}if(sNEC==10){return d10;}if(sNEC==11){return d11;}if(sNEC==12){return d12;}if(sNEC==13){return d13;}if(sNEC==14){return d14;}if(sNEC==15){return d15;}if(sNEC==16){return d16;}if(sNEC==17){return d17;}if(sNEC==18){return d18;}if(sNEC==19){return d19;}if(sNEC==20){return d20;}if(sNEC==21){return d21;}if(sNEC==22){return d22;}if(sNEC==23){return d23;}if(sNEC==24){return d24;}if(sNEC==25){return d25;}if(sNEC==26){return d26;}if(sNEC==27){return d27;}if(sNEC==28){return d28;}if(sNEC==29){return d29;}if(sNEC==30){return d30;}
		return 0;
	} // fin de la fonction infoBaseDeDonnee

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		float d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0,d8=0,d9=0,d10=0,d11=0,d12=0,d13=0,d14=0,d15=0,d16=0,d17=0,d18=0,d19=0,d20=0,d21=0,d22=0,d23=0,d24=0,d25=0,d26=0,d27=0,d28=0,d29=0,d30=0;
		
		int sNEC; // search numéro enregistrement du chèque
		Scanner scan = new Scanner(System.in);
		System.out.println("souhaitez-vous vous connecter à la base de donnée ?");
		System.out.println("ou");
		System.out.println("souhaitez-vous saisir des chèques ?");
		System.out.println("Tapez [1] pour la base de donnée");
		System.out.println("Tapez [2] pour la saisie des chèques");
		int choixConnexion = scan.nextInt();	
		// -------------------------- DISPATCHEUR DE CONNEXION -----------------------------------  //	
/*if*/	if (choixConnexion == 1) {
		System.out.println("Pas de données enregistré actuellement");
		System.out.println("Relancez le programme et faites le Choix [2] pour avoir des enregistrements");
		} 	
		else if (choixConnexion == 2){
		// ---------------------------   Welcome page -------------------------------- //
		System.out.println("\nSAUVEGARDE");
		// ---------------------------   instruction ------------------- //
		String instruction = "Choix:\n- Veuillez saisir le [montant] du chèque à enregistrer: ";
		String retourMenu = "\n- Tapez la touche ZERO [0] pour Quitter le programme";
		String applicationTurningOff = "Application Closed -- A Bientot --";
		// ---------------------------   BOUCLAGE ------------------- //						
		int i = 0;
		while(i < 31) {	
		int memoryRest = (30 - i);
		String singulier = "enregistrement possible";
		String pluriel = "enregistrements possibles";
		String ortograph;
		String recorded = "\n\nenregistrement en base de donnée bien effectué \nsuivant\n\nsauvegarder un autre montant ?";
		
/**/	if (memoryRest == 1){ortograph = singulier;}ortograph=pluriel;
		String message = "(info) memory : " + memoryRest+" "+ ortograph;

		System.out.println(message);
		System.out.println(instruction);
		System.out.println(retourMenu);
		int choix = scan.nextInt();
		i++;
/**/	if (choix != 0) { 
		if(i==1){d1=(float)choix;}if(i==2){d2=(float)choix;}if(i==3){d3=(float)choix;}if(i==4){d4=(float)choix;}if(i==5){d5=(float)choix;}if(i==6){d6=(float)choix;}if(i==7){d7=(float)choix;}if(i==8){d8=(float)choix;}if(i==9){d9=(float)choix;}if(i==10){d10=(float)choix;}if(i==11){d11=(float)choix;}if(i==12){d12=(float)choix;}if(i==13){d13=(float)choix;}if(i==14){d14=(float)choix;}if(i==15){d15=(float)choix;}if(i==16){d16=(float)choix;}if(i==17){d17=(float)choix;}if(i==18){d18=(float)choix;}if(i==19){d19=(float)choix;}if(i==20){d20=(float)choix;}if(i==21){d21=(float)choix;}if(i==22){d22=(float)choix;}if(i==23){d23=(float)choix;}if(i==24){d24=(float)choix;}if(i==25){d25=(float)choix;}if(i==26){d26=(float)choix;}if(i==27){d27=(float)choix;}if(i==28){d28=(float)choix;}if(i==29){d29=(float)choix;}if(i==30){d30=(float)choix;}
		System.out.println(recorded); System.out.println(recorded); 
		}if (choix == 0) {i = i + 31;}
		} // fin du while
		
		//suite du procedural
		int s = 0;
		while(s <=0 ) {
		String infoDansBdd = "tapez le numéro de l'ordre d'enregistrement entre [ 1 et 30 ] pour connaitre le montant qui à été enregistré";
		String quitProgramme = "\nTAPEZ zéro [0] pour Quitter le programme\nou";
		System.out.println(infoDansBdd);			
		sNEC = scan.nextInt();
/**/	if (sNEC > 0.0001) {
		System.out.println("voici le montant du "+ sNEC +"ème cheque enregistré \n");
		double result = infoBaseDeDonnee(sNEC,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30);
		System.out.println((float)result);
		System.out.println(quitProgramme);
/**/	} else {s+=1;}
		} // fin de la boucle while

		// ---------------------------  Demarrage Application if on ----------  //
		System.out.println(applicationTurningOff);
		scan.close();   
	}
	}
}
