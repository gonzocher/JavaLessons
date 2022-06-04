
public class StringInteger {

	public static void main(String[] args) {

		String s = "102";
		
		System.out.println(s + 4);
		System.out.println("Oh, that's not right.  Let's turn it into an integer before doing math.");
	
		System.out.println(Integer.parseInt(s) + 4);
		
		int n = Integer.parseInt(s);
		System.out.println(n + 5);
		
		System.out.println(Integer.toString(n) + 1);
		
		String p = "age: 47";
		p = p.replaceAll("\\D+",""); // Pulls the digits from the String
		System.out.println(p);
		
		n = Integer.parseInt(p); // Or do it this way
		System.out.println(n + 16);
	}

}
