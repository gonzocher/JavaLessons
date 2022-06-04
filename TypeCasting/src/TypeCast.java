
public class TypeCast {

	public static void main(String[] args) {
		int a = (int) 0.5;
		System.out.println(a);
		
		byte a1 = 1;
		short b;
		char c;
		int d;
		long e;
		float f;
		double g = 500.1;
		
		int ex = a1; // Java automatically converts a smaller type to a larger type
		int tex = (int) g; // Cast it to the type needed
	}

}
