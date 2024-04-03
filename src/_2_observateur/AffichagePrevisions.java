package _2_observateur;

public class AffichagePrevisions implements Observateur , Affichage {
	
	
	

	

	private float temperature;
	private float humidite;
	private Sujet donneesMeteo;


	public AffichagePrevisions(Sujet donneesMeteo2) {
		this.donneesMeteo = donneesMeteo2;
		donneesMeteo.enregistrerObservateur(this);
	}

//	public void AffichagesConditions(DonneesMeteo donneeMeteo) {
//		this.donneesMeteo = donneeMeteo;
//		donneesMeteo.enregistrerObservateur(this);
//	}

	public void actualiser(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		afficher();
	}

	public void afficher() {
		
		String prevision= "";
		
		if (temperature < 23) {
			prevision = "le temps se rafraichit !";
		}else if(temperature> 25 &&  temperature < 28) {
			prevision = "Amélioration en cours !";
		}else {	prevision = "depression bien installé!";}
		
		
		
		System.out.println("Prévision"+ prevision);
	}

}