
public class Switch {

	public static void main(String[] args) {

		int day = 3;
		
//		if(day == 1) {
//			System.out.println("Sunday");
//		} else if (day == 2) {
//			System.out.println("Monday");
//		} else if (day == 3) {
//			System.out.println("Tuesday");
//		} else if (day == 4) {
//			System.out.println("Wednesday");
//		}
		
// OR use switch case
		
		switch(day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			default:
				System.out.println("Not a valid day number.");
				
		}
	}

}
