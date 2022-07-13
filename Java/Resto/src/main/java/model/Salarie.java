package Models;

public class Salarie {
	int id;//pk
	String nom;
	String prenom;
	double salaire;
	String code_restaurant;//fk
	public Salarie(int id, String nom, String prenom, String code_restaurant) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.code_restaurant = code_restaurant;
	}
}
