

import java.util.*;

public class IntegerCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Integer!");
		int input = scan.nextInt();

		if (input > 0) {
			System.out.println(input + " is positive Integer!");
		} else if (input < 0) {
			System.out.println(input + " is Negative Integer!");
		} else {
			System.out.println(input + " is Zero!");
		}
	}
}
