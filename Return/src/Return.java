
public class Return {

	public static void main(String[] args) {
		printAMessage();
		System.out.println(add(5,4));
		String alpha = "This is CRaZy LaNGuaGe.";
		System.out.println(capitalize(alpha));
		int[] awesomeArray = gimmeArrayFromInts(3, 7, 1);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
		}
		
	// Returns occur inside a method
		
	public static void printAMessage() {
		System.out.println("This is our first method!");
	}
	
	public static int add(int a, int b) {
		return (a + b);
	}
	
	public static String capitalize(String alpha) {
		return alpha.toUpperCase();
	}
	
	public static int[] gimmeArrayFromInts(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}
}
