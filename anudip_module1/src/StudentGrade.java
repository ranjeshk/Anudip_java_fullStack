

import java.util.Scanner;

public class StudentGrade {
	public static void main(String arg[]) {
		StudentGrade student1 = new StudentGrade();
		student1.grading();

	}

	void grading() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks");

		int num = scanner.nextInt();
		char grade;
		if (num > 100) {
			System.out.println("INVALID NUMBER!");
		} else if (num >= 80) {
			grade = 'A';
			System.out.println("your grade is " + grade);
		} else if (num >= 60) {
			grade = 'B';
			System.out.println("your grade is " + grade);
		} else if (num >= 40) {
			grade = 'C';
			System.out.println("your grade is " + grade);
		} else {
			System.out.println("Fail");
		}
	}

}
