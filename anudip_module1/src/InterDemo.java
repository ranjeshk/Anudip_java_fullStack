

interface dem {
	void sayName();

}

public class InterDemo implements dem {

	@Override
	public void sayName() {
		System.out.println("Ranjesh");

	}

	public static void main(String[] args) {
		InterDemo obj1 = new InterDemo();
		obj1.sayName();
	}

}
