package fr.eni.ecole.poo.groupeeleves.demonstration;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demonstration {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		//--------------------  enregistrement des Personnes Parents ---------  //
	//	Personne parent = new Parent();
		String[] monTableauAremplirNomParent = new String[500];
		String[] monTableauAremplirPrenomParent = new String[500];
		String[] monTableauAremplirAdresseParent = new String[500];	
		String[] monTableauAremplirStatutParent = new String[500];
		Date[] monTableauAremplirDdnParent = new Date[500];
		//--------------------  enregistrement des Personnes Eleves ---------  //
	//	Personne eleve = new Eleve();
		String[] monTableauAremplirNomEleve = new String[500];
		String[] monTableauAremplirPrenomEleve = new String[500];
		String[] monTableauAremplirAdresseEleve = new String[500];	
		String[] monTableauAremplirStatutEleve = new String[500];
		String[] monTableauAremplirReferentEleve = new String[500];
		Date[] monTableauAremplirDdnEleve = new Date[500];
		//--------------------  enregistrement des Personnes Instituteur ---------  //
	//	Personne instituteur = new Instituteur();
		String[] monTableauAremplirNomInstituteur = new String[500];
		String[] monTableauAremplirPrenomInstituteur = new String[500];
		String[] monTableauAremplirAdresseInstituteur = new String[500];	
		String[] monTableauAremplirStatutInstituteur = new String[500];
		Date[] monTableauAremplirDdnInstituteur = new Date[500];
		
		// ----------------------- DEBUT De l4application ------------------------ //
		String menucomplet = ""
				+ "\nVeuillez effectuer votre choix : "
				+ "\nTapez [1] pour vérifier que 500 inscription sera possible "
				+ "\nTapez [2] pour Commencer à saisir la liste de vos invités";
		
		System.out.println(menucomplet);
		int choixList = scan.nextInt();
		
		/*----------LE CHOIX [1] permettra de verifier le nombre d'emplacement est bien de 500*/
		if (choixList == 1) {
			int[] monTableauVerif = new int[500];
			int additionTableau=0;
			int v = 0;  							//initialisation au 1er enregistrement.
			while(v<500) {							//Verification des 500 emplacements libres.
				monTableauVerif[v] = 5;
				additionTableau = (additionTableau + monTableauVerif[v]);
				System.out.println("Empty"+ v+ " : " + monTableauVerif[v]);
				v++;
			}
			
			System.out.println("");
			System.out.println(v + " Enregistrements possibles");
			System.out.println("                                                 ___________________________");
			System.out.println("                                                |                           |");
			System.out.println("voici la longueur du Tableau d'enregistrement : |" + monTableauVerif.length + " -> \"[soit de 0 à 499]\" |");
			System.out.println("                                                |___________________________|");
			System.out.println("\nvoici l'addition de chacune des cases du Tableau : " + additionTableau + " , le résultat attendu est 2500");
			
		}  // fin du "if" du choix [1].
		
		if (choixList == 2) {
			String clearSoap = scan.nextLine();
			System.out.println(clearSoap);
			String info2 = ""
					+ "\n Tapez la touche [#] pour Quitter le programme à tout moment ou le continuer plus tard"
					+ "\n Commencer ou continuer votre enregistrement d'inscription : "
					+ "\n    - saisissez les informations de la personne suivant les instructions : \n";
			System.out.println(info2);
			
			int i = 0;
			while(i<500) {
				/*------initialisation des variables*/
				int memoryRest = (500-i);
				String singulier = "enregistrement possible";
				String pluriel = "enregistrements possibles";
				String ortograph;
				if (memoryRest == 1){
					ortograph = singulier;
				}ortograph=pluriel;
				String recorded = "\n\nenregistrement en base de donnée bien effectué \n\n\ncontinuer les inscriptions ?";
		
				String infoMemory = "[(info) memory] : " + (memoryRest)+" "+ ortograph;
				System.out.println(infoMemory);
				/*------------------initialisation des variables*/
				String[] instructionDeSaisieTable = new String[8];
				instructionDeSaisieTable[0] = "NOM de la Personne [..?]";
				instructionDeSaisieTable[1] = "PRENOM de la Personne [..?]";
				instructionDeSaisieTable[2] = "ADRESSE de la Personne [..?]";
				instructionDeSaisieTable[3] = "[jj/mm/AAA] DATE DE NAISSANCE de la Personne: respecter la syntaxe -> [jj/mm/AAA]";
				instructionDeSaisieTable[4] = "STATUT de la Personne (Instituteur / Eleve / Parent) [..?]";
				instructionDeSaisieTable[5] = "les inscriptions sont réservé pour les Parent/Eleve/Instituteur\nVeuillez recommencer les inscriptions";
				instructionDeSaisieTable[6] = "Quel est le NOM et Prenom de son Parent";
				instructionDeSaisieTable[7] = " Tapez [1] : Pour la liste des Parents"
											+ "\n Tapez [2] : Pour la liste des instituteurs "
											+ "\n Tapez [3] : Pour la liste des Eleves et leur Parents associés "
											+ "\n Tapez [4] : Pour rechercher une personne inscrite";

				// ---------------- début de saisie et enregistrement de variable avant affectation à une Personne
				if (i<500) {
/* Starter*/		System.out.println(instructionDeSaisieTable[4]);
					String clavierstatut = scan.nextLine();
					if (clavierstatut.equals("#")) {
						i = i +600;
						} 
						String statut = clavierstatut;
						if(statut.equalsIgnoreCase("PARENT")) {
							monTableauAremplirStatutParent[i] = statut;
							} // FIN DE IF parent
							else if(statut.equalsIgnoreCase("Instituteur")) {
								monTableauAremplirStatutInstituteur[i] = statut;
							}
							else if(statut.equalsIgnoreCase("Eleve")) {
								monTableauAremplirStatutEleve[i] = statut;
							} else {
								System.out.println(instructionDeSaisieTable[5]);
								i = i +600;
								} // -------------------------  FIN ENREGISTREMENT STATUT ---------------
				
						if (i<500) {
							System.out.println(instructionDeSaisieTable[0]);
							String claviernom = scan.nextLine(); 
						if (claviernom.equals("#")) {
							i = i +600;
						}
						String nom = claviernom;
						if(statut.equalsIgnoreCase("PARENT")) {
							monTableauAremplirNomParent[i] = nom;
							} // FIN DE IF parent
							else if(statut.equalsIgnoreCase("Instituteur")) {
								monTableauAremplirNomInstituteur[i] = nom;
							}
							else if(statut.equalsIgnoreCase("Eleve")) {
								monTableauAremplirNomEleve[i] = nom;
							} 
						}// -------------------------  FIN ENREGISTREMENT NOM ---------------			
						//-----
						if (i<500) {
							System.out.println(instructionDeSaisieTable[1]);
							String clavierprenom = scan.nextLine();
							if (clavierprenom.equals("#")) {
								i = i +600;
							}
							String prenom = clavierprenom;
							if(statut.equalsIgnoreCase("PARENT")) {
								monTableauAremplirPrenomParent[i] = prenom;
								} // FIN DE IF parent
								else if(statut.equalsIgnoreCase("Instituteur")) {
									monTableauAremplirPrenomInstituteur[i] = prenom;
								}
								else if(statut.equalsIgnoreCase("Eleve")) {
									monTableauAremplirPrenomEleve[i] = prenom;
									System.out.println("Important : " + instructionDeSaisieTable[6]);
									String parentDeCetteEleve = scan.nextLine();
									monTableauAremplirReferentEleve[i] = parentDeCetteEleve;
								} 
						}// -------------------------  FIN ENREGISTREMENT PRENOM ---------------
						//-----
						if (i<500) {
							System.out.println(instructionDeSaisieTable[2]);
							String clavieradresse = scan.nextLine();
							if (clavieradresse.equals("#")) {
								i = i +600;
							}
							String adresse = clavieradresse;
							if(statut.equalsIgnoreCase("PARENT")) {
								monTableauAremplirAdresseParent[i] = adresse;
								} // FIN DE IF parent
								else if(statut.equalsIgnoreCase("Instituteur")) {
									monTableauAremplirAdresseInstituteur[i] = adresse;
								}
								else if(statut.equalsIgnoreCase("Eleve")) {
									monTableauAremplirAdresseEleve[i] = adresse;
								} 
						}// -------------------------  FIN ENREGISTREMENT ADRESSE ---------------
						//-----
						if (i<500) {
							System.out.println(instructionDeSaisieTable[3]);
							String clavierddn = scan.nextLine();
							if (clavierddn.equals("#")) {
								i = i +600;
							} 
							final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							String stringDdn = clavierddn;
							Date ddn = sdf.parse(stringDdn);
							if(statut.equalsIgnoreCase("PARENT")) {
								monTableauAremplirDdnParent[i] = ddn;
								} // FIN DE IF parent
								else if(statut.equalsIgnoreCase("Instituteur")) {
									monTableauAremplirDdnInstituteur[i] = ddn;
								}
								else if(statut.equalsIgnoreCase("Eleve")) {
									monTableauAremplirDdnEleve[i] = ddn;
								} 
						} // -------------------fin enregistrement DATE DE NAISSANCE ----- //
						
				
				
			
						if(i<500) {
							System.out.println("Pour confirmer l'inscription:  Appuyez sur [ENTRER]");
							String attenteValidation = scan.nextLine();
							System.out.println(attenteValidation);
						} 
				
						if (i<500){
					
							i++;		//---------------------incrementation pour aller à la Personne suivante //
							System.out.println("\n" + recorded + "\n\n\n\n"); 
						}
						else {
							System.out.println("Pause des enregistrements");
							System.out.println("Tapez [L] pour visualiser la liste des inscrits");
							String optionListe = scan.nextLine();
							String listeAffichage = optionListe;
							if(listeAffichage.equalsIgnoreCase("L")) {
								//----------------------------------------TABLEAU DE TOUS LES INSCRIT------- //
								System.out.println(instructionDeSaisieTable[7]);
								int optionListe1 = scan.nextInt();
								if(optionListe1 == 1) {
									System.out.println("-----------------------------[ LISTE PARENTS D'ELEVES ] ----------------------");

									int a = 0;
									while(a<500) {
										if (monTableauAremplirStatutParent[a] == null) {
											a = a + 600;
											System.out.println("-----------------------------[ FIN DE LISTE DES PARENTS D'ELEVE ] ----------------------");

										}else {
											System.out.println("Parent : Date de naissance: [" + monTableauAremplirDdnParent[a] + "] Nom: " + monTableauAremplirNomParent[a] + " Prenom " + monTableauAremplirPrenomParent[a] + " Adresse " + monTableauAremplirAdresseParent[a]);
											a++;
										}
										
									}
								} // fin du Tableau liste de Parents
								if(optionListe1 == 2) {
									System.out.println("-----------------------------[ LISTE DES INSTITUTEUR  ] ---------------------------------------");

									int a = 0;
									while(a<500) {
										if (monTableauAremplirStatutInstituteur[a] == null) {
											a = a + 600;
											System.out.println("-----------------------------[ FIN DE LISTE DES INSTITUTEURS INSCRITS ] ----------------------");

										}else {
											System.out.println("Parent : Date de naissance: [" + monTableauAremplirDdnInstituteur[a] + "] Nom: " + monTableauAremplirNomInstituteur[a] + " Prenom " + monTableauAremplirPrenomInstituteur[a] + " Adresse " + monTableauAremplirAdresseInstituteur[a]);
											a++;
										}
										
									}
								} // fin du Tableau liste des Instituteurs
								if(optionListe1 == 3) {
									System.out.println("-----------------------------[ LISTE DES ELEVES ET LEURS PARENTS ASSOCIEES ] ----------------------");
									int a = 0;
									while(a<500) {
										if (monTableauAremplirStatutEleve[a] == null) {
											a = a + 600;
											System.out.println("-----------------------------[ FIN DE LISTE DES ELEVE INSCRITS ] ----------------------");

										}else {
											System.out.println("Parent : Date de naissance: [" + monTableauAremplirDdnEleve[a] + "] Nom: " + monTableauAremplirNomEleve[a] + " Prenom " + monTableauAremplirPrenomEleve[a] + " Son Parent référent : " + monTableauAremplirReferentEleve[a] + " Adresse " + monTableauAremplirAdresseInstituteur[a]);
											a++;
										}
										
									}
								} // fin du Tableau liste des Eleves
								if(optionListe1 == 4) {	
									String clavierclear2 = scan.nextLine();
									System.out.println(clavierclear2);
									System.out.println("tapez un nom pour savoir s'il est inscrit :");
									String clavierSearch = scan.nextLine();
									System.out.println(clavierSearch);
									System.out.println("Recherche en cours.....\n");
									int E1 = 0;
									String verif1 = clavierSearch;
									while (E1 < 500) {
										System.out.println("starting.....[1]");
										if (monTableauAremplirNomParent[E1].equalsIgnoreCase(verif1)) {
											System.out.println("OUI! \n" + monTableauAremplirNomParent[E1] + " " + monTableauAremplirPrenomParent[E1] + "\n est bien inscrit sur la liste !");
											System.out.println("fin de la recherche\n");
											E1 = E1 + 601;
											}
										E1++;
									}
									
									String verif2 = verif1;
									E1 = E1 * 0;
									while (E1 < 500) {
										System.out.println("starting.....[2]");
										if (monTableauAremplirPrenomParent[E1].equalsIgnoreCase(verif2)) {
											System.out.println("OUI! \n" + monTableauAremplirNomParent[E1] + " " + monTableauAremplirPrenomParent[E1] + "\n est bien inscrit sur la liste !");
											System.out.println("fin de la recherche\n");
											E1 = E1 +601;
											}
										E1++;
									}
									System.out.println("..aucun des Parent d'eleve ne portent ce nom ou prénom");
									
									String verif3 = verif2;
									E1 = E1 * 0;
									while (E1 < 500) {
										System.out.println("starting.....[3]");
										if (monTableauAremplirNomInstituteur[E1].equalsIgnoreCase(verif3)) {
											System.out.println("OUI! \n" + monTableauAremplirNomInstituteur[E1] + " " + monTableauAremplirPrenomInstituteur[E1] + "\n est bien inscrit sur la liste !");
											System.out.println("fin de la recherche\n");
											E1 = E1 + 601;
											}
										E1++;
									}
									String verif4 = verif3;
									E1 = E1 * 0;
									while (E1 < 500) {
										System.out.println("starting.....[4]");
										if (monTableauAremplirPrenomInstituteur[E1].equalsIgnoreCase(verif4)) {
											System.out.println("OUI! \n" + monTableauAremplirNomInstituteur[E1] + " " + monTableauAremplirPrenomInstituteur[E1] + "\n est bien inscrit sur la liste !");
											System.out.println("fin de la recherche\n");
											E1 = E1 + 601;
											}
										E1++;
									}
									System.out.println("..aucun des Instituteurs ne portent ce nom ou prénom");
									
									String verif5 =verif4;
									E1 = E1 * 0;
									while (E1 < 500) {
										System.out.println("starting.....[5]");
										if (monTableauAremplirNomEleve[E1].equalsIgnoreCase(verif5)) {
											System.out.println("OUI! \n" + monTableauAremplirNomEleve[E1] + " " + monTableauAremplirPrenomEleve[E1] + " "+ monTableauAremplirReferentEleve[E1] +"\n est bien inscrit sur la liste !");
											System.out.println("fin de la recherche\n");
											E1 = E1 +601;
											}
										E1++;
									}
									String verif6 = verif5;
									E1 = E1 * 0;
									while (E1 < 500) {
										System.out.println("starting.....[6]");
										if (monTableauAremplirPrenomEleve[E1].equalsIgnoreCase(verif6)) {
											System.out.println("OUI! \n" + monTableauAremplirNomEleve[E1] + " " + monTableauAremplirPrenomEleve[E1] + " "+ monTableauAremplirReferentEleve[E1] +"\n est bien inscrit sur la liste !");
											System.out.println("fin de la recherche\n");
											E1 = 601;
											}
										E1++;
									}
									System.out.println("..Pas d'élèves ni autre personne inscrite à ce nom\n");
									
					
								}  // FIN DE LA FONCTION 4 --- fin de search inscrit ----- //
								
								
								
							} // fin du if d'affichage
					
						}
				} // fin du "1er IF" Statut
			}
		}scan.close();	
	}
}



