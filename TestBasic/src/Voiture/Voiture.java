package Voiture;

public class Voiture {

	// - ATTRIBUTS voiture
	
		private String marque;
		private String modele;
		private int annee;
		private boolean neuf;
		
		// + OPERATION
		
			// constructeur classic
			public Voiture(String marqueV, String modeleV, int anneeV, boolean neufV)
			{
				this.marque = marqueV;
				this.modele = modeleV;
				this.annee = anneeV;
				this.neuf = neufV;
			}
			
			// reccup des donnees de la voiture
			public String description()
			{
				return "marque : " + this.marque + 
						"\n modele : " + this.modele +
						"\n anne : " + this.annee +
						"\n neuf : " + this.neuf;
			}
			
			// def de la marque
			public void defMarque(String defMarqueV)
			{
				this.marque = defMarqueV;
			}
			
			// def du modele
			public void defModel(String defModeleV)
			{
				this.modele = defModeleV;
			}
			
			// def annee
			public void defAnnee(int anneeV)
			{
				this.annee = anneeV;
			}
			
}
