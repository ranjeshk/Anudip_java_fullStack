

public class ConstructorEx1 {
	String name;
	int rollno;

	// non parameterized
	ConstructorEx1() {
		this.name = "Ranjesh Kushwaha";
		this.rollno = 342;
	}

	// creating a parameterized constructor
	ConstructorEx1(String _name, int _roll) {
		this.name = _name;
		this.rollno = _roll;
	}

	public static void main(String[] args) {
		// creating the object

		ConstructorEx1 obj1 = new ConstructorEx1();
		System.out.println(obj1.name + " " + obj1.rollno);
		ConstructorEx1 obj2 = new ConstructorEx1("Ranjesh Kushwaha", 342);
		System.out.println(obj2.name + " " + obj1.rollno);
	}
}
