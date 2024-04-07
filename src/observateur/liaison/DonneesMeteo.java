package observateur.liaison;

import java.util.ArrayList;

import _2_observateur.Journal.Sujet;
import _2_observateur.abonné.Observateur;

//µµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµ   Sujet est l"editeur
//des lors ou j'ai une donnée qui change j 'en informe le sujet via l observateur '
public class DonneesMeteo implements Sujet {

	private ArrayList<Observateur> observateurs;
	private float temperature;
	private float humidite;
	private float pression;

	public DonneesMeteo() {
		observateurs = new ArrayList<>();
	}

	// Methode venant de l'interface Sujet
	@Override
	public void enregistrerObservateur(Observateur o) {

		observateurs.add(o);
	}

	// Methode venant de l'interface Sujet
	@Override
	public void suprrimerObservateur(Observateur o) {
		int i = observateurs.indexOf(o);
		if (i >= 0) {
			observateurs.remove(i);
		}

	}

	// Methode venant de l'interface Sujet
	@Override
	public void notifierObservateurs() {
		observateurs.stream()

				// atention ici µµµµµµµµµµµµµµµµµµµµµ actulaiser est le actualiser de l'intrface
				// observateur
				.forEach(observateur -> (observateur).actualiser(temperature, humidite, pression));
	}

	public void actualiserMesures() {
		this.notifierObservateurs();
	}

	public void setMesures(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		this.pression = pression;
		actualiserMesures();
	}

	public void getTemperature() {
		// TODO document why this method is empty
	}

	public void getHumidite() {
		// TODO document why this method is empty
	}

	public void getPression() {
		// TODO document why this method is empty
	}

}