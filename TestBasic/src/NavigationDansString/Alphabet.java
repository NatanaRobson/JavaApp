package NavigationDansString;

public class Alphabet {
	
	//ATTRIBUTS
	
	private String gammeComplete = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private char lettre;
	private int ind;
	private int position = ind+1;
	
	//OPERATION
	
	//constructeur par defaut
	public Alphabet()
	{
		this.lettre = 'A';
		this.ind = 0;
		this.position = ind + 1;
	}
	
	//extraire les etats
	public String etats()
	{
		return "\n lettre actuelle : " + this.lettre +
				"\n indice actuel : " + this.ind +
				"\n position actuelle : " + this.position;
	}
	
	///modif de indice en fonction de la lettre recherchee
	public int indEvo(char lettre)
	{
		while(lettre != gammeComplete.charAt(ind))
		{
			this.ind++;
			this.position = ind +1;
		}
		return this.position;
	}
	
	//Aller vers A
	public boolean versA(int shift)
	{
		if(shift <= this.ind && shift > 0)
		{
			this.ind -= shift;
			this.lettre = this.gammeComplete.charAt(this.ind);
			System.out.println("\n Action reussi !  \n Lettre actuelle : " + this.lettre);
			return true;
		}
		else
		{
			System.out.println("Action impossible");
			return false;
		}
	}

	

}
