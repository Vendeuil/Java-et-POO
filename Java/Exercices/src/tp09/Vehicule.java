package tp09;

public class Vehicule {

	String nom = "";
	int vitesseMax = 0;

	public Vehicule () {}
	
	public Vehicule (String nom) {
		this.nom = nom;
	}

	public Vehicule (String nom, int vitesseMax) {
		this.nom = nom;
		this.vitesseMax = vitesseMax;
	}

	public int GetVitesseMax() {return this.vitesseMax;}

	public void SetVitesseMax(int vitesseMax){this.vitesseMax = vitesseMax;}

	public String GetNom(){return this.nom;}

	public void SetNom(String nom){this.nom = nom;}
	
}
