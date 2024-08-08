

public class BoyOverriding extends human {
	public void eating() {
		super.eating();
		System.out.println("I'm eating less! ");
	}

	public static void main(String[] args) {
		BoyOverriding boy = new BoyOverriding();
		boy.eating();
	}
}

class human {
	public void eating() {
		System.out.println(" I'm eating more!");
	}
}
