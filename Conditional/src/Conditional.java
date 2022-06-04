
public class Conditional {

	public static void main(String[] args) {
		
		int a = (8 > 3) ? 7 : 3;
		
		/*
		 * same as
		 * if(8 > 3) {
		 *     a = 7;
		 * } else {
		 *     a = 3;
		 * }        
		 */
		
		System.out.println(a);
		
		String response = "howdy";
		double result = response.equals("hello") ? 0.5 : 0.25;
		System.out.println(result);
	}

}
