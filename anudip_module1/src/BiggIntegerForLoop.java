

public class BiggIntegerForLoop {
	public static void main(String[] args) {
		int numArr[] = { 34, 3, 4, 34, 23, 4, 546, 4, 34, 56, 23, 64 };
		int biggestInt = 0;
		for (int num : numArr) {
			int currBig = num;
			if (currBig > biggestInt) {
				biggestInt = currBig;
			}
		}
		System.out.println("the biggest num is: " + biggestInt);
	}
}
