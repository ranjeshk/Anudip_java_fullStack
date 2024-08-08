

public class Employees {
	int empCode;
	String empName;
	String empCity;

	public Employees(int code, String name, String city) {
		this.empCode = code;
		this.empName = name;
		this.empCity = city;
	}

	public String toString() {
		return empCode + " " + empName + " " + empCity;
	}

	public static void main(String[] args) {
		Employees e1 = new Employees(10, "Suraj", "Mumbai");
		System.out.println(e1);
		Employees e2 = new Employees(12, "Ashi", "Thane");
		System.out.println(e2);
	}
}
