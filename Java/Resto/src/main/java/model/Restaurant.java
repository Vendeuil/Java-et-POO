package Models;

public class Restaurant {
	String code;//pk
	String nom;
	String adresse;
	int nbr_table;
	boolean statut;
	Salarie[] staff;
	Menu[] menus;
	public Restaurant(String code, String nom, String adresse) {
		this.code = code;
		this.nom = nom;
		this.adresse = adresse;
	}
	public String getCode() {
		return code;
	}
//	public void setCode(String code) {
//		this.code = code;
//	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
