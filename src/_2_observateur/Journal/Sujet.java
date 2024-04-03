package _2_observateur.Journal;

import _2_observateur.abonné.Observateur;

//l'editeur (le journal)
public interface Sujet {

	public void enregistrerObservateur(Observateur o);

	public void suprrimerObservateur(Observateur o);

	public void notifierObservateurs();
}

// le sujet enregistre
// l'abonné soit l'observqteur

// qui