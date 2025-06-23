package newJava;
import java.util.Scanner;  
public class allconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);  

		        // Part 1: Grade based on marks  
		        System.out.print("Enter your marks: ");  
		        int marks = scanner.nextInt();  
		        char grade;  

		        if (marks >= 90) {  
		            grade = 'A';  
		        } else if (marks >= 80) {  
		            grade = 'B';  
		        } else if (marks >= 70) {  
		            grade = 'C';  
		        } else if (marks >= 60) {  
		            grade = 'D';  
		        } else {  
		            grade = 'F';  
		        }  

		        System.out.println("Your grade is: " + grade);  

		        // Part 2: Drink selection using switch  
		        System.out.println("Choose a drink: 1. Coffee, 2. Tea, 3. Milk");  
		        int choice = scanner.nextInt();  

		        switch (choice) {  
		            case 1:  
		                System.out.println("You selected Coffee");  
		                break;  
		            case 2:  
		                System.out.println("You selected Tea");  
		                break;  
		            case 3:  
		                System.out.println("You selected Milk");  
		                break;  
		            default:  
		                System.out.println("Invalid choice");  
		        }  

		        scanner.close();  
		    
		
		
	}

}
