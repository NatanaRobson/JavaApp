package Bouteille;

import java.util.Scanner;

public class App {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	Bouteille evian = new Bouteille("Evian",true ,6 );
	
	System.out.println(evian.getStates());
	
	//Fermeture de la bouteille
	evian.lock();
	System.out.println("\n" + evian.getStates());
	
	//Ouverture de la bouteille
	evian.open();
	System.out.println("\n" + evian.getStates());
	
	//Manipulation du contenu de la bouteille
	String x = "";
	while(x != "stop")
	{
		//Ajout / versement de liquide
		evian.adjustLiquidState();
		System.out.println("\n" + evian.getStates());
		
		System.out.print("\n Continuer la manipulation de la bouteille ? entrer 'stop' pour arreter : ");
		x = sc.nextLine();
	}

	
	
	}
}