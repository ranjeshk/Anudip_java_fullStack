

// Base class Shape
public class Shape {
	// Method to print "Drawing Shape"
	public void draw() {
		System.out.println("Drawing Shape");
	}
	public static void main(String[] args) {
		// Create a Circle object
		Circle circle = new Circle();

		// Call draw() on the Circle object
		circle.draw();
	}
}

//Subclass Circle extending Shape
class Circle extends Shape {

	@Override
	public void draw() {
		super.draw();
		System.out.println("Drawing Circle");
	}
}

