

public class MultipleInDemo extends French {
	public static void main(String[] args) {
		MultipleInDemo obj1 = new MultipleInDemo();
		obj1.speak();
		obj1.speak1();
	}

}

class Germany {
	void speak() {
		System.out.println("We speak German!");
	}
}

class French extends Germany {
	void speak1() {
		System.out.println("We speak French!");
	}
}
