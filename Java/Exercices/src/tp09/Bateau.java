package tp09;

public class Bateau extends Vehicule implements ActionVehicule {

	public Bateau() {
		this.SetNom("Bateau");
	}

	@Override
	public boolean peutVoler() {
		return false;
	}

	@Override
	public boolean peutRouler() {
		return false;
	}

	@Override
	public boolean peutNaviguer() {
		return true;
	}
}