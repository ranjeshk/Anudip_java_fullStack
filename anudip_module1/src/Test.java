
import java.io.*;

class Parent1 {

	// Method inside first parent class
	void fun() {

		// Print statement if this method is called
		System.out.println("Parent1");
	}
}

class Parent2 {

	// Method inside first parent class
	void fun() {

		System.out.println("Parent2");
	}
}

class Test extends Parent1
{

	// Main driver method 
	public static void main(String args[]) {

		Test t = new Test();
		t.fun();
	}
}
