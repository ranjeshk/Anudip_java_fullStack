public class AdForLoopInteger {
	public static void main(String[] args) {
		int inputArr[] = { 2, 4, 45, 3, 4, 35, 3, 43, 0, 4, 3, 6, 3 };

		for (int num : inputArr) {
			if (num == 0)
				break;
			System.out.print(num + ", ");
		}

	}
}
