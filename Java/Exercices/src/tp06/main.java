package tp06;

public class main {

	public static void main(String[] args) {
		Sport foot = new Sport("Football", Type.EQUIPE, true, "Jeu en équipe de 11 avec un balon. Le but est de faire rentrer le balon dans le but adverse");
		Sport natation = new Sport("Natation", Type.INDIVIDUEL, true, "Epreuve de nage sur uen distance prédéfinie");
		Sport tennis = new Sport("Tennis", Type.INDIVIDUEL_ET_EQUIPE, true, "Jeu individuelle ou par 2 avec une raquette et une bale, sur une terrai apelé cours");
		
		foot.afficher();
		natation.afficher();
		tennis.afficher();
	}

}
