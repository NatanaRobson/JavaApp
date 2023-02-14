package Bouteille;

import java.util.Scanner;

public class Bouteille {

	//PRIVATE ATTRIBUTS DE LA CLASSE  (semblable a des variables)
	
	//privé - retourne un string - nom de l'attribut;
		private String brand;
	private boolean locked;
	private final double capacityLitre;
	private double liquidLitre;
		
	//PUBLIC
	
	public Scanner sc = new Scanner(System.in);
	
	//Méthode constructeur => public Objet(type nom attribut 1, type nom attribut 2, etc...)
	public Bouteille(String brandS, boolean lockedS, double capacityLitreS)
	{
		this.brand = brandS;
		this.locked = lockedS;
		this.capacityLitre = capacityLitreS;
		this.liquidLitre = capacityLitreS;
	}
	
	//Operation ouverture de la bouteille
	public boolean open()
	{
		if (this.locked)
		{
			this.locked = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Operation fermeteure de la bouteille
	public boolean lock()
	{
		if (this.locked)
		{
			return false;
		}
		else
		{
			this.locked = true;
			return true;
		}
	}
	
	//Operation remplir la bouteille
	public boolean fillUp()
	{
		if (this.locked)
		{
			return  false ;
		}
		else 
		{
			liquidLitre = capacityLitre; 
			return true;
		}
	}
	//Operation vider la bouteille
	public boolean empty()
	{
		if (this.locked)
		{
			return false;
		}
		else
		{
			liquidLitre -= liquidLitre;
			return true;
		}
	}
	
	
	//Operation ajout de liquide
	public boolean add()
	{
		if (this.locked)
		{
			return false;
		}
		else
		{
				return true;
		}
	}
	
	//GET ACCESSOR
		
	//Prendre la valeur nom de l'objet
	public String getStates()
	{
		return
			"Marque :				" + this.brand 
			+ "\n Bouteille fermee :		" + this.locked
			+ "\n Capacite en L :		" + this.capacityLitre
			+ "\n Liquide en L :			" + this.liquidLitre;
	}
	
	//Ajout / versement
	public void adjustLiquidState()
	{
		this.open();
		System.out.print("\n \n Saisir la quantite a (+)ajouter ou a (-)verser en L : ");
		double a = sc.nextDouble();
		double volumeDispo = capacityLitre - liquidLitre;
		
		if(a >= 0)
		{
			if ( a > volumeDispo)
			{
				System.out.println("\n Vous ne pouvez pas ajouter plus de " + volumeDispo + "L sinon le liquide debordera!" );
				this.lock();
			}
			else
			{
				liquidLitre += a;
				this.lock();
			}
		}
		else
		{
			if(-1*a > liquidLitre)
			{
				System.out.println("Vous avez vide la bouteille! Seul " + liquidLitre + "L ont pu etre verses!");
				liquidLitre = 0;
				this.lock();
			}
			else
			{
				liquidLitre += a;
				this.lock();
			}
		}
		
	}
}
