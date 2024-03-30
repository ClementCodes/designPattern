public abstract  class Canard  {

	
	//interface
	 protected ComportementVol comportementVol;
	 protected ComportementCancan comportementCancan;
	 
	 public Canard() {
	 }
	 public  void afficher(String param ) {
		 System.out.println("Je suis un vrai" +" " + param);
	 }
	 
	 public void effectuerVol() {
	 comportementVol.voler();
	 }
	 
	 //j'utilise la classe qui implemente mon interface afin d avoir tout 
	 //avoir toute la logique dans cette classe
	 public void effectuerCancan() {
	 comportementCancan.cancaner();
	 }
	 public void nager() {
		 System.out.println("Tous les canards flottent, "
		 		+ "même les leurres!");
	 }
}