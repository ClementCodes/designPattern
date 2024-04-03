package _2_observateur;

public class AffichageStats implements Affichage ,Observateur {



	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("Afficher moyenne, minimum et maximum");
	}


	
	

    @Override
    public void actualiser(float temp, float humidite, float pression) {
        // TODO
    }
}
