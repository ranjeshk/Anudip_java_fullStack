

import java.util.*;

public class GreaterOfTwo {
	static double num1, num2;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = scanner.nextDouble();
		System.out.println("Enter second number");
		num2 = scanner.nextDouble();
		if (num1 > num2) {
			System.out.println(num1 + " is greater then " + num2);
		} else {
			System.out.println(num2 + " is greater then" + num1);
		}
	}

}
