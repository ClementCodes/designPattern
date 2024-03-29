public abstract  class Canard {

	 protected ComportementVol comportementVol;
	 protected ComportementCancan comportementCancan;
	 
	 public Canard() {
	 }
	 public abstract void afficher();
	 
	 public void effectuerVol() {
	 comportementVol.voler();
	 }
	 public void effectuerCancan() {
	 comportementCancan.cancaner();
	 }
	 public void nager() {
		 System.out.println("Tous les canards flottent, même les leurres!");
	 }
}