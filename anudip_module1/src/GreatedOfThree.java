import java.util.*;

//program to find greatest of 3 numbers
public class GreatedOfThree {
	public static void main(String[] args) {
		// creating scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first num");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second num");
		double num2 = scan.nextDouble();
		System.out.println("Enter the third num");
		double num3 = scan.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the gretest number!");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the gretest number!");
		} else if ((num1 == num2) && (num2 == num3)) {
			System.out.println("all are equal!");
		} else {
			System.out.println(num3 + " is the greated number!");
		}
		scan.close();
	}

}
