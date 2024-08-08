

import java.util.Scanner;

//program of a basic calculator
public class Calculator {
	double x;
	double y;
	double result;

//method for switch case
	void myMethod(double num1, double num2, char operation) {
		this.x = num1;
		this.y = num2;
		this.result = 0;

		switch (operation) {
		case '+':
			this.result = this.x + this.y;
			break;
		case '-':
			this.result = this.x - this.y;
			break;
		case '*':
			this.result = this.x * this.y;
			break;
		case '/':
			if (this.y != 0) {
				this.result = this.x / this.y;
			} else {
				System.out.println("Cannot divide by zero");
				return;
			}
			break;
		default:
			System.out.println("Invalid operation");
			return;
		}
		System.out.println(this.x + " " + operation + " " + this.y + " = " + this.result);
	}

	// Main method to test the instance method with user input
	public static void main(String[] args) {
		// creating scanner object
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter second number: ");
		double num2 = scanner.nextDouble();

		System.out.print("Enter operation (+, -, *, /): ");
		char operation = scanner.next().charAt(0);

		// creating the instance of calculator class to access its method
		Calculator calc = new Calculator();
		calc.myMethod(num1, num2, operation);

	}
}
