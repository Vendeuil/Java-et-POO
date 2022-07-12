import java.util.Scanner;

public class exemple {

	public static void main(String[] args) {

		// Exemple 1 - Les bases
		System.out.println("Lancement du programme !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un mot");
		String motSaisi = sc.nextLine();
		System.out.println(motSaisi);
		System.out.println("Saisir un mot 2");
		String motSaisi2 = sc.nextLine();
		System.out.println(motSaisi2);
		


		// Exemple 2 - Les classes
		Ecole ecole1 = new Ecole();
		Ecole ecole2 = new Ecole("Ecole 1");
		Ecole ecole3 = new Ecole("Ecole 1", "option1", 10);
		
		System.out.println(ecole2.getNom());
		System.out.println(ecole2.getNbClasses());
		ecole2.setNbClasses(19);
		System.out.println(ecole2.getNbClasses());
		ecole2.ajouter(3);
		System.out.println(ecole2.getNbClasses());
	}

}
