package observateur.main;

import  observateur.composant.AffichagePrevisions;
import  observateur.composant.AffichageStats;
import  observateur.composant.AffichagesConditions;
import  observateur.liaison.DonneesMeteo;

public class StationMeteo {

    public static void main(String[] args) {
        StationMeteo station = new StationMeteo();
        station.simulerMesures();
    }

    public void simulerMesures() {

        // 1) des lors ou j 'ai une donnée qui change j'enregistre l information via l
        // implementation de l interface sujet'
        DonneesMeteo donneesMeteo = new DonneesMeteo();

        // 2) j'en informe le sujet pios par ma classe Affichage condition qui
        // implemente
        // l' observateur qui lui va actualiser les données
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
