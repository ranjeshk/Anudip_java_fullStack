

import java.util.*;

public class SumOfEntered {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers to sum");
		long input = scan.nextLong();
		long sum = 0;
		while (input > 0) {
			long digit = input % 10;
			sum += digit;
			input = input / 10;
		}
		System.out.println("sum of all integer is " + sum);
	}

}
