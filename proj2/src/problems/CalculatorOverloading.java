package problems;
import java.util.Scanner;
public class CalculatorOverloading {
	 static class Calculator {
	        // Method to add two integers
	        int add(int a, int b) {
	            return a + b;
	        }

	        // Method to add two doubles
	        double add(double a, double b) {
	            return a + b;
	        }

	        // Method to add three integers
	        int add(int a, int b, int c) {
	            return a + b + c;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Test 1: Add two integers
        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum (int, int): " + calc.add(a, b));

        // Test 2: Add two doubles
        System.out.print("Enter two decimal numbers: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("Sum (double, double): " + calc.add(x, y));

        // Test 3: Add three integers
        System.out.print("Enter three integers: ");
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println("Sum (int, int, int): " + calc.add(p, q, r));

        scanner.close();

	}

}
