package PorteGarage;

public class PorteGarage {

	// ATTRIBUTS : (final) - private - type val retour - nom attribut
	
	private String marque;
	private boolean verrouille;
	private int degreOuverture;
	private int degreOuvertureMax;
	private int degreOuvertureMin;
	
	// METHODES PUBLIC
	
	//Appeler les etats
	public String toString()
	{
		return "Marque : 				" + this.marque +
				"\nVerrouille : 			" + this.verrouille +
				"\ndegreOuverture : 		" + this.degreOuverture;
	}
	
	//Constructeur => public - NomClasseObj(etat1,etat2,etc,...)
	public PorteGarage()
	{
		this.marque = "non renseigne!";
		this.verrouille = false;
		this.degreOuverture = 0;
		this.degreOuvertureMax = 90;
		this.degreOuvertureMin = 0;
	}
	
	public PorteGarage(String marquePG, int degreOuvertureMaxPG, int degreOuvertureMinPG)
	{
		this.marque = marquePG;
		this.verrouille = false;
		this.degreOuverture = 0;
		this.degreOuvertureMax = degreOuvertureMaxPG;
		this.degreOuvertureMin = degreOuvertureMinPG;
	}
	
	//Deverrouiller
	public boolean deverrouiller()
	{
		if(this.verrouille)
		{
			this.verrouille = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Verrouiller
	public boolean verrouiller()
	{
		if(this.verrouille || this.degreOuverture != 0)
		{
			return false;
		}
		else
		{
			this.verrouille = true;
			return true;
		}
	}
	
	// OUVRIR/FERMER
	
	//Ouvrir
	public boolean ouvrir(int degre)
	{
		int margeOuverture = this.degreOuvertureMax - this.degreOuverture;
		
		if(this.verrouille || margeOuverture  < degre)
		{
			return false;
		}
		else
		{
			this.degreOuverture += degre;
			return true;
		}
	
	}
	
	//Fermer
	public boolean fermer(int degre)
	{
		if(degre > this.degreOuverture)
		{
			return false;
		}
		else
		{
			this.degreOuverture -= degre;
			return true;
		}
	}
	
	//Ouvrir completement
	public boolean ouvrir()
	{
		if (this.verrouille || this.degreOuverture == degreOuvertureMax)
		{
			return false;
		}
		else
		{
			this.degreOuverture = this.degreOuvertureMax;
			return true;
		}
	}
	
	//Fermer completement
	public boolean fermer()
	{
		if (this.degreOuverture == this.degreOuvertureMin)
		{
			return false;
		}
		else
		{
			this.degreOuverture = this.degreOuvertureMin;
			return true;
		}
	}
	
	
	
}
