/**
 * 
 */
/**
 * 
 */

//*****************DEFINITION****************************
//Le pattern Stratégie définit une famille d’algorithmes, 
//encapsule chacun d’eux et les rend interchangeables. 
//Stratégie permet à l’algorithme de varier 
//indépendamment des clients qui l’utilisent

public class DesignPatternApplication {
	


	public static void main(String[] args) {
	
		
		Canard colvert = new Colvert();
		 colvert.effectuerCancan();
		 colvert.effectuerVol();
		 colvert.afficher("colvert vert qui boit un verre de vers");

	}

	
	


	
	
	
}