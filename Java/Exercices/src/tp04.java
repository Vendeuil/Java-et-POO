import java.util.Scanner;

public class tp04 {
	public static void main(String[] args) {	  
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez un nombre entier:");
		int number = sc.nextInt();

		// If 0
		if (number == 0) {
			System.out.println("Le nombre est zero (et il est pair)");
		}

		else {
			// Test positive or negative
			if (number < 0) {
				System.out.print("Le nombre est negatif ");
			}
			else {
				System.out.print("Le nombre est positif ");
			}

			// Test if /2 with rest
			if (number % 2 == 0) {
				System.out.println("et pair");
			}
			else {
				System.out.println("et impair");
			}
		}
	}
}
