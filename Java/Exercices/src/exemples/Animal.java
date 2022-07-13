package exemples;

public class Animal extends EtreVivant implements Informations {
	
	// nom + categorie
	
	public Animal() {
		this.categorie = "Categorie Animal";
	}
	
	public Animal(String nom) {
		this.categorie = "Categorie Animal";
		this.nom = nom;
	}

	@Override
	public String afficherInfos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int afficherDUreeVie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean estVivant() {
		// TODO Auto-generated method stub
		return false;
	}

}
