import java.util.Scanner;

public class tp03 {
	public static void main(String[] args) {	  
		Scanner sc = new Scanner(System.in);

		Float note;
		float sum = 0f;
		int numberOfNote = 0;
		boolean addNewNote = true;

		System.out.println("Saisir la premiere note:");
		note = sc.nextFloat();
//		sum = Float.parseFloat(note);
		numberOfNote ++;

		while (addNewNote) {
			System.out.println("Saisir une note ou Q pour quitter:");
			String response = sc.nextLine();
			if (response.equals("Q")) {
				addNewNote = false;
			} else {
				sum += Float.parseFloat(response);		// sum = sum + Float.parseFloat(response)
				numberOfNote ++;
			}
		}

		System.out.println("La moyenne des notes est " + (sum/numberOfNote));
	}
}
