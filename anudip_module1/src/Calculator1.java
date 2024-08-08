
public class Calculator1 {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add a variable number of integers
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();

      
        System.out.println("Sum of two integers: " + calc.add(10, 20));
        System.out.println("Sum of two double values: " + calc.add(10.5, 20.5));
        System.out.println("Sum of three integers: " + calc.add(1, 2, 3)); // 6
        System.out.println("Sum of variable number of integers: " + calc.add(1, 2, 3, 4, 5));
    }
}
