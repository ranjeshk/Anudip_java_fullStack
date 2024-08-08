//importing scanner class for user input
import java.util.Scanner;

public class MarksGrading {
	public static void main(String arg[]) {
		// creating a object of this class
		MarksGrading student1 = new MarksGrading();
		student1.grading();

	}

	void grading() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks");

		int num = scanner.nextInt();// taking user input
		char grade;
		if (num > 100 || num < 0) {
			System.out.println("INVALID NUMBER!");
		} else if (num >= 90) {
			grade = 'A';
			System.out.println("your grade is " + grade);
		} else if (num >= 80) {
			grade = 'B';
			System.out.println("your grade is " + grade);
		} else if (num >= 70) {
			grade = 'C';
			System.out.println("your grade is " + grade);
		} else if (num >= 60) {
			grade = 'D';
			System.out.println("your grade is " + grade);
		} else if (num <= 59) {
			grade = 'F';
			System.out.println("your grade is " + grade);
		} else {
			System.out.println("Fail");
		}
		scanner.close();

	}

}
