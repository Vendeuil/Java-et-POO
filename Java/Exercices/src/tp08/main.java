package tp08;

public class main {

	public static void main(String[] args) {
		Personnage perso1 = new Personnage("Perso1", 2, 25, "Couteau");
		perso1.parler("Je suis le personnage " + perso1.getNom());
	}

}
