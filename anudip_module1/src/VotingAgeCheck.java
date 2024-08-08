

import java.util.*;

//program to check voting eligibility
public class VotingAgeCheck {

	void checkAge(int _age) {
		int age = _age;
		if (age >= 18) {
			System.out.println("Eligible for voting");
		} else {
			System.out.println("NOT eligible");
		}

	}

	public static void main(String[] args) {
		// creating scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age!");
		int perAge = scan.nextInt();
		// creating instance of l
		VotingAgeCheck person = new VotingAgeCheck();
		person.checkAge(perAge);

		scan.close();

	}
}
