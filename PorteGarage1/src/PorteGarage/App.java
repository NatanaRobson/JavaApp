package PorteGarage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PorteGarage LeGrand = new PorteGarage("LeGrand", 90, 0);

		//Etats initiaux
		System.out.println("Etats initiaux \n" + LeGrand);
		
		//Fermer completement alors que deja ferme
		LeGrand.fermer();
		System.out.println("\n Fermer completement alors que deja ferme \n" + LeGrand);
		
		//Fermer d'un certain degre alors que deja ferme
		LeGrand.fermer(15);
		System.out.println("\n Fermer d'un certain degre alors que deja ferme \n" + LeGrand);
		
		//Verrouiller
		LeGrand.verrouiller();
		System.out.println("\n Verrouiller  \n" + LeGrand);
		
		//Verrouiller alors que deja verrouiller
		LeGrand.verrouiller();
		System.out.println("\n Verrouiller alors que deja verrouille \n" + LeGrand);
		
		//Ouvrir un certain degre alors que verrouille
		LeGrand.ouvrir(15);
		System.out.println("\n Ouvrir un certain degre alors que verrouille \n" + LeGrand);
		
		//Ouvrir totalement alors que verrouille
		LeGrand.ouvrir();
		System.out.println("\n Ouvrir totalement alors que verrouille \n" + LeGrand);
		
		//Deverrouiller + ouvrir certain degre
		LeGrand.deverrouiller();
		LeGrand.ouvrir(33);
		System.out.println("\n Deverrouiller + ouvrir certain degre \n" + LeGrand);
		
		//Verrouiller alors que ouvert
		LeGrand.verrouiller();
		System.out.println("\n Verrouiller alors que ouvert \n" + LeGrand);
		
		//Fermer certain degre superieur au degre ouverture
		LeGrand.fermer(45);
		System.out.println("\n Fermer certain degre superieur au degre ouverture \n" + LeGrand);
		
		//Fermer un certain degre
		LeGrand.fermer(15);
		System.out.println("\n Fermer un certain degre \n" + LeGrand);
		
		//Ouvrir un degre superieur a marge ouverture
		LeGrand.ouvrir(90);
		System.out.println("\n Ouvrir un degre superieur a marge ouverture \n" + LeGrand);
		
		//Ouvrir completement
		LeGrand.ouvrir();
		System.out.println("\n Ouvrir completement \n" + LeGrand);
		
		//Ouvrir un certain degre alors que ouvert au max
		LeGrand.ouvrir(3);
		System.out.println("\n Ouvrir un certain degre alors que ouvert au max \n" + LeGrand);
		
		//Fermer totalement + verrouiller
		LeGrand.fermer();
		LeGrand.verrouiller();
		System.out.println("\n Fermer totalement + verrouiller \n" + LeGrand);
		
		
		
	}

}
