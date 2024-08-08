package pack2;

public class CalcuDemo {
	public static void main(String[] args) {
		// crating a instance of parent class
		Calculator obj1 = new Calculator();
		// calling method add()
		System.out.println(obj1.add(5, 5));

		// now creating the instance of child class
		// calling overloaded method add();
		AdavncedCalculator obj2 = new AdavncedCalculator();
		System.out.println(obj2.add(5, 5, 5));
	}

}

//superclass
class Calculator {
	int add(int _a, int _b) {
		return (_a + _b);
	}
}

//subclass
class AdavncedCalculator extends Calculator {
	int c;

	int add(int _a, int _b, int _c) {
		return (_a + _b + _c);
	}
}
