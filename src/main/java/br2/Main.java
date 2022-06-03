package br2;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {


	public static Scanner scan = new Scanner(System.in);
	public static Candidat candidat;
	
	public static void ajouter () {
		System.out.println(" ===============) Affichage (===============");
		System.out.println("                     Id                      ");
		candidat.setId(scan.next());
		System.out.println("                     Nom                       ");
		candidat.setNom(scan.next());
		System.out.println("                    Prenom                      ");
		candidat.setPrenom(scan.next());
		System.out.println("                    Email                       ");
		candidat.setEmail(scan.next());
		System.out.println("                   Adresse                       ");
		candidat.setAdresse(scan.next());
		System.out.println("                    Ville                       ");
		candidat.setVille(scan.next());
	
	}
	
	public static void miss_jour() {
		System.out.println(" ===============) Mise à jour (===============");
		System.out.println("     Quel est l'Id du candidat que vous souhaitez mettre à jour  ?          ");
		candidat.setId(scan.next());
		System.out.println("              Veuillez mettre un :               ");
		System.out.println("                     Nom                          ");
		candidat.setNom(scan.next());
		System.out.println("                    Prenom                       ");
		candidat.setPrenom(scan.next());
		System.out.println("                    Email                         ");
		candidat.setEmail(scan.next());
		System.out.println("                   Adresse                       ");
		candidat.setAdresse(scan.next());
		System.out.println("                    Ville                       ");
		candidat.setVille(scan.next());
		
		
	}
	
	public static void Supprimer() {
		System.out.println(" ---------------------Supprimer---------------------");
		System.out.println(" ----------Choisir Id du candidat----------");
		candidat.setId(scan.next());
		System.out.println(" ---------------------------------------------------");
	}
	
	public static void main(String[] args) throws SQLException {
		
		
		int choi;
		CandidatDao use = new CandidatDao();
		
		Connexion conn = new Connexion();
		do {
			
			//System.out.print("\f");
			System.out.println("                                                                 ");
			System.out.println("                                                                 ");
			System.out.println("              //                                      \\         ");
			System.out.println("             //   Liste des opérations à effectuer     \\        ");
			System.out.println("            // =========================================\\       ");
			System.out.println("           //                                            \\       ");
			System.out.println("          //                                              \\       ");
			System.out.println("                                                                 ");
			System.out.println("                                                                 ");
			System.out.println("                                                                 ");
			System.out.println("       Merci de choisir le numéro qui correspond à votre opération préférée :");
			System.out.println("                                                                 ");
			System.out.println("                         1-Ajouter      ");
			System.out.println("                         2-Afficher      ");
			System.out.println("                         3-Mettre à jour  ");
			System.out.println("                         4-Supprimer      ");
			System.out.println("                         0-Quitter          ");
			System.out.println(" ---------------------------------------------------------------------");
			
			do {
				choi = scan.nextInt();
			}while(choi < 0 && choi > 4);
			
			candidat = new Candidat();
			
			switch(choi) {
				case 1 : ajouter();
				System.out.println("Ajout bien effectué");
					use.Create(candidat);
				break;
				case 2 : 
					System.out.println(" Voici les données demandées");
					use.Read(candidat);
				break;
				case 3 : 
					miss_jour();
					use.Update(candidat);
				break;
				case 4 : 
					Supprimer();
					System.out.println("Suppression bien effectuée");
					use.Delete(candidat);
				break;
				case 0 : System.out.println("-----------------------Merci-----------------------");
						conn.connect().close();
				break;
			}
		}while(choi != 0);
		
		
	}
  
	  
}
