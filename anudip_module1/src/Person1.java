

public class Person1 {
	private String firstName;
	private String lastName;
	private int age;
	private String email;

	public static void main(String[] args) {
		// Create an instance of Person
		Person1 per = new Person1();

		// Set properties
		per.setFirstName("Ranjesh");
		per.setLastName("Kushwaha");
		per.setAge(22);
		per.setEmail("ranjesh@gmail.com");

		// Get and print properties
		System.out.println("First Name: " + per.getFirstName());
		System.out.println("Last Name: " + per.getLastName());
		System.out.println("Age: " + per.getAge());
		System.out.println("Email: " + per.getEmail());
	}

	// No-argument constructor
	public Person1() {
	}

	// Getter and Setter for firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter and Setter for lastName
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Getter and Setter for age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Getter and Setter for email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
