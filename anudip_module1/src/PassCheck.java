

import java.util.*;

public class PassCheck {

	public static void main(String[] args) {
		String x = "tom";
		String y = "harry";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter UserName");
		String uName = scan.next();
		System.out.println("Enter password!");
		String upass = scan.next();

		if ((uName.equals(x) && upass.equals(y)) || (uName.equals(y)) && upass.equals(x)) {
			System.out.println("welcome");
		} else {
			System.out.println("invalid");
		}
	}

}
