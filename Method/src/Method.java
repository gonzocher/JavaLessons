
public class Method {

	public static void main(String[] args) {
		welcome();
		multiply(4, 6);
		divide(24, 3);
	}

	public static void welcome() {
		System.out.println("Welcome today");
	}
	
	public static void multiply (int a, int b) {
		System.out.println(a * b);
	}
	
	public static void divide (int a, int b) {
		System.out.println(a/b);
	}
}
