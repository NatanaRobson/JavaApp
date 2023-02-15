package Voiture;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Voiture maVoiture = new Voiture("Porsche", "911 gt3", 2018, true);
		
		System.out.println(maVoiture.description());
		
		maVoiture.defMarque("Ferrari");
		maVoiture.defModel("488 pista");
		maVoiture.defAnnee(2022);
		
		
		System.out.println(maVoiture.description());
	}

}
