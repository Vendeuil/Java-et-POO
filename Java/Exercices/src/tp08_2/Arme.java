package tp08_2;

public class Arme {

	protected String nom;
	protected int degats;
	protected Niveau niveau;



	
	
	public Arme(String nom, int degatsInfliges) {
		this.nom = nom;
		this.degats = degatsInfliges;
		this.niveau = Niveau.DEBUTANT;
	}



	
	public void changerNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	
	public int infligerDegats() {
		switch (this.niveau) {
			case DEBUTANT: return this.degats;
			case INTERMEDIAIRE: return this.degats*2;
			case EXPERT: return this.degats*3;
		}
		return 0;
	}




	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDegats() {
		return degats;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}



}