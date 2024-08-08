

//main public class
public class SuperDemo1 {
	public static void main(String[] args) {
		Student student1 = new Student("Ranjesh Kushwaha", 22, "A123");
		student1.display();

	}
}

//super class

class Person {
	String name;
	int age;

	// constructor of parent class
	Person(String _name, int _age) {
		name = _name;
		age = _age;
	}

	// display method of parent class
	void display() {
		System.out.println("name :" + name);
		System.out.println("age :" + age);
	}
}

//child class
class Student extends Person {
	String studentID;

	Student(String _name, int _age, String _studentID) {
		// calling super class constructor//parent class constructor
		super(_name, _age);
		studentID = _studentID;
	}

	// display method of child class
	void display() {
		// calling the display method of parent class
		super.display();
		System.out.println("studentID :" + studentID);
	}

}
