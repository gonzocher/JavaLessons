import java.util.Scanner;

public class GradingCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade: ");
		
		float score = scan.nextFloat();
		String grade = "None";
		
		if (score >= 0 && score <= 100) {
			if (score >= 98) {
				grade = "A+";
			} else if (score >= 93) {
				grade = "A";
			} else if (score >= 90) {
				grade = "A-";
			} else if (score >= 88) {
				grade = "B+";
			} else if (score >= 83) {
				grade = "B";
			} else if (score >= 80) {
				grade = "B-";
			} else if (score >= 77) {
				grade = "C+";
			} else if (score >= 73) {
				grade = "C";
			} else if (score >= 70) {
				grade = "C-";
			} else if (score >= 67) {
				grade = "D+";
			} else if (score >= 63) {
				grade = "D";
			} else if (score >= 60) {
				grade = "D-";
			} else if (score >=0) {
				grade ="F";
			}
			
			System.out.println("Thank you.  You're score is a " + score + " " + grade);
		} else {
			System.out.println("Please type a number between 0 and 100.");
		}
		
	}

}
