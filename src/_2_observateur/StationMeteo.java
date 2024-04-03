package _2_observateur;

import _2_observateur.AffichagePrevisions;
import _2_observateur.AffichageStats;
import _2_observateur.AffichagesConditions;
import _2_observateur.DonneesMeteo;

public class StationMeteo {

    public static void main(String[] args) {
        StationMeteo station = new StationMeteo();
        station.simulerMesures();
    }

    public void simulerMesures() {
        DonneesMeteo donneesMeteo = new DonneesMeteo();
        AffichagesConditions affichageCond = new AffichagesConditions(donneesMeteo);
        AffichageStats affichageStat = new AffichageStats(donneesMeteo);
        AffichagePrevisions affichagePrev = new AffichagePrevisions(donneesMeteo);

        try {
            donneesMeteo.setMesures(26, 65, 1020);
            donneesMeteo.setMesures(28, 70, 1012);
            donneesMeteo.setMesures(22, 90, 1012);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la définition des mesures : " + e.getMessage());
        }
    }
}
