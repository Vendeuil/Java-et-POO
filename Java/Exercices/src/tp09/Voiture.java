package tp09;

public class Voiture extends Vehicule implements ActionVehicule {

	public Voiture() {
		super("Voiture");
	}

	@Override
	public boolean peutVoler() {
		return false;
	}		

	@Override
	public boolean peutRouler() {
		return true;
	}

	@Override
	public boolean peutNaviguer() {
		return false;
	}
}