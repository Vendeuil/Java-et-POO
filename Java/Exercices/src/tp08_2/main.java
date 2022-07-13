package tp08_2;

public class main {

	public static void main(String[] args) {

		// Creation des o=instances d'objets
		Arme couteau = new Arme("couteau", 15);
		Arme epee = new Arme("epee", 25);
		Personnage perso1 = new Personnage("Perso1", 2, 25, couteau);
		Personnage perso2 = new Personnage("Perso2", 1, 25, epee);

		// Actions
		perso1.parler("Je suis le personnage " + perso1.getNom());
		perso1.parler("J'attaque perso2 !!");
		perso1.frapper(perso2);
		System.out.println("Vies:" + perso2.getNombreDeVies() + " - Force:" + perso2.getForce());
		perso1.frapper(perso2);
		System.out.println("Vies:" + perso2.getNombreDeVies() + " - Force:" + perso2.getForce());
	}

}
