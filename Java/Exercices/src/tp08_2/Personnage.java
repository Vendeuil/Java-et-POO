package tp08_2;

public class Personnage {

	// Attributs 
	protected int nombreDeVies;
	protected String nom;
	protected int force;
	protected Arme arme;


	// Constructeurs
	public Personnage() {}

	public Personnage(String nom, int nombreDeVies, int force, Arme arme) {
		this.nom = nom;
		this.nombreDeVies = nombreDeVies;
		this.force = force;
		this.arme = arme;
	}




	// Methodes
	public void parler(String message) { 
		System.out.println(message);
	}

	public void frapper(Personnage persoAttaque) {
		persoAttaque.setForce(persoAttaque.getForce()-this.getArme().getDegats());
		//System.out.println(persoAttaque.getForce());
		if (persoAttaque.getForce() <= 0) {
			persoAttaque.setNombreDeVies(persoAttaque.getNombreDeVies()-1);
			persoAttaque.setForce(25);
		}
		//System.out.println(persoAttaque.getNombreDeViess());
		if (persoAttaque.getNombreDeVies() <= 0) {
			persoAttaque.setForce(0);
			System.out.println("Le personnage " + persoAttaque.getNom() + " est mort !");
		}	
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

	public Arme getArme() {
		return this.arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

}
