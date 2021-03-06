import java.util.Scanner;

public class Catch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your favorite number?");
		
//		try {
//			int n = scan.nextInt();
//			System.out.println(n);
//		} catch(Exception e) {
//			System.out.println("Sorry, please enter a number."); // Instead of breaking the code
//		}
//		
//		
//		OR
		
		try {
			int [] a = {4};
			System.out.println(a[1]);
			
		} catch(NullPointerException e) {
			System.out.println("Your array is null."); // Instead of breaking the code
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your index is out of bounds!");
			
		} catch(Exception e) {
			System.out.println("Something else went wrong");
		}
		
	}

}
