

//importing scanner class for user input
import java.util.Scanner;

public class StudentSwitch {

	public static void main(String arg[]) {
		// creating a object of this class
		StudentSwitch student1 = new StudentSwitch();
		student1.grading();

	}

	void grading() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks");

		int num = scanner.nextInt();// taking user input
		char grade;
		if (num > 100 || num < 0) {
			System.out.println("INVALID NUMBER!");
		} else {
			switch (num / 10) {
			case 10:
			case 9:
				grade = 'A';
				System.out.println("Your grade is " + grade);
				break;
			case 8:
				grade = 'B';
				System.out.println("Your grade is " + grade);
				break;
			case 7:
				grade = 'C';
				System.out.println("Your grade is " + grade);
				break;
			case 6:
				grade = 'D';
				System.out.println("Your grade is " + grade);
				break;
			default:
				grade = 'F';
				System.out.println("Your grade is " + grade);
				break;
			}
		}
		scanner.close();

	}

}
