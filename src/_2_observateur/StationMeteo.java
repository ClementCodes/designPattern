import _2_observateur.AffichagePrevisions;
import _2_observateur.AffichageStats;
import _2_observateur.AffichagesConditions;
import _2_observateur.DonneesMeteo;
public class StationMeteo {

    public static void main(String[] args) {
       
       
        DonneesMeteo donneesMeteo = new DonneesMeteo();
        AffichagesConditions affichageCond = new AffichagesConditions(donneesMeteo); 
        AffichageStats affichageStat = new AffichageStats(donneesMeteo); 
        AffichagePrevisions affichagePrev = new AffichagePrevisions(donneesMeteo);
        donneesMeteo.setMesures(26, 65, 1020); 
        donneesMeteo.setMesures(28, 70, 1012);
         donneesMeteo.setMesures(22, 90, 1012);

    }

  
}