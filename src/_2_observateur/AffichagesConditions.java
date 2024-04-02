package _2_observateur;

public class AffichagesConditions implements Observateur, Affichage {

	private float temperature;
	private float humidite;
	private Sujet donneesMeteo;

	public void AffichageConditions(Sujet donneeMeteo) {
		this.donneesMeteo = donneeMeteo;
		donneesMeteo.enregistrerObservateur(this);
	}

	public void actualiser(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		afficher();
	}

	public void afficher() {
		System.out.println("Conditions actuelles : " + 
	temperature + " degrés C et " + humidite + " % d’humidité");
	}

}
