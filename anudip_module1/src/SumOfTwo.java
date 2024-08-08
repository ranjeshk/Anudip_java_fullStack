

import java.util.*;

public class SumOfTwo {
	// java program to find sum of two numbers.
	public static void main(String[] args) {
		// creating scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number!");
		int num2 = scan.nextInt();

		System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
	}
}
