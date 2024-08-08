

import java.util.*;

public class OddEven {
	// program to find if the user entered number is even or odd

	public static void main(String args[]) {
		int userInput;
		System.out.println("Enter Number");
		// creating Scanner object
		Scanner scanner = new Scanner(System.in);
		userInput = scanner.nextInt();
		if (userInput % 2 == 0) {
			System.out.println(userInput + " " + "is a Even number!");
		} else {
			System.out.println(userInput + " " + "is a odd number!");
		}
		scanner.close();
	}

}
