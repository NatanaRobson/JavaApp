package Ascenseur;

import java.util.Scanner;

public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String a = "fly";
		
		Scanner sc = new Scanner(System.in);

	
		Ascenseur a = new Ascenseur("Fly", 10);
		
		System.out.println(a.detectionEtats());
		
		//BOUCLE
		while( x != "stop")
		{
		String f1 = "ouvrir";
		String x = "";
		System.out.print("Quelle fonction voulez-vous appeler ? : ");
		a = sc.nextLine();
		
		a+"."+x();
		
		System.out.print("Cliquez Entree pour continuer / Saisir 'stop' pour quitter : ");
		x = sc.nextLine();
		}
		
	}

}
