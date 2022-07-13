package exemples;

public class Ecole {

	// Attributs
	public String nom;
	public String option;
	public int nbClasses;


	// Constructeurs
	public Ecole() { }

	public Ecole(String pNom) { 
		this.nom = pNom;
	}

	public Ecole(String pNom, String pOption, int pNbClasse) { 
		this.nom = pNom;
		this.option = pOption;
		this.nbClasses = pNbClasse;
	}


	// Methodes
	public void ajouter(int nbClasseAAjouter) {
		this.nbClasses += nbClasseAAjouter;
	}
	
    @Override
    public String toString() {
        return this.nom + " a " + this.nbClasses + " classe(s)";
    }
	

	// Getters / Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public int getNbClasses() {
		return nbClasses;
	}

	public void setNbClasses(int nbClasses) {
		this.nbClasses = nbClasses;
	}

}