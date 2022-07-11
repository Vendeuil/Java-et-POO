import java.util.Scanner;

public class tp02 {
	public static void main(String[] args) {	  
		Scanner sc = new Scanner(System.in);
		
		String note;
		float average = 0f;
		
		System.out.println("Saisir la premiere note:");
		note = sc.nextLine();
		average += Float.parseFloat(note);
		
		System.out.println("Saisir la deuxieme note:");
		note = sc.nextLine();
		average += Float.parseFloat(note);
		
		System.out.println("Saisir la troisieme note:");
		note = sc.nextLine();
		average += Float.parseFloat(note);
		
		System.out.println("La moyenne des notes est " + (average/3) + "/20");
	}
}
