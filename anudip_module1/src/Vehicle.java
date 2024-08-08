

//superclass Vehicle
public class Vehicle {
	void move() {
		System.out.println("moving now...");
	}

	// main method execution point
	public static void main(String[] args) {
		// super class object and calling
		Vehicle vel1 = new Vehicle();
		vel1.move();

		// first child class and calling move()
		Bike bike1 = new Bike();
		bike1.move();

		// second child class and move()
		Car car1 = new Car();
		car1.move();
	}
}

//first subclass
class Bike extends Vehicle {

}

//second subclass
class Car extends Vehicle {

}
