package exemples;

public class Humain extends EtreVivant implements Informations {
	
	public String sexe;
	
	// nom + categorie
	
	public Humain() {
		super("Categorie Humain");
	}

	@Override
	public String afficherInfos() {
		return this.getCategorie();
	}

	@Override
	public int afficherDUreeVie() {
		return 75;
	}

	@Override
	public boolean estVivant() {
		return true;
	}

}
