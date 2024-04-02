package _2_observateur;

public interface Sujet {

	public void enregistrerObservateur(Observateur o);

	public void suprrimerObservateur(Observateur o);

	public void notifierObservateurs();
}
