import java.util.HashMap;

public class HashTheMap {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		int c = 88;
	
		HashMap<String, Integer> temps = new HashMap<String, Integer>();
		temps.put("a", 10);
		temps.put("b", 3);
		temps.put("c", 88);
		
		HashMap<String, String> users = new HashMap<String, String>();
		users.put("jerryjones123", "jj123pass");
		users.put("billybob1122", "bb123pass");
		users.put("happywilliams3434", "hw123pass");
		
		users.remove("billybob1122");
		users.put("sillystring", "password");
		
		System.out.println(temps);
		System.out.println("----------");
		System.out.println(temps.get("c"));
		
		System.out.println("\n" + users);
		System.out.println();
		System.out.println(users.containsValue("hw123pass")); // Or containsKey must contain complete value or key
		System.out.println(users.size());
		System.out.println(users.replace("sillystring","betterPassword"));
		System.out.println(users);
		
		// ArrayList has order, can get index.  HashMap does not.  Cannot depend on placement.
		System.out.println(users.keySet());
		System.out.println(users.values());
	
	}

}
