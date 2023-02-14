package TabCartelABCM;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//VAR
		
		Scanner scs = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int indn = 0;	// indice position du nom
		int ind; 		// indice = (N° élément) - 1 		// indice de recherche
		int oc = 0;		// Nbr de répétition d'une valeur
		String nd;		// Nom du dealer
	
		
		// CREATION TABLEAUX AVEC INITIALISATION DONNEES
		
			//Noms
		
			
		
		/* String[] Noms = new String[4];
		
		
			Noms[0] = "Kev";
			Noms[1] = "Flo";
			Noms[2] = "Nat";
			Noms[3] = "NounoursS";
		*/	
			
		String[] Noms = {"Kev", "Flo", "Nat", "NounoursS"};
		
			//Postes
		
		String[] Postes = new String[4];
		
			//Specialites
		
		String[] Spec = {"Meth", "Plante_botanic", "Papier_sulf", "Farine"};
		
	
		
		
		//PROG
		
		for(ind=0 ; ind < Noms.length ; ind++) {
			System.out.println("Code dealer : " + (ind+1) + "| Nom : " + Noms[ind]);
		}
		
		ind=0;
		
		for(ind = 0 ; ind < Noms.length ; ind++) { 
		
			System.out.print("\n Saisir le poste conquis par " + Noms[ind] + " : ");
			String p = sc.next();
			
			System.out.println("\n" + Noms[ind] + " a ete promu au poste de " + p);
			
			Postes[ind] = p;
			
			System.out.print("\n En resume => L'indice " + ind + "* correspond au dealer " + Noms[ind] + "* promu au Poste : " + Postes[ind] + "\n");
		}
		System.out.println("\n EQUIPE ACTUELLE : \n");
		
		ind = 0;
		
		for(ind = 0 ; ind < Noms.length ; ind++) {
			System.out.println("=> " + Noms[ind] + " au poste de " + Postes[ind]);
		}
		
		System.out.print("\n Voulez-vous consulter les specialites ? : ");
		String rep = scs.next();
		
		if(rep.equals("oui")){
			
			System.out.print("\n Saisir le nom du dealer dont vous voulez connaitre la specialite : ");
			nd = sc.next();
			
			ind = 0;
			
			
			while(ind <= Noms.length && oc == 0) {
				if (Noms[ind].equals(nd)) {
					oc++;
				}
				else {
					ind++;
				}
			}
			if ( oc == 0) {
				System.out.print(nd + " ne fait pas parti des dealer...");
			}
			else {
				System.out.print("La specialite de " + nd + " => " + Spec[ind]);
			}	
		}
		else{
			System.out.print("\n MERCI D'AVOIR CHOISI NOS SERVICES, BISOUX");
		}
		
		
	}
		

}

