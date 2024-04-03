package _2_observateur;

public class AffichageStats implements Affichage ,Observateur {

	private float temperature;
	private float humidite;
	private Sujet donneesMeteo;

	



	public AffichageStats(Sujet donneesMeteo2) {
		this.donneesMeteo = donneesMeteo2;
		donneesMeteo.enregistrerObservateur(this);
	}


	public void afficher() {
		System.out.println("temperatuure Moy/Max/min   = "+ temperature);
	}


	
	

	public void actualiser(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		afficher();
	}
}
