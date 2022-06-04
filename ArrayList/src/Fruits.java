import java.util.ArrayList;

public class Fruits {

	public static void main(String[] args) {

		// Array (need to know exact size)
		String[] fruits = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		System.out.println(fruits[1]);
		
		// ArrayList (can grow, has more methods available to use)
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Mango");
		fruitList.add("AppleBerry");
		fruitList.add("Strawberry");
		fruitList.remove("Strawberry");
		fruitList.clear();
		fruitList.add("pickleberry");
		System.out.println(fruitList.contains("Raspberry"));
		
		System.out.println(fruitList);

	}

}
