package observateur.composant;

import _2_observateur.Affichage;
import _2_observateur.Journal.Sujet;
import _2_observateur.abonné.Observateur;
import java.util.Objects;

public class AffichagesConditions implements Observateur, Affichage {

	public AffichagesConditions() {
	}

	public AffichagesConditions(float temperature, float humidite, Sujet donneesMeteo) {
		this.temperature = temperature;
		this.humidite = humidite;
		this.donneesMeteo = donneesMeteo;
	}

	public float getTemperature() {
		return this.temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidite() {
		return this.humidite;
	}

	public void setHumidite(float humidite) {
		this.humidite = humidite;
	}

	public Sujet getDonneesMeteo() {
		return this.donneesMeteo;
	}

	public void setDonneesMeteo(Sujet donneesMeteo) {
		this.donneesMeteo = donneesMeteo;
	}

	public AffichagesConditions temperature(float temperature) {
		setTemperature(temperature);
		return this;
	}

	public AffichagesConditions humidite(float humidite) {
		setHumidite(humidite);
		return this;
	}

	public AffichagesConditions donneesMeteo(Sujet donneesMeteo) {
		setDonneesMeteo(donneesMeteo);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof AffichagesConditions)) {
			return false;
		}
		AffichagesConditions affichagesConditions = (AffichagesConditions) o;
		return temperature == affichagesConditions.temperature && humidite == affichagesConditions.humidite && Objects.equals(donneesMeteo, affichagesConditions.donneesMeteo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(temperature, humidite, donneesMeteo);
	}

	@Override
	public String toString() {
		return "{" +
			" temperature='" + getTemperature() + "'" +
			", humidite='" + getHumidite() + "'" +
			", donneesMeteo='" + getDonneesMeteo() + "'" +
			"}";
	}

	private float temperature;
	private float humidite;
	private Sujet donneesMeteo;

	// ********************le PATERN OBSERVATEUR*********µµµµµµµµµµµµµµµµµµµµ */

	// Définit une relation entre objet de type un - à plusieurs de façon
	// que lorsque un objet change d'etat , tous ceux qui en dependent en soient
	// notifiés
	// et soient mis a jour automatiquement

	// Le constructeur de la classe(ici public AffichagesConditions) prend un objet
	// sujet
	// (donneesMeteo2) en tant que paramètre
	// et l'assigne à la variable donneesMeteo.
	// Il enregistre ensuite cette instance
	// de AffichagesConditions en tant qu'observateur
	// auprès du sujet en appelant donneesMeteo.enregistrerObservateur(this).
	// Ainsi, chaque fois que le sujet (donneesMeteo) est mis à jour,
	// cette instance de AffichagesConditions sera notifiée.
	public AffichagesConditions(Sujet donneesMeteo2) {
		this.donneesMeteo = donneesMeteo2;
		donneesMeteo.enregistrerObservateur(this);
	}

	// methode venant d el'interface µµµµ Observateur µµµµµ
	public void actualiser(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		afficher();
	}

	// methode venant de l'interface µµµµµ Affichage µµµµµ
	public void afficher() {
		System.out.println("Conditions actuelles : " +
				temperature + " degrés C et " + humidite + " % d’humidité");
	}

}
