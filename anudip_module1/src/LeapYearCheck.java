

import java.util.Scanner;

public class LeapYearCheck {
	int inputYear;

	public static void main(String[] args) {
		int input;
		LeapYearCheck obj1 = new LeapYearCheck();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter year!");
		input = scan.nextInt();
		obj1.checkLeap(input);
		scan.close();
	}

	void checkLeap(int _year) {
		this.inputYear = _year;
		if ((inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0) {
			System.out.println(inputYear + " is a leap year!");
		} else {
			System.out.println(inputYear + " is not a leap year!");
		}
	}
}
