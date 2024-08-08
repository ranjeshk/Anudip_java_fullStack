

public class PersonOverloading {
	private String fistName;
	private String lastName;
	private int age;
	private String email;

	PersonOverloading(String fName, String lName) {
		this.fistName = fName;
		this.lastName = lName;
	}

	PersonOverloading(String fName, String lName, int _age) {
		this.fistName = fName;
		this.lastName = lName;
		this.age = _age;
	}

	PersonOverloading(String fName, String lName, int _age, String _email) {
		this.fistName = fName;
		this.lastName = lName;
		this.age = _age;
		this.email = _email;
	}

	public String getPersonInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("First Name: ").append(fistName).append("\n");
		sb.append("Last Name: ").append(lastName).append("\n");
		sb.append("Age: ").append(age).append("\n");
		sb.append("Email: ").append(email);
		return sb.toString();
	}

	public static void main(String[] args) {
		PersonOverloading per1 = new PersonOverloading("Ranjesh", "kushwaha");
		PersonOverloading per2 = new PersonOverloading("Ranjesh", "kushwaha", 22);
		PersonOverloading per3 = new PersonOverloading("Ranjesh", "kushwaha", 22, "ranjesh@gmail.com");
		System.out.println(per1.getPersonInfo());
		System.out.println(per2.getPersonInfo());
		System.out.println(per3.getPersonInfo());
	}

}
