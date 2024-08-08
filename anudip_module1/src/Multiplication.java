
import java.util.*;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to create the table");
		int num = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}

}
