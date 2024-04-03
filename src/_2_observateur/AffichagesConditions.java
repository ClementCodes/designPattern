package _2_observateur;

public class AffichagesConditions implements Observateur, Affichage {

	private float temperature;
	private float humidite;
	private Sujet donneesMeteo;

//Le constructeur de la classe(ici  public  AffichagesConditions)  prend un objet sujet
//	(donneesMeteo2) en tant que paramètre
//	et l'assigne à la variable donneesMeteo.
//	Il enregistre ensuite cette instance
//	de AffichagesConditions en tant qu'observateur 
//	auprès du sujet en appelant donneesMeteo.enregistrerObservateur(this).
//	Ainsi, chaque fois que le sujet (donneesMeteo) est mis à jour, 
//	cette instance de AffichagesConditions sera notifiée.
	public AffichagesConditions(Sujet donneesMeteo2) {
		this.donneesMeteo = donneesMeteo2;
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
