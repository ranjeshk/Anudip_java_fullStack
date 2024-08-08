

//our abstract class
abstract public class Employee {
	abstract void calculatePay();

	public static void main(String[] args) {
		// from fist class
		SalariedEmployee emp1 = new SalariedEmployee();
		emp1.calculatePay();
		// from second class
		HourlyEmployee emp2 = new HourlyEmployee();
		emp2.calculatePay();
	}
}

//first class
class SalariedEmployee extends Employee {
	@Override
	void calculatePay() {
		System.out.println(50000 + " rupees per month");

	}
}
//second class

class HourlyEmployee extends Employee {
	@Override
	void calculatePay() {
		System.out.println(500 + " rupees per hr");

	}
}
