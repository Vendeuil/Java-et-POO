package tp08;

public class Personnage {

	// Attributs 
	protected int nombreDeVies;
	protected String nom;
	protected int force;
	protected String arme;


	// Constructeurs
	public Personnage() {}

	public Personnage(String nom, int nombreDeVies, int force, String arme) {
	    this.nom = nom;
	    this.nombreDeVies = nombreDeVies;
	    this.force = force;
	    this.arme = arme;
	  }

	


	// Methodes
	public void parler(String message) { 
		System.out.println(message);
	}



  // Getters / Setters
	public int getNombreDeVies() {
		return this.nombreDeVies;
	}

	public void setNombreDeVies(int nombreDeVies) {
		this.nombreDeVies = nombreDeVies;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return this.force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public String getArme() {
		return this.arme;
	}

	public void setArme(String arme) {
		this.arme = arme;
	}

}
