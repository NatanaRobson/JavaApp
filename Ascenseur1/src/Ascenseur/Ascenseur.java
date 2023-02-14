package Ascenseur;

public class Ascenseur {
	
	// ATTRIBUTS : (final pour constante) - private - type val retour - nom attribut
		private String constructeur;
	private int nombreEtages;
	private int etage;
	private boolean porteOuverte;
	private int direction;
	
	
	// METHODES PUBLIQUES
	
	//Constructeur
		public Ascenseur(String constructeurA, int nombreEtagesA)
	{
		this.constructeur = constructeurA;
		this.nombreEtages = nombreEtagesA;
		this.etage = 0;
		this.porteOuverte = false;
		this.direction = 0;
	}
	
	//Appeler les etats
	public String detectionEtats()
	{
		return 	" \n Porte ouverte :			" + this.porteOuverte +
					" \n Etage actuel  :					"	+ this.etage;
	}
	
	//Appeler constructeur objet
	public String nom()
	{
		return this.constructeur;
	}
	
	//Ouverture de la porte
	public boolean ouvrir()
	{
		if(this.porteOuverte)
		{
			return false;
		}
		else
		{
			this.porteOuverte = true;
			return true;
		}
		
	}
	
	
	//Fermeture de la porte
	public boolean fermer()
	{
		if(this.porteOuverte)
		{
			this.porteOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Appel de l'ascenseur
	public boolean appel(int etageAppel)
	{
		if(etageAppel == this.etage)
		{
			this.ouvrir();
			return true;
		}
		else
		{
			if(this.porteOuverte)
			{
				this.fermer();
				this.etage = etageAppel;
				this.ouvrir();
				return true;
			}
			else
			{
				this.etage = etageAppel;
				this.ouvrir();
				return true;
			}
		}
	}
		
		//Changer d'etage
		public boolean demandeNouvelEtage(int etageCible)
		{
			if(etageCible == etage)
			{
				return false;
			}
			else
			{
				this.fermer();
				this.etage = etageCible;
				this.ouvrir();
				return true;
			}
		}
	
}
