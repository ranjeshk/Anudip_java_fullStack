

public class Car2 {

	private String make;
	private String model;
	private int year;
	private String color;

	public static void main(String[] args) {
		Car2 car = new Car2();

		// Set properties
		car.setMake("Tesla");
		car.setModel("Y searies");
		car.setYear(2020);
		car.setColor("Red");

		// Get and print properties
		System.out.println("Car Details:");
		System.out.println("Make: " + car.getMake());
		System.out.println("Model: " + car.getModel());
		System.out.println("Year: " + car.getYear());
		System.out.println("Color: " + car.getColor());
	}

	// No-argument constructor
	public Car2() {
	}

	// Getter and Setter for make
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	// Getter and Setter for model
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// Getter and Setter for year
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Getter and Setter for color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
