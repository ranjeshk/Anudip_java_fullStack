

public class OnlyOddUsingFor {
	public static void main(String[] args) {
		int inputArr[] = { 2, 3, 45, 34, 23, 5, 6, 33, 2, 5, 74, 22, 44, 222, 11 };

		for (int num : inputArr) {
			if (num % 2 == 0)
				continue;
			System.out.print(num + ", ");

		}
	}

}
