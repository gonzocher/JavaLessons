
public class Main {

	public static void main(String[] args) {
		String[] s = {"Yo!", "G'Day, Mate"};
		sayHi(); // runs the method defined below
		sayOneThing("hey");
		saySomething(s);
	}

	static void sayHi() {
		System.out.println("Hi!");
	}
	
	public static void sayOneThing(String s) {
		System.out.println(s);
	}
	
	public static void saySomething(String [] s) {
		System.out.println(s[1]);
	}
}
