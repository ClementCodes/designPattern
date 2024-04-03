package _2_observateur.composant;

import _2_observateur.Affichage;
import _2_observateur.Journal.Sujet;
import _2_observateur.abonné.Observateur;

public class AffichagesConditions implements Observateur, Affichage {

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
