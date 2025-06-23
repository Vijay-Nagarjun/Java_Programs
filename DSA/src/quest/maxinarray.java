package quest;
import java.util.Scanner;
public class maxinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] numbers = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        int max = numbers[0];
	        for (int i = 1; i < n; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }
	        System.out.println("Maximum number in the array is: " + max);
	}

}
