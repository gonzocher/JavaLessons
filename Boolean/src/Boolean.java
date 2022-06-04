
public class Boolean {

	public static void main(String[] args) {

		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorCount = 0;
		
		if(passedDoor) {
			System.out.println("We passed the first door!");
			doorCount +=1;
		}
		
		if(missedDoor) {
			System.out.println("We passed the second door!");
			doorCount +=1;
		}
		
		if(true) {
			System.out.println("We passed the third door!");
			doorCount +=1;
		}
		
		if(doorCount == 3) {
			passedAllDoors = true;
		}
		
		if(passedAllDoors) {
			System.out.println("Congratulations.  You passed all three doors.");
		}
	}

}
