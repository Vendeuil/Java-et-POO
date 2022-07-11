import java.util.Scanner;

public class tp01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom ?");
		String name = sc.nextLine();
		
		System.out.println("Prenom ?");
		String firstName = sc.nextLine();
		
		System.out.println("Age ?");
		int age = Integer.parseInt(sc.nextLine());
//		int age = sc.nextInt();
		
		System.out.println("Monsieur ou Madame " + name + " " + firstName + " a " + age + " ans.");
	}

}
