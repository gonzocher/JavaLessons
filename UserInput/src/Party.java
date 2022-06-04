import java.util.Scanner;

public class Party {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter pokemon 1: ");
		String pokemon1 = scan.nextLine();
		
		System.out.println("Enter pokemon 2: ");
		String pokemon2 = scan.nextLine();
		
		System.out.println("Enter pokemon 3: ");
		String pokemon3 = scan.nextLine();
		
		System.out.println("Enter pokemon 4: ");
		String pokemon4 = scan.nextLine();
		
		System.out.println("Enter pokemon 5: ");
		String pokemon5 = scan.nextLine();
		
		System.out.println("Here are your pokemon: " + pokemon1 + pokemon2 + pokemon3 + pokemon4 + pokemon5);
	}

}
