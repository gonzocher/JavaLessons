import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		h.add("lemur");
		h.add("orangutan");
		h.add("spider monkey");
		h.add("silverback gorilla");
		System.out.println(h);
		// .remove or .clear or .contains
		System.out.println(h.isEmpty());
		
		HashSet<Integer> scores = new HashSet<Integer>();
		scores.add(13);
		scores.add(12);
		scores.add(11);

		Iterator<Integer> it = scores.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
