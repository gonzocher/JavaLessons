
public class ForLoops {

	public static void main(String[] args) {

		System.out.println("Let's print 10 times\n");
		for (int i = 0; i < 10; i++) {
			System.out.println("I love to code " + i);
		}
		
		int[] grades = {98, 100, 76, 83, 90, 93};
		for(int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
	}

}
