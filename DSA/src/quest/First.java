package quest;
import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a floating-point number: ");
		        double number = scanner.nextDouble();
		        int integerPart = (int) number;
		        double fractionalPart = number - integerPart;
		        System.out.println("Integer Part: " + integerPart);
		        System.out.println("Fractional Part: " + fractionalPart);
		    }
		

	}


