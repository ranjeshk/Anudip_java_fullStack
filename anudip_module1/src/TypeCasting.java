package pack1;

public class TypeCasting {
	public static void main(String[] args) {
		// widening type casting
		int score = 55;
		System.out.println(score);
		double newScore = score;
		System.out.println(newScore);

		// narrowing type casting

		float num = 545.3f;
		System.out.println(num);
		short newNum = (short) num;
		System.out.println(newNum);
	}

}
