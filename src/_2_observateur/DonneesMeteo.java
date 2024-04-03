package _2_observateur;

import java.util.ArrayList;

public class DonneesMeteo implements Sujet {

	private ArrayList<Observateur> observateurs;
	private float temperature;
	private float humidite;
	private float pression;

	public DonneesMeteo() {
		observateurs = new ArrayList<Observateur>();
	}

	

	@Override
	public void enregistrerObservateur(Observateur o) {
		// TODO Auto-generated method stub
		observateurs.add(o);
	}

	@Override
	public void suprrimerObservateur(Observateur o) {
		int i = observateurs.indexOf(o);
		if (i >= 0) {
			observateurs.remove(i);
		}

	}

	@Override
	public void notifierObservateurs() {
		observateurs.stream()
				.forEach(observateur -> ((Observateur) observateur).actualiser(temperature, humidite, pression));
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
		// TODO Auto-generated method stub

	}

	public void getHumidite() {
		// TODO Auto-generated method stub

	}

	public void getPression() {
		// TODO Auto-generated method stub

	}

}