import java.util.Scanner;

public class tp05 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		boolean readyToReplay = true;
		int min = 0, max = 0, trials = 0, randomNum, choiceNum ;

		System.out.println("===========================");
		System.out.println("===Jeu du Plus ou Moins===");
		System.out.println("===========================\n");

		// Boucle pour jouer
		while(readyToReplay) {

			// Demander à l'utilisateur l'intervalle + Control du min et max
			while(min >= max) {
				System.out.println("Quelle est l'intervalle minimum ?");
				min = sc.nextInt();
				System.out.println("Quelle est l'intervalle maximum ?");
				max = sc.nextInt();
				if(min >= max) {
					System.out.println("Erreur min >= max, veuillez redefinir l'intervalle.");
				}
			}

			// Déclaration du nombre aléatoire
			randomNum = min + (int)(Math.random() * ((max - min) + 1));
			System.out.println(randomNum);

			// Initialisation du choix utilsiateur pour entrer dans la boucle et démarrage
			choiceNum = min - 1;
			while(randomNum != choiceNum) {
				trials++;
				System.out.println("Quelle est le numero compris entre " + min + " et " + max + " ?");
				choiceNum = sc.nextInt();

				if(choiceNum < randomNum) {
					System.out.println("C'est plus...\n");
				} else if(choiceNum > randomNum) {
					System.out.println("C'est moins...\n");
				} else {
					System.out.println("Felicitations vous avez trouve en " + trials + " essai(s)\n");
				}
			}


			//Demander a l'utilisateur s'il veut rejouer
			System.out.println("Voulez vous rejouez ? (y/n)");
			String replay = sc.next();
			if(!replay.equals("y") && !replay.equals("Y")) {
				readyToReplay = false;
			} else {
				// Réinitialisation des variables
				trials = 0;
				min = 0;
				max = 0;
			}


		}
		System.out.println("===FIN DU JEU===");
		sc.close();
	}
}
